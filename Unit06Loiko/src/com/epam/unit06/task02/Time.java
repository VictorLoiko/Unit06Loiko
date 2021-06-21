package com.epam.unit06.task02;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = (hours>23 || hours<0) ? 0 : hours;
        this.minutes = (minutes>59 || minutes<0) ? 0 : minutes;
        this.seconds = (seconds>59 || seconds<0) ? 0 : seconds;
    }

    public void setHours(int hours) {
        this.hours = (hours>23 || hours<0) ? 0 : hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = (minutes>59 || minutes<0) ? 0 : minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = (seconds>59 || seconds<0) ? 0 : seconds;
    }

    public void getTime() {
        System.out.printf("Your time: %02d:%02d:%02d\n", hours, minutes, seconds);
    }

    public void addSeconds(int s){
        seconds += s;
        minutes += seconds/60;
        seconds%=60;
        hours += minutes/60;
        minutes%=60;
        hours%=24;
    }

    public void addMinutes (int minutes){
        addSeconds(minutes*60);
    }

    public void addHours (int hours){
        addSeconds(hours*3600);
    }

}
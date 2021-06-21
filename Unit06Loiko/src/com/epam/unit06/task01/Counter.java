package com.epam.unit06.task01;

class Counter {
    private int counter;
    private int lowerBoundary;
    private int upperBoundary;

    public Counter() {
        this.counter = 0;
        this.lowerBoundary = 0;
        this.upperBoundary = 100;
    }

    public Counter(int counter) {
        this.counter = counter;
        this.lowerBoundary = 0;
        this.upperBoundary = 100;
    }

    public Counter(int counter, int lowerBoundary, int upperBoundary) {
        this.counter = counter;
        this.lowerBoundary = lowerBoundary;
        this.upperBoundary = upperBoundary;
    }

    public int getCounter() {
        return counter;
    }

    public int[] getState(){
        return new int[]{counter, lowerBoundary, upperBoundary};
    }

    public void increaseCounter(){
        counter = (counter == upperBoundary) ? lowerBoundary : counter+1;
    }
    public void decreaseCounter(){
        counter = (counter == lowerBoundary) ? upperBoundary : counter-1;
    }
}

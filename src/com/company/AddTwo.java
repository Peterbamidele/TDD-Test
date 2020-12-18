package com.company;

public class AddTwo {
    private int firstNumber;
    private  int secondNumber;

    public AddTwo(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(int number) {
        this.firstNumber = number;
    }

    public int getFirstNumber() {

        return firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;

    }

    public int getSecondNumber() {

        return secondNumber;
    }

    public int addTwoNumber(int firstNumber, int secondNumber) {
        int result = 0;

        result = firstNumber + secondNumber;


        return  result;
    }

    public int subtractNumber(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public int multipleNumber(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public long divideNumber(int firstNumber, int secondNumber) {
        long result =  Math.round((double) firstNumber / secondNumber);
        return result;
    }


}

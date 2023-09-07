package com.example.springcore.aspectj;

public class MethodParams {

    private final String paramOne;
    private final String paramTwo;

    public MethodParams(String paramOne, String paramTwo) {
        this.paramOne = paramOne;
        this.paramTwo = paramTwo;
    }

    @Override
    public String toString() {
        return "MethodParams{" +
                "paramOne='" + paramOne + '\'' +
                ", paramTwo='" + paramTwo + '\'' +
                '}';
    }

    public String getParamOne() {
        return paramOne;
    }

    public String getParamTwo() {
        return paramTwo;
    }
}

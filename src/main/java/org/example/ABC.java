package org.example;

public class ABC implements Company{


    @Override
    public void name() {
        System.out.println("ABC IS COMPANY");
    }

    @Override
    public double setCurrValue(double value) {
        return 11*value;
    }


}

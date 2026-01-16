package org.example;

public class KBC implements Company{
    @Override
    public void name() {
        System.out.println("KBC IS COMPANY");
    }

    @Override
    public double setCurrValue(double value) {
        return 10*value;
    }
}


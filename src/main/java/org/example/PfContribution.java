package org.example;

import org.springframework.stereotype.Component;

@Component
public class PfContribution {
    private double percentage_value;

    public double getPercentage_value() {
        return percentage_value;
    }

    public void setPercentage_value(int salary) {
percentage_value=  0.10*salary;
    }
}

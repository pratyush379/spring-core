package org.example;

public class SalaryService {

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    private int minSalary ;

    private TaxService taxService;

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public double finalSalary(double salary) {
        return salary - taxService.getTax(salary);
    }
}

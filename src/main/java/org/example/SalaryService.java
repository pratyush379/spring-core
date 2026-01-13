package org.example;

public class SalaryService {

    private TaxService taxService;

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public double finalSalary(double salary) {
        return salary - taxService.getTax(salary);
    }
}

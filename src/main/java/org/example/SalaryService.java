package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//added to show annotation based config
public class SalaryService {
    @Autowired
    private PfContribution pfContribution ;//added to show annotation based config
    private  double PfAmount ;
    private int minSalary ; // xml based injection
    private TaxService taxService; // xml based injection

    private Company company;

    public double getPfAmount() {

        return pfContribution.getPercentage_value();
    }

    public void setPfAmount(int salary) {
        pfContribution.setPercentage_value(salary);
    }

    public PfContribution getPfContribution() {
        return pfContribution;
    }

    public void setPfContribution(PfContribution pfContribution) {
        this.pfContribution = pfContribution;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }


    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public double finalSalary(double salary) {
        return salary - taxService.getTax(salary);
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public double getCurrencyValue(double salary){
        return company.setCurrValue(salary);
    }

    public  void printCompanyName(){
        company.name();
    }
}

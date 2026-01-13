package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        SalaryService service =
                (SalaryService) context.getBean("salaryService");

        System.out.println(service.finalSalary(50000));
        System.out.println(service.getMinSalary());
    }
}

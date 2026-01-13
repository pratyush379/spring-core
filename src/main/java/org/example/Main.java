package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

       /* ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");*/

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);


     /*   SalaryService service =
                (SalaryService) context.getBean("salaryService");*/

        SalaryService service =
                context.getBean(SalaryService.class);

        System.out.println(service.finalSalary(50000));
        System.out.println(service.getMinSalary());
        System.out.println(service.getPfContribution());
        service.setPfAmount(service.getMinSalary());
        System.out.println(service.getPfAmount());
    }
}

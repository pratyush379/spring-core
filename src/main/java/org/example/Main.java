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
        service.printCompanyName();
        System.out.println(service.getCurrencyValue(50000) + " USD ");

        EmployeeDao dao_employee = context.getBean("employeeDao", EmployeeDao.class); // xml based injection
        dao_employee.saveEmployee(1, "Pratyush");
        System.out.println("Record inserted in employee table");


        ManagerDao dao_manager = context.getBean("managerDao", ManagerDao.class); // java annotation based injection
        dao_manager.saveManager(2, "Pratyush");
        System.out.println("Record inserted in manager table");
    }
}

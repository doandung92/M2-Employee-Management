package com.codegym.view;

import com.codegym.method.Method;
import com.codegym.model.Employee;
import com.codegym.model.FullTimeEmployee;
import com.codegym.model.PartTimeEmployee;

import java.util.List;
import java.util.regex.Pattern;

public class EmployeeView {
    public static Employee createEmployee(){
        int id = 0;
        for (Employee e: Main.listEmployees){
            if (id < e.getId()) id = e.getId();
        }
        id++;
        System.out.println("Create employee");
        int choice = Method.inputInt("Select 1.FullTime and 2. PartTime",1,2);
        Pattern patternPhone = Pattern.compile("[0-9]{10}");
        Pattern patternEmail = Pattern.compile("[a-zA-Z0-9]+@[a-z]+\\.[a-z]+");
        String name = Method.inputString("Input Employee name");
        int age = Method.inputInt("Input Employ Age",0,150);
        String phoneNumber;
        do{
            phoneNumber = Method.inputString("Input phone number (10 number)");
            if (patternPhone.matcher(phoneNumber).matches()) break;
            System.out.println("Phone format is not right");
        } while (true);
        String email;
        do {
            email = Method.inputString("Input your email");
            if (patternEmail.matcher(email).matches()) break;
            System.out.println("Email format is not right");
        } while (true);
        if (choice == 1){
            double bonus = Method.inputDouble("Input the bonus",0,1000000000000.0);
            double fine = Method.inputDouble("Input the fine",0,1000000000000.0);
            double salary = Method.inputDouble("Input the salary",0,1000000000000.0);
            return new FullTimeEmployee(id,name,age,phoneNumber,email,bonus,fine,salary);
        }
        double hourOfWork = Method.inputDouble("Input the hour of work",0,1000000000000.0);
        return new PartTimeEmployee(id,name,age,phoneNumber,email,hourOfWork);
    }
    public static void showAllEmployees(List<Employee> list){
        for (Employee e: list){
            System.out.println(e);
        }
    }
}

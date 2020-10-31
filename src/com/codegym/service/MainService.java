package com.codegym.service;

import com.codegym.model.Employee;
import com.codegym.model.FullTimeEmployee;
import com.codegym.model.PartTimeEmployee;
import com.codegym.view.EmployeeView;
import com.codegym.view.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainService {
    public void doAction(String action){
        switch (action){
            case "Create Employee":
                createEmployee();
                break;
            case "Show All Employee":
                showAllEmployee();
                break;
            case "Show All FullTime Employee with lower income than average":
                showFullEmployeeLowIncome();
                break;
            case "Get Income of all PartTime Employee":
                getAllIncomeOfPartTime();
                break;
            case "Sort FullTime Employee by Income":
                sortFullTimeEmployee();
                break;
            default:
                System.out.println("Dont have this action");
        }
    }
    public void createEmployee(){
        Employee employee = EmployeeView.createEmployee();
        Main.listEmployees.add(employee);
    }
    public void showAllEmployee(){
        EmployeeView.showAllEmployees(Main.listEmployees);
    }
    public void showFullEmployeeLowIncome(){
        System.out.println("Average income = "+getAverageIncome());
        System.out.println("List FullTime Employees have lower income than average");
        for (Employee e: Main.listEmployees){
            if (e instanceof FullTimeEmployee && e.getIncome() <getAverageIncome()){
                System.out.println(e);
            }
        }
    }

    public double getAverageIncome(){
        double sum= 0;
        for (Employee e: Main.listEmployees){
            sum += e.getIncome();
        }
        if (Main.listEmployees.size() == 0) return 0.0;
        return sum/Main.listEmployees.size();
    }
    public void getAllIncomeOfPartTime(){
        double sum= 0;
        for (Employee e: Main.listEmployees){
            if (e instanceof PartTimeEmployee){
                sum += e.getIncome();
            }
        }
        System.out.println("Total income of PartTime Employee is: "+sum);
    }
    public void sortFullTimeEmployee(){
        List<Employee> list = new ArrayList<>();
        for (Employee e: Main.listEmployees){
            if (e instanceof FullTimeEmployee){
                list.add(e);
            }
        }
        Collections.sort(list);
        EmployeeView.showAllEmployees(list);
    }
}

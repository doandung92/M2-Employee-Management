package com.codegym.menu;

import com.codegym.model.Employee;
import com.codegym.model.FullTimeEmployee;
import com.codegym.model.PartTimeEmployee;
import com.codegym.view.Main;

import java.util.Scanner;

public class MenuService {
    private static final Scanner scanner = new Scanner(System.in);
//    static {
//        Employee e1 = new FullTimeEmployee(1,"Dũng",25,"0123456789","a.gmail.com",100000,150000,1000000);
//        Employee e2 = new FullTimeEmployee(2,"Nghĩa",19,"0123456789","a.gmail.com",200000,150000,2000000);
//        Employee e3 = new PartTimeEmployee(3,"Tùng",56,"1111111111","c.gmail.com",10);
//        Main.listEmployees.add(e1);
//        Main.listEmployees.add(e2);
//        Main.listEmployees.add(e3);
//    }
    public static void addMenu(){
        Menu mainMenu = new Menu("mainMenu");

        Menu employeeMenu = new Menu("Employee Management");
        Menu incomeMenu = new Menu("Income Management");
        mainMenu.add(employeeMenu);
        mainMenu.add(incomeMenu);


        employeeMenu.add(new Menu("Show All Employee"));
        employeeMenu.add(new Menu("Create Employee"));

        incomeMenu.add(new Menu("Show All FullTime Employee with lower income than average"));
        incomeMenu.add(new Menu("Get Income of all PartTime Employee"));
        incomeMenu.add(new Menu("Sort FullTime Employee by Income"));

        Main.listMenu.push(mainMenu);
    }
    public static void show(Menu currentMenu){
        if (!currentMenu.show()) return;
        System.out.println();
        System.out.println("Input your selection");
        try {
            int selection = Integer.parseInt(scanner.nextLine());
            if (selection == 0) Main.listMenu.pop();
            else {
                Main.listMenu.push(currentMenu.getMenu(selection-1));
            }
        } catch (Exception e){
            System.out.println("Your selection is not valid. Try again");
        }
    }

}

package com.codegym.view;

import com.codegym.IOClass.IOFile;
import com.codegym.menu.Menu;
import com.codegym.menu.MenuService;
import com.codegym.model.Employee;
import com.codegym.service.MainService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static List<Employee> listEmployees = new ArrayList<>();
    public static MainService mainService = new MainService();
    public static Stack<Menu> listMenu = new Stack<>();
    public static void main(String[] args) {
        try {
            listEmployees = IOFile.readFromFile();
        } catch (Exception e){
            listEmployees = new ArrayList<>();
        }

        MenuService.addMenu();
        while (listMenu.size()>0){
            MenuService.show(listMenu.lastElement());
        }
        try{
            IOFile.writeToFile();
        } catch (IOException ignored) {
        }
    }
}

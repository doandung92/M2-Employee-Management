package com.codegym.method;

import com.codegym.model.Employee;
import com.codegym.view.Main;

import java.util.Scanner;

public class Method {
    private static final Scanner scanner = new Scanner(System.in);
    public static int inputInt(String sentence,int from,int end){
        do{
            System.out.println(sentence);
            String str = scanner.nextLine();
            try {
                int result = Integer.parseInt(str);
                if (result>= from && result<=end) return result;
            } catch (Exception ignored){}
            System.out.println("Invalid input");
        }while (true);
    }
    public static double inputDouble(String sentence,double from,double end){
        do{
            System.out.println(sentence);
            String str = scanner.nextLine();
            try {
                double result = Double.parseDouble(str);
                if (result>= from && result<=end) return result;
            } catch (Exception ignored){}
            System.out.println("Invalid input");
        }while (true);
    }
    public static String inputString(String sentence){
        do{
            System.out.println(sentence);
            String str = scanner.nextLine();
            if (!str.equals("")) return str;
            System.out.println("Invalid input");
        }while (true);
    }

}

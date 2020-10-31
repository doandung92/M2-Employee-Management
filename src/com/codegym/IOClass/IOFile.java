package com.codegym.IOClass;

import com.codegym.model.Employee;
import com.codegym.view.Main;

import java.io.*;
import java.util.List;

public class IOFile {
    public static void writeToFile() throws IOException {
        FileOutputStream outputStream = new FileOutputStream("data.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(Main.listEmployees);
        objectOutputStream.close();
    }
    public static List<Employee> readFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("data.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        List<Employee> list = (List<Employee>) objectInputStream.readObject();
        return list;
    }
}

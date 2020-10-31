package com.codegym.model;

import java.io.Serializable;

public class Employee implements Comparable<Employee>, Serializable {
    private int id;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;

    public Employee(){}
    public Employee(int id, String name, int age, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getIncome() {
        return 0;
    }
    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.getIncome(),o.getIncome());
    }
}

package com.codegym.model;

public class PartTimeEmployee extends Employee {
    private double hourOfWork;

    public PartTimeEmployee(int id, String name, int age, String phoneNumber, String email, double hourOfWork) {
        super(id, name, age, phoneNumber, email);
        this.hourOfWork = hourOfWork;
    }

    public double getHourOfWork() {
        return hourOfWork;
    }

    public void setHourOfWork(double hourOfWork) {
        this.hourOfWork = hourOfWork;
    }

    @Override
    public double getIncome() {
        return hourOfWork*100000;
    }
    @Override
    public String toString() {
        return "PartTimeEmployee: " +
                ", name=" + super.getName() +
                ", age" + super.getAge() +
                ", phoneNumber=" + super.getPhoneNumber() +
                ", email=" + super.getEmail() +
                ", income=" + getIncome();
    }
}

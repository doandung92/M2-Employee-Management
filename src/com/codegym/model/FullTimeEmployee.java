package com.codegym.model;

public class FullTimeEmployee extends Employee {
    private double bonus;
    private double fine;
    private double salary;

    public FullTimeEmployee(int id, String name, int age, String phoneNumber, String email, double bonus, double fine, double salary) {
        super(id, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fine = fine;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getIncome() {
        return salary + bonus - fine;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee: " +
                ", name=" + super.getName() +
                ", age" + super.getAge() +
                ", phoneNumber=" + super.getPhoneNumber() +
                ", email=" + super.getEmail() +
                ", income=" + getIncome();
    }

}

package LabFinal;

public abstract class Employee {
    String name;
    int age;
    double salary;
    public abstract double calculateSalary();

}

class HourlyEmployee extends Employee{

    double hourlyRate;
    double hoursWorked;
    HourlyEmployee(String name, int age, double hourlyRate, double hoursWorked){
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary() {
        return salary = hourlyRate * hoursWorked;
    }
}

class SalariedEmployee extends Employee {

    double monthlySalary;
    SalariedEmployee(String name, int age, double monthlySalary){
        this.name = name;
        this.age = age;
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculateSalary() {
        return salary = monthlySalary;
    }
}

class CommissionEmployee extends Employee {

    double baseSalary;
    double commissionRate;
    CommissionEmployee(String name, int age, double baseSalary, double commissionRate){
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
    }
    @Override
    public double calculateSalary() {
        return salary = baseSalary + commissionRate;
    }
}

class main{
    public static void main(String[] args) {
        Employee []employees = new Employee[4];

        employees[0] = new SalariedEmployee("mayen",20,20000);
        employees[1] = new HourlyEmployee("mayen",20,20000,10);
        employees[2] = new CommissionEmployee("mayen",20,20000,10000);

        System.out.println(employees[0].age);
    }
}

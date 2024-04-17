package EmployClass;

public class Employee {
    //Create class attribute
    String name;
    int id;
    double salary;
    String department;

    //Create a class constructor
    public Employee(String name, int id, double salary,String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department=department;
    }

    //Create IncreaseSalary Method
    void increaseSalary(double amount){
        salary+=amount;
    }

    // Create Update Department Method
    void updateDepartment(String newDepartment){
        department=newDepartment;
    }

    // Display Details Method
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);
        System.out.println();
    }
}

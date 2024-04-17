package EmployClass;

public class TestEmployee {
    public static void main(String args[]){

        // Creating instances of Employee class & Object
        Employee e1=new Employee("Sakhawat Hossain", 22201077, 45000,"CSE");
        Employee e2=new Employee("Siam Ahmead",22201066, 45500,"EEE");
        Employee e3=new Employee("Mamim Mimo", 22201181, 45800,"CSE");

        // Printing the details of entry-level employees
        System.out.println("Entry Level Employ Details: ");
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        // Increasing salary for all employees
        e1.increaseSalary(1500);
        e2.increaseSalary(1500);
        e3.increaseSalary(1500);

        // Printing the updated details of employees
        e1.updateDepartment("Software Engineer");
        e2.updateDepartment("Product Manager");
        e3.updateDepartment("IT Manager");

        // Printing the updated details of employees
        System.out.println("Update Employ Details: ");
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}

import java.util.ArrayList;
import java.util.Collections;

// 1. Employee class
class Employee {
    int id;
    String name;
    double salary;

    // 2. Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee info
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class EmployeeSorter {

    public static void main(String[] args) {
        // 3. Create an ArrayList of Employee objects
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 75000.0));
        employees.add(new Employee(102, "Bob", 50000.0));
        employees.add(new Employee(103, "Charlie", 90000.0));
        employees.add(new Employee(104, "Diana", 65000.0));

        System.out.println("Employees before sorting:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // 4. Sort the ArrayList by salary in ascending order using a lambda
        // This is a custom comparator that compares two Employee objects
        employees.sort((emp1, emp2) -> Double.compare(emp1.salary, emp2.salary));
        // OR: Collections.sort(employees, (emp1, emp2) -> Double.compare(emp1.salary, emp2.salary));

        System.out.println("\nEmployees after sorting by salary (ascending):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

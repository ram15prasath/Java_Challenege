import java.util.ArrayList;

// 1. Create a Student class
class Student {
    String name;
    char grade;

    // 2. Constructor to initialize instance variables
    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentManager {

    public static void main(String[] args) {
        // 3. Create an ArrayList of Student objects
        ArrayList<Student> students = new ArrayList<>();

        // 4. Add at least five Student objects to the ArrayList
        students.add(new Student("Alice", 'A'));
        students.add(new Student("Bob", 'B'));
        students.add(new Student("Charlie", 'A'));
        students.add(new Student("Diana", 'C'));
        students.add(new Student("Eve", 'A'));

        // Call the method to print students with a specific grade
        System.out.println("Students with a grade of 'A':");
        printStudentsWithGrade(students, 'A');

        System.out.println("\nStudents with a grade of 'B':");
        printStudentsWithGrade(students, 'B');
    }

    /**
     * Prints the names of all students with a specified grade.
     *
     * @param studentList The ArrayList of Student objects to search.
     * @param targetGrade The grade to filter by.
     */
    // 5. Create a method to filter and print students by grade
    public static void printStudentsWithGrade(ArrayList<Student> studentList, char targetGrade) {
        // 6. Iterate through the ArrayList
        for (Student student : studentList) {
            // Check if the student's grade matches the target grade
            if (student.grade == targetGrade) {
                // If it matches, print their name
                System.out.println(student.name);
            }
        }
    }
}
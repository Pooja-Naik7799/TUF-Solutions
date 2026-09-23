import java.util.*;

class Student {

    private String name;
    private int rollNumber;

    // Method to set details
    public void setDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Roll Number : " + this.rollNumber);
    }
}

class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student();
        
        // Hardcoded values
        String name = "Striver";
        int rollNumber = 101;
        
        // Setting details
        student.setDetails(name, rollNumber);
        
        // Displaying details
        student.displayDetails();
    }
}
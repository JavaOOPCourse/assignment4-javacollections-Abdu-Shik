package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        students.add(new Student(1, "Bekbolot", 3.5));
        students.add(new Student(2, "Ainura", 1.9));
        students.add(new Student(3, "Cholpon", 3.9));
        students.add(new Student(4, "Ulan", 2.3));
        students.add(new Student(5, "Meerim", 1.8));
    }

    public void removeLowGPA() {
        students.removeIf(student -> student.getGpa() < 2.0);
    }

    public void findHighestGPA() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Student topStudent = students.get(0);
        for (Student student : students) {
            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }

        System.out.println("Highest GPA student: " + topStudent);
    }

    public void insertAtIndex() {
        Student newStudent = new Student(6, "Adilet", 3.2);
        if (students.size() >= 2) {
            students.add(2, newStudent);
        } else {
            students.add(newStudent);
        }
    }

    public void printStudents() {
        System.out.println("Students:");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

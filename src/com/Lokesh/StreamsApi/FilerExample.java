package com.Lokesh.StreamsApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilerExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Lokesh", 99));
        students.add(new Student("Lam", 98));
        students.add(new Student("Rakesh",97));
        students.add(new Student("Prudhvi", 94));

        // Printing all the Students
        students.forEach(person -> System.out.println(person.name + " "  + person.marks));

        // Returns the collection of toppers as a List
        List<Student> topperClub = students.stream().filter(student -> student.marks > 95).collect(Collectors.toList());

        // Printing Toppers
        topperClub.forEach(topper -> System.out.println(topper.name));


    }
}

class Student{
    int marks;
    String name;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

}

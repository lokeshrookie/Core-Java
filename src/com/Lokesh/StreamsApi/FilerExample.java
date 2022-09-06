package com.Lokesh.StreamsApi;

import java.security.NoSuchAlgorithmException;
import java.util.*;
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


        // Sorting Students based on Name.
        List<Student> listStudents = students.stream().sorted(Comparator.comparing(student -> student.name)).collect(Collectors.toList());

        // Sorting Students based on Marks.
        List<Student> listMarks = students.stream().sorted(Comparator.comparing(student -> student.marks)).collect(Collectors.toList());


        // Print Sorted Students (based on marks) list.
        listMarks.forEach(student -> System.out.println(student.marks));
        System.out.println("Student with max marks: ");

//        listMarks.stream().max(Comparator.comparing(student -> student.name))
//                .ifPresent(System.out::println);
        // The above statement is used to directly print the value if present.

        // This statement is used to store the value in max variable if present.
        // to check if present,  call max.isPresent().
        // print max directly to know if it is present or not
        Optional<Student> max =listMarks.stream().max(Comparator.comparing(student -> student.marks==100));


    }
}

class Student{
    int marks;
    String name;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    public   void hello(){
        System.out.println("hello");
    }
    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}

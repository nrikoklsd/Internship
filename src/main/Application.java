package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko",university,new Knowledge(45)));
        university.addStudent(new Student("Julia Veselkina",university,new Knowledge(97)));
        university.addStudent(new Student("Maria Perechrest",university,new Knowledge(34)));
        university.addStudent(new Student("Nazar Senyk",university,new Knowledge(98)));

        Internship internship =Internship.getInstance("Interlink");


        System.out.println("students of universiity:");
        for (Student object: university.getPeople()) {
            System.out.println("---"+ object.getName());
        }


        System.out.println("number of students = "+ university.getPeople().size());


        university.selectionForInternship(internship);


        System.out.println("List of " + internship.getName() + " internship's students:");
        for (Student object: internship.getStudents()) {
            System.out.println("-" + object.getName());
        }




    }
}

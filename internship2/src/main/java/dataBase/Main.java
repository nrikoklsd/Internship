package dataBase;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {



    public static void main(String[] args) {

        Internship internship = Internship.getInstance("Interlink");
        University university = new University("CH.U.I.");



        //-----------------------
        // adding Students in code
        //-----------------------
        university.addStudent(new Student("Andrew Kostenko",university,new Knowledge(45)));
        university.addStudent(new Student("Julia Veselkina",university,new Knowledge(97)));
        university.addStudent(new Student("Maria Perechrest",university,new Knowledge(34)));
        university.addStudent(new Student("Nazar Senyk",university,new Knowledge(98)));



        //-----------------------
        //adding Students from DB
        //-----------------------
        DBWorker worker = new DBWorker();
        String query = "select * from students where university=" + university.getName();

        try {
            Statement statement = worker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                Student studentDB = new Student();
                //index in DB is on 1 column
                studentDB.setName(resultSet.getString(2));                      //
                studentDB.setUniversity(new University(resultSet.getString(3)));//
                studentDB.setKnowledge(new Knowledge(resultSet.getInt(4)));     //

                university.addStudent(studentDB);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        //-----------------------
        //forming a group of interns
        //-----------------------
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

package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public final class Internship {

    //I decide to create only one Internship,so I use Singleton

    private static Internship instance;

    private String name;
    private List<Student> trainee;


    private Internship(String name) {
        this.name = name;
        trainee = new ArrayList<>();
    }

    public static Internship getInstance(String value) {
        if (instance == null) {
            instance = new Internship(value);
        }
        return instance;

    }

    public void setStudent(Student student) {

        trainee.add(student);
    }

    public String getName() {

        return name;
    }



    public List<Student> getStudents() {

        return trainee;
    }
}



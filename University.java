package institution;

import institution.interlink.Internship;
import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private float GPA; //global point average



    private List<Student> people;


    public University(String name) {
        //TODO: Implementation is needed
        this.name = name;
        people = new ArrayList<>();
    }

    public void setStudent(Student student) {
        people.set(0, student); // Don`t understand necessity of this method

    }

    public void addStudent(Student student) {
        people.add(student);

    }
    public List<Student> getPeople() {
        return people;
    }


    private void GPA_calculate(){
        int sum = 0;
        for (Student object: people) {
            sum = sum + object.getKnowledge().getLevel();
        }
        GPA = sum/people.size();
        System.out.println("GPA = " + GPA);
    }

    public void selectionForInternship(Internship internship){
        GPA_calculate();

        for (Student object: people) {
            if (object.getKnowledge().getLevel() > GPA)
                internship.setStudent(object);

        }

    }


}

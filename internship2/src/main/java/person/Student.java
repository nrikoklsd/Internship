package person;

import institution.University;
import person.consciousness.Knowledge;

public class Student {
    private University university;
    private String name;
    private Knowledge knowledge;

    public Student(String name) {

        this.name = name;
    }

    public Student() {

    }

    public Student(String name, University university, Knowledge knowledge) {
        this.name = name;
        this.university = university;
        this.knowledge = knowledge;
    }



    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public void setName(String name) { this.name = name; }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public University getUniversity() {
        return university;
    }
}

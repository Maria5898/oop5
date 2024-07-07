package model;

import java.util.List;

import model.impl.Student;
import model.impl.Teacher;

public class StudentGroup {

    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
        this.id = DataBase.StudentGroupDB.size() + 1;
    }

    public StudentGroup(Teacher teacher) {
        this.teacher = teacher;
        this.id = DataBase.StudentGroupDB.size() + 1;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

package service;

import java.util.List;

import controller.StudentController;
import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;

public class StudentGroupService {

    private StudentController studentController;

    public StudentGroupService() {
        this.studentController = new StudentController();
    }

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students){
        return new StudentGroup(teacher, students);
    }

    public void addStudents(StudentGroup studentGroup, List<Student> students){
        studentGroup.getStudents().addAll(students);
    }

    public StudentGroup getStudentGroup(Teacher teacher, List<Integer> studentIds){
        List<Student> students = new ArrayList<>();
        
        for (int id : studentIds) {
            Student student = studentController.getById(id);
            if (student != null) {
                students.add(student);
            } else {
                System.out.println("Student with ID " + id + " not found.");
            }
        }
        
        System.out.println(teacher);
        System.out.println(students);
        
        return createStudentGroup(teacher, students);
    }
}

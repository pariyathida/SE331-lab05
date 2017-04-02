package camt.cbsd.service;

import camt.cbsd.entity.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pariy on 4/2/2017.
 */
@Profile("firstDataSource")
@Service
public class RetiredStudentService {
    public List<Student> getRetiredStudents(){
        List<Student> retiredStudents = new ArrayList<>();
        Student student = new Student(1,"SE-001","Mark","Bitch",1.20,"image/mark.jpg",true,1,"Nothing");
        retiredStudents.add(student);
        student = new Student(2, "SE-002", "Win", "The Fatty", 0.99, "images/win.jpg", false, 1, "The fat man ever!!!!");
        retiredStudents.add(student);
        return retiredStudents;
    }
}

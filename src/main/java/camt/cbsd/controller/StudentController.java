package camt.cbsd.controller;

import camt.cbsd.entity.Student;
import camt.cbsd.service.RetiredStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


/**
 * Created by pariy on 4/1/2017.
 */
@Component
@Path("/student")
public class StudentController {
    RetiredStudentService studentService;
    @Autowired
    public void setStudentService(RetiredStudentService studentService){
        this.studentService = studentService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudents(){
        List<Student> students = studentService.getRetiredStudents();
        return Response.ok(students).build();
    }
}

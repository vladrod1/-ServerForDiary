package org.example.diaryserverspringboot.Controller;

import org.example.diaryserverspringboot.Service.ServiceStudentsAndClasses;
import org.example.diaryserverspringboot.entity.ClassId;
import org.example.diaryserverspringboot.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private ServiceStudentsAndClasses service;

    @GetMapping("/students/{classId}")
    public Students list(@PathVariable("classId") int id){
        return service.showStudentById(id);
    }

    @PostMapping("/addStudents")
    public Students addStudents(@RequestBody Students students){
        service.addNewStudent(students, new ClassId(students.getClassId()));
        return students;
    }
    @GetMapping("/class")
    public List<ClassId> list1(){
        return service.showAllClasses();
    }
    @GetMapping("/class/{id}")
    public List<ClassId> classList(@PathVariable("id") int id){
        return service.showClassById(id);
    }

    @PutMapping("/students/update/{id}")
    public Students updateStudents(@RequestBody Students student, @PathVariable("id") int id){
        service.addNewStudent(student, new ClassId(student.getClassId()));
        return student;
    }

}

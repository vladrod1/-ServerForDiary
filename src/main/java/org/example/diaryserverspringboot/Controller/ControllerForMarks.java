package org.example.diaryserverspringboot.Controller;

import org.example.diaryserverspringboot.Service.ServiceMarks;
import org.example.diaryserverspringboot.entity.Marks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerForMarks {
    @Autowired
    private ServiceMarks serviceMarks;

    @GetMapping("/showAllMarks")
    public List<Marks> showAllMarks(){
        return serviceMarks.showAllMarksAllStudents();
    }
    @GetMapping("/showMarksOfClass/{classId}")
    public List<Marks> showMarksOfClass(@PathVariable("classId") int classId){
        return serviceMarks.showMarksOfClass(classId);
    }
    @PostMapping("/addMarks")
    public void addMarks(@RequestBody Marks marks){
        serviceMarks.addMarks(marks);
    }
    @PutMapping("/updateMarks")
    public void updateMark(@RequestBody Marks mark){
        serviceMarks.updateMark(mark);
    }
}

package org.example.diaryserverspringboot.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.diaryserverspringboot.Service.ServiceAllMarks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerAllMarks {
    @Autowired
    private ServiceAllMarks service;

    //Метод для отображения JSON со всеми оценками
    @GetMapping("/getMarks/{table}")
    public List<Object> getRussYzMarks(@PathVariable("table") String table){
        return service.getAllMarks(table);
    }

    //Метод для отображения JSON со оценками по классам
    @GetMapping("/getMarksForClass/{table}/{classId}")
    public List<Object> getMarksForClass(@PathVariable("table") String table, @PathVariable("classId") int classId){
        return service.getMarksOfClass(table, classId);
    }

    //Метод для добаления объекта в таблицу с оценками
    @PostMapping("/add/{table}")
    public void addMark(@RequestBody Object obj, @PathVariable("table") String table) throws JsonProcessingException {
        service.addMark(obj, table);
    }
    //Метод для обновления объекта по id в таблице с оценками
    @PutMapping("/updateMark/{table}")
    public void updateMark(@RequestBody Object obj, @PathVariable("table") String table) throws JsonProcessingException{
        service.addMark(obj, table);
    }
}

package org.example.diaryserverspringboot.Service;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.diaryserverspringboot.DAO.ShowMarksOfSubjectsClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Класс для связи с ControllerAllMarks
@Service
public class ServiceAllMarks implements ServiceAllMarksInterface{
    @Autowired
    private ShowMarksOfSubjectsClass showMarksOfSubjectsClass;

    //Метод для связи getAllMarks из класса showMarksOfSubjectsClass с ControllerAllMarks
    @Transactional
    @Override
    public List<Object> getAllMarks(String table){
        return showMarksOfSubjectsClass.getAllMarks(table);
    }
    //Метод для связи getMarksForClass из класса showMarksOfSubjectsClass с ControllerAllMarks
    @Transactional
    @Override
    public List<Object> getMarksOfClass(String table, int classId){
        return showMarksOfSubjectsClass.getMarksForClass(table, classId);
    }
    //Метод для связи addOrUpdateMark из класса showMarksOfSubjectsClass с ControllerAllMarks
    @Transactional
    @Override
    public void addMark(Object obj, String table) throws JsonProcessingException {
        showMarksOfSubjectsClass.addOrUpdateMark(obj, table);
    }
}

package org.example.diaryserverspringboot.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

//Интерфейс для класса ServiceAllMarks
public interface ServiceAllMarksInterface {
    public List<Object> getAllMarks(String table);
    public List<Object> getMarksOfClass(String table, int classId);
    public void addMark(Object obj, String table) throws JsonProcessingException;
}

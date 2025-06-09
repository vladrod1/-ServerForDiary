package org.example.diaryserverspringboot.DAO;

import com.fasterxml.jackson.core.JsonProcessingException;



import java.util.List;

//Интерфейс для класса ShowMarksOfSubjectsClass
public interface ShowMarksOfSubjects {
    public List<Object> getAllMarks(String table);
    public List<Object> getMarksForClass(String table, int classId);
    public void addOrUpdateMark(Object obj, String table)throws JsonProcessingException;
}

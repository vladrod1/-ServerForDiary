package org.example.diaryserverspringboot.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.diaryserverspringboot.entity.Marks;

import java.util.List;

//Интерфейс для класса ServiceMarks
public interface ServiceMarksInterface {
    public List<Marks> showAllMarksAllStudents();
    public List<Marks> showMarksOfClass(int classId);
    public void addMarks(Marks marks);
    public void updateMark(Marks mark);
}

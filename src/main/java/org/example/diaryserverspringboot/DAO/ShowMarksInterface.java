package org.example.diaryserverspringboot.DAO;

import org.example.diaryserverspringboot.entity.Marks;

import java.util.List;

//Интрфейс для класса ShowMarks
public interface ShowMarksInterface {
    public List<Marks> showAllMarks();
    public List<Marks> showMarksOfClass(int id);
    public void addMarks(Marks marks);
}

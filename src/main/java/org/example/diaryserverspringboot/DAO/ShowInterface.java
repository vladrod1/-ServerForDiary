package org.example.diaryserverspringboot.DAO;

import org.example.diaryserverspringboot.entity.ClassId;
import org.example.diaryserverspringboot.entity.Students;

import java.util.List;

//Интерфейс для класса Show
public interface ShowInterface {
    Students showStudentById(int id);
    void addNewStudent(Students student, ClassId classId);
    List<ClassId> showAllClasses();
    List<ClassId> showClassById(int id);
}

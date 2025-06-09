package org.example.diaryserverspringboot.Service;

import org.example.diaryserverspringboot.entity.ClassId;
import org.example.diaryserverspringboot.entity.Students;

import java.util.List;

//Интерфейс для класса ServiceStudentsAndClasses
public interface ServiceInterface {
    public Students showStudentById(int id);
    public Students addNewStudent(Students students, ClassId classId);
    public List<ClassId> showAllClasses();
    public List<ClassId> showClassById(int id);
}

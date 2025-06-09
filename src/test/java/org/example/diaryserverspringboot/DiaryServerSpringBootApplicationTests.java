package org.example.diaryserverspringboot;

import org.example.diaryserverspringboot.DAO.ShowMarksOfSubjectsClass;
import org.example.diaryserverspringboot.Service.ServiceStudentsAndClasses;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DiaryServerSpringBootApplicationTests {
    @Autowired
    private ServiceStudentsAndClasses serviceStudents;

    @Autowired
    private ShowMarksOfSubjectsClass showMarksOfSubjectsClass;
    @Test
    void contextLoads() {
    }

    //Тестирование метода getAllMarks из класса ShowMarksOfSubjectsClass в пакете DAO
    @Test
    @Transactional
    public void testGetAllMarks(){
        assertFalse(showMarksOfSubjectsClass.getAllMarks("russ_yz").isEmpty());
        assertFalse(showMarksOfSubjectsClass.getAllMarks("mat").isEmpty());
        assertTrue(showMarksOfSubjectsClass.getAllMarks("fiz").isEmpty());
        assertTrue(showMarksOfSubjectsClass.getAllMarks("engl").isEmpty());
    }

    //Тестирование метода getMarksForClass из класса ShowMarksOfSubjectsClass в пакете DAO
    @Test
    @Transactional
    public void testGetMarksForClass(){
        assertFalse(showMarksOfSubjectsClass.getMarksForClass("russ_yz", 23).isEmpty());
        assertTrue(showMarksOfSubjectsClass.getMarksForClass("mat", 1).isEmpty());
        assertTrue(showMarksOfSubjectsClass.getMarksForClass("fiz", 1).isEmpty());
        assertTrue(showMarksOfSubjectsClass.getMarksForClass("engl", 1).isEmpty());
    }

}

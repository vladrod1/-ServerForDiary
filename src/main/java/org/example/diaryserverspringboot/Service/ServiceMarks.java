package org.example.diaryserverspringboot.Service;

import org.example.diaryserverspringboot.DAO.ShowMarks;
import org.example.diaryserverspringboot.entity.Marks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceMarks implements ServiceMarksInterface{
    @Autowired
    private ShowMarks showMarks;

    @Override
    @Transactional
    public List<Marks> showAllMarksAllStudents(){
        return showMarks.showAllMarks();
    }
    @Override
    @Transactional
    public List<Marks> showMarksOfClass(int classId){
        return showMarks.showMarksOfClass(classId);
    }
    @Override
    @Transactional
    public void addMarks(Marks marks){
        showMarks.addMarks(marks);
    }
    @Override
    @Transactional
    public void updateMark(Marks mark){
        showMarks.updateMark(mark);
    }
}

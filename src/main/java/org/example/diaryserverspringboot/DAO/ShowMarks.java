package org.example.diaryserverspringboot.DAO;


import org.example.diaryserverspringboot.entity.Marks;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShowMarks implements ShowMarksInterface{
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Marks> showAllMarks(){
        Session session = sessionFactory.getCurrentSession();
        List<Marks> listMarks = session.createQuery("select m, s from Marks m inner join Students s on m.id_student = s.id").list();
        return listMarks;
    }

    @Override
    public List<Marks> showMarksOfClass(int classId){
        Session session = sessionFactory.getCurrentSession();
        List<Marks> marks = session.createQuery("select m from Marks m, Students s where s.classId = " + classId + " and s.id = m.id_student").stream().toList();
        return marks;
    }
    @Override
    public void addMarks(Marks marks){
        Session session = sessionFactory.getCurrentSession();
        session.save(marks);
    }
    @Override
    public void updateMark(Marks mark){
        Session session = sessionFactory.getCurrentSession();
        session.createQuery("update Marks set id_student = :" + mark.getId_student() + ", russ_yz = :" + mark.getRuss_yz() + ", mat = :" + mark.getMat() + ", fiz = :" + mark.getFiz() + ", engl = :" + mark.getEngl() + " where marks_id = : 5");
    }
}

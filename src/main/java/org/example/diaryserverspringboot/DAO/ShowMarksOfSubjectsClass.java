package org.example.diaryserverspringboot.DAO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.diaryserverspringboot.entity.engl;
import org.example.diaryserverspringboot.entity.fiz;
import org.example.diaryserverspringboot.entity.mat;
import org.example.diaryserverspringboot.entity.russ_yz;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShowMarksOfSubjectsClass implements ShowMarksOfSubjects{

    @Autowired
    private SessionFactory sessionFactory;
    //Получение оценок из таблицы - "table"
    @Override
    public List<Object> getAllMarks(String table){
        Session session = sessionFactory.getCurrentSession();
        List<Object> list1 =  session.createQuery("select r, s from "+ table +" r inner join Students s on r.id_student = s.id").list();

        return list1;
    }
    //Получение оценок по таблице - "table" и класса - "classId"
    @Override
    public List<Object> getMarksForClass(String table, int classId) {
        Session session = sessionFactory.getCurrentSession();
        switch (table){
            case "russ_yz":
                List<Object> rus = session.createQuery("select r, s from russ_yz r, Students s where s.id = r.id_student and s.classId = " + classId).list();
                return rus;
            case "mat":
                List<Object> mat = session.createQuery("select r, s from mat r, Students s where s.id = r.id_student and s.classId = " + classId).list();
                return mat;
            case "fiz":
                List<Object> fiz = session.createQuery("select r, s from fiz r, Students s where s.id = r.id_student and s.classId = " + classId).list();
                return fiz;
            case "engl":
                List<Object> engl = session.createQuery("select r, s from engl r, Students s where s.id = r.id_student and s.classId = " + classId).list();
                return engl;
        }
        return List.of();
    }
    //Метод для добавление и обновления оценки в базе данных
    @Override
    public void addOrUpdateMark(Object obj, String table) throws JsonProcessingException {
        Session session = sessionFactory.getCurrentSession();

        ObjectMapper objectMapper = new ObjectMapper();

        switch (table) {
            case "russ_yz":
                russ_yz r = objectMapper.convertValue(obj, russ_yz.class);
                session.saveOrUpdate(r);
            case "mat":
                mat m = objectMapper.convertValue(obj, mat.class);
                session.saveOrUpdate(m);
            case "fiz":
                fiz f = objectMapper.convertValue(obj, fiz.class);
                session.saveOrUpdate(f);
            case "engl":
                engl e = objectMapper.convertValue(obj, engl.class);
                session.saveOrUpdate(e);
        }

    }

}

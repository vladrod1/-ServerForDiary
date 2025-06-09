package org.example.diaryserverspringboot.DAO;

import org.example.diaryserverspringboot.entity.ClassId;
import org.example.diaryserverspringboot.entity.Students;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Show implements ShowInterface{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Students showStudentById(int id){
        Session session = sessionFactory.getCurrentSession();
        List<Students> list = session.createQuery("from Students", Students.class).list();
        return list.stream().filter(s -> s.getId() == id).toList().getFirst();
    }
    @Override
    public void addNewStudent(Students student, ClassId classId){
        Session session = sessionFactory.getCurrentSession();
        classId.addStudentToClass(student);
        session.saveOrUpdate(student);
    }
    @Override
    public List<ClassId> showAllClasses(){
        Session session = sessionFactory.getCurrentSession();
        List<ClassId> list1 = session.createQuery("from ClassId", ClassId.class).list();
        return list1;
    }
    @Override
    public List<ClassId> showClassById(int id){
        Session session = sessionFactory.getCurrentSession();
        List<ClassId> classId = showAllClasses();
        return classId.stream().filter(c -> c.getId() == id).toList();
    }
}

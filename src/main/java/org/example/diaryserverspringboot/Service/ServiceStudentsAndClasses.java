package org.example.diaryserverspringboot.Service;

import org.example.diaryserverspringboot.DAO.Show;
import org.example.diaryserverspringboot.entity.ClassId;
import org.example.diaryserverspringboot.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@CacheConfig
public class ServiceStudentsAndClasses implements ServiceInterface {
    @Autowired
    private Show show;

    @Override
    @Transactional(readOnly = true)
    @Cacheable(value = "ServiceStudentsAndClasses::showStudentById", key = "#id")
    public Students showStudentById(int id){
        return show.showStudentById(id);
    }

    @Override
    @Transactional
    @CachePut(value = "ServiceStudentsAndClasses::showStudentById", key = "#students.id")
            //@CachePut(value = "ServiceStudentsAndClasses::showAllClasses", key = "#classId.id")
    public Students addNewStudent(Students students, ClassId classId){
        show.addNewStudent(students, classId);
        return students;
    }
    @Override
    @Transactional
    @Cacheable(value = "ServiceStudentsAndClasses::showAllClasses")
    public List<ClassId> showAllClasses(){
        return show.showAllClasses();
    }
    @Override
    @Transactional
    @Cacheable(value = "ServiceStudentsAndClasses::showClassById", key = "#id")
    public List<ClassId> showClassById(int id){
        return show.showClassById(id);
    }
}

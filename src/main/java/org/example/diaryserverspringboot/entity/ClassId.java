package org.example.diaryserverspringboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ClassId")
public class ClassId implements Serializable {
    @Id
    @Column(name = "class_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) // По умолчанию fetch = FetchType.LAZY
    @JoinColumn(name = "classId")
    private List<Students> classNumber;

    public ClassId(){}

    public ClassId(int id){
        this.id = id;

    }
    public void addStudentToClass(Students student){
        classNumber = new ArrayList<>();
        classNumber.add(student);
        student.setClassId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Students> getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(List<Students> classNumber) {
        this.classNumber = classNumber;
    }
}

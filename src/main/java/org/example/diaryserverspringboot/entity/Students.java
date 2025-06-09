package org.example.diaryserverspringboot.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Students")
public class Students implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "otchestvo")
    private String otchestvo;


    private int classId;


    public Students(){

    }
    public Students(String name, String surname, String otchestvo, int classId){
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
        this.classId = classId;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getOtchestvo(){
        return this.otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}

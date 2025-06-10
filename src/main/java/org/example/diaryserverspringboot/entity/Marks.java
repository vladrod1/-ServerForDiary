package org.example.diaryserverspringboot.entity;

import jakarta.persistence.*;



@Entity
@Table(name = "Marks")
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marks_id")
    private int marks_id;

    @Column(name = "id_student")
    private int id_student;

    @Column(name = "russ_yz")
    private Integer russ_yz; //Указываем Integer, чтобы можно было ставить значение null
    @Column(name = "mat")
    private Integer mat;
    @Column(name = "fiz")
    private Integer fiz;
    @Column(name = "engl")
    private Integer engl;

    public Marks(){}

    public Marks(int marks_id, int id_student, Integer mat, Integer fiz, Integer engl, Integer russ_yz) {
        this.marks_id = marks_id;
        this.id_student = id_student;
        this.mat = mat;
        this.fiz = fiz;
        this.engl = engl;
        this.russ_yz = russ_yz;
    }

    public int getId() {
        return marks_id;
    }

    public void setId(int id) {
        this.marks_id = marks_id;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public Integer getRuss_yz() {
        return russ_yz;
    }

    public void setRuss_yz(Integer russ_yz) {
        this.russ_yz = russ_yz;
    }

    public Integer getMat() {
        return mat;
    }

    public void setMat(Integer mat) {
        this.mat = mat;
    }

    public Integer getEngl() {return engl; }

    public void setEngl(Integer engl) {
        this.engl = engl;
    }

    public Integer getFiz() {
        return fiz;
    }

    public void setFiz(Integer fiz) {
        this.fiz = fiz;
    }
}

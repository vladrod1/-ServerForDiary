package org.example.diaryserverspringboot.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Table
@Entity(name = "russ_yz")
public class russ_yz implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "id_student")
    private int id_student;

    @Column(name = "data_1")
    private String data_1;

    @Column(name = "data_2")
    private String data_2;

    @Column(name = "data_3")
    private String data_3;

    @Column(name = "data_4")
    private String data_4;

    @Column(name = "data_5")
    private String data_5;

    @Column(name = "data_6")
    private String data_6;

    @Column(name = "data_7")
    private String data_7;

    @Column(name = "data_8")
    private String data_8;

    @Column(name = "data_9")
    private String data_9;

    @Column(name = "data_10")
    private String data_10;

    public russ_yz(int id, int id_student, String data1, String data2, String data3, String data4, String data5, String data6, String data7, String data8, String data9, String data10) {
        this.id = id;
        this.id_student = id_student;
        this.data_1 = data1;
        this.data_2 = data2;
        this.data_3 = data3;
        this.data_4 = data4;
        this.data_5 = data5;
        this.data_6 = data6;
        this.data_7 = data7;
        this.data_8 = data8;
        this.data_9 = data9;
        this.data_10 = data10;
    }
    public russ_yz(){

    }

    public int getId() {
        return id;
    }

    public int getId_student() {
        return id_student;
    }

    public String getData_1() {
        return data_1;
    }

    public String getData_2() {
        return data_2;
    }

    public String getData_3() {
        return data_3;
    }

    public String getData_4() {
        return data_4;
    }

    public String getData_5() {
        return data_5;
    }

    public String getData_6() {
        return data_6;
    }

    public String getData_7() {
        return data_7;
    }

    public String getData_8() {
        return data_8;
    }

    public String getData_9() {
        return data_9;
    }

    public String getData_10() {
        return data_10;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public void setData_1(String data_1) {
        this.data_1 = data_1;
    }

    public void setData_2(String data_2) {
        this.data_2 = data_2;
    }

    public void setData_3(String data_3) {
        this.data_3 = data_3;
    }

    public void setData_4(String data_4) {
        this.data_4 = data_4;
    }

    public void setData_5(String data_5) {
        this.data_5 = data_5;
    }

    public void setData_6(String data_6) {
        this.data_6 = data_6;
    }

    public void setData_7(String data_7) {
        this.data_7 = data_7;
    }

    public void setData_8(String data_8) {
        this.data_8 = data_8;
    }

    public void setData_9(String data_9) {
        this.data_9 = data_9;
    }

    public void setData_10(String data_10) {
        this.data_10 = data_10;
    }

    @Override
    public String toString() {
        return "russ_yz{" +
                "id=" + id +
                ", id_student=" + id_student +
                ", data_1='" + data_1 + '\'' +
                ", data_2='" + data_2 + '\'' +
                ", data_3='" + data_3 + '\'' +
                ", data_4='" + data_4 + '\'' +
                ", data_5='" + data_5 + '\'' +
                ", data_6='" + data_6 + '\'' +
                ", data_7='" + data_7 + '\'' +
                ", data_8='" + data_8 + '\'' +
                ", data_9='" + data_9 + '\'' +
                ", data_10='" + data_10 + '\'' +
                '}';
    }
}

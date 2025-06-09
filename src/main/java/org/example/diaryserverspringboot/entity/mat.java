package org.example.diaryserverspringboot.entity;

import jakarta.persistence.*;


@Table
@Entity(name = "mat")
public class mat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "id_student")
    private int id_student;


    @Column(name = "data_1")
    private String data1;


    @Column(name = "data_2")
    private String data2;


    @Column(name = "data_3")
    private String data3;


    @Column(name = "data_4")
    private String data4;


    @Column(name = "data_5")
    private String data5;


    @Column(name = "data_6")
    private String data6;


    @Column(name = "data_7")
    private String data7;


    @Column(name = "data_8")
    private String data8;


    @Column(name = "data_9")
    private String data9;

    @Column(name = "data_10")
    private String data10;

    public mat(int id, int id_student, String data1, String data2, String data3, String data4, String data5, String data6, String data7, String data8, String data9, String data10) {
        this.id = id;
        this.id_student = id_student;
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
        this.data7 = data7;
        this.data8 = data8;
        this.data9 = data9;
        this.data10 = data10;
    }

    public int getId() {
        return id;
    }

    public int getId_student() {
        return id_student;
    }

    public String getData1() {
        return data1;
    }

    public String getData2() {
        return data2;
    }

    public String getData3() {
        return data3;
    }

    public String getData4() {
        return data4;
    }

    public String getData5() {
        return data5;
    }

    public String getData6() {
        return data6;
    }

    public String getData7() {
        return data7;
    }

    public String getData8() {
        return data8;
    }

    public String getData9() {
        return data9;
    }

    public String getData10() {
        return data10;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }

    public void setData4(String data4) {
        this.data4 = data4;
    }

    public void setData5(String data5) {
        this.data5 = data5;
    }

    public void setData6(String data6) {
        this.data6 = data6;
    }

    public void setData7(String data7) {
        this.data7 = data7;
    }

    public void setData8(String data8) {
        this.data8 = data8;
    }

    public void setData9(String data9) {
        this.data9 = data9;
    }

    public void setData10(String data10) {
        this.data10 = data10;
    }

    public mat(){}

}

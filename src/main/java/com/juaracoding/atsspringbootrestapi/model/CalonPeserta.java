package com.juaracoding.atsspringbootrestapi.model;
/*
IntelliJ IDEA 2023.2 (Community Edition)
Build #IC-232.8660.185, built on July 26, 2023
@Author EmiratZ a.k.a. M Emirat Millenium Try
Java Developer
Created on 30/08/2023 13.45
@Last Modified 30/08/2023 13.45
Version 1.0
*/

public class CalonPeserta {

    private Long id;
    private String nama;
    private Integer umur;
    private Integer nilai;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public Integer getNilai() {
        return nilai;
    }

    public void setNilai(Integer nilai) {
        this.nilai = nilai;
    }
}
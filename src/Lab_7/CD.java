/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7;

/**
 *
 * @author copbu
 */
public class CD {
    private String title; 
    private String iD;
    private String cDcollecion;
    private String cDtype;
    private double price;
    private int yearOfRelease;
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getcDcollecion() {
        return cDcollecion;
    }

    public void setcDcollecion(String cDcollecion) {
        this.cDcollecion = cDcollecion;
    }

    public String getcDtype() {
        return cDtype;
    }

    public void setcDtype(String cDtype) {
        this.cDtype = cDtype;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public CD(String title, String iD, String cDcollecion, String cDtype, double price, int yearOfRelease) {
        this.title = title;
        this.iD = iD;
        this.cDcollecion = cDcollecion;
        this.cDtype = cDtype;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
    }
    
    
   
    public CD() {
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7;

import java.util.ArrayList;

/**
 *
 * @author copbu
 */
public class CDManager extends CD {

    private ArrayList<CD> Cds = new ArrayList<>();

    private boolean addCD(CD stu) {
        for (CD cd : Cds) {
            if (cd.getiD().equalsIgnoreCase(cd.getiD())) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<CD> getCds() {
        return Cds;
    }

    public void setCds(ArrayList<CD> Cds) {
        this.Cds = Cds;
    }

    public ArrayList<CD> GetListByID(String Id) {
        ArrayList<CD> result = new ArrayList<>();
        CD cd;
        for (int i = 0; i < Cds.size(); i++) {
            cd = Cds.get(i);
            if (cd.getiD().contains(Id)) {
                result.add(cd);
            }
        }
        return result;
    }
    public void AddCD(CD cd){
        this.Cds.add(cd);
    }
    public ArrayList<CD> GetListByTitle(String Title) {
        ArrayList<CD> result = new ArrayList<>();
        CD cd;
        for (int i = 0; i < Cds.size(); i++) {
            cd = Cds.get(i);
            if (cd.getTitle().contains(Title)) {
                result.add(cd);
            }
        }
        return result;
    }

    public ArrayList<CD> GetListByCollection(String Collection) {
        ArrayList<CD> result = new ArrayList<>();
        CD cd;
        for (int i = 0; i < Cds.size(); i++) {
            cd = Cds.get(i);
            if (cd.getcDcollecion().contains(Collection)) {
                result.add(cd);
            }
        }
        return result;
    }

    public ArrayList<CD> GetListByType(String type) {
        ArrayList<CD> result = new ArrayList<>();
        CD cd;
        for (int i = 0; i < Cds.size(); i++) {
            cd = Cds.get(i);
            if (cd.getcDtype().contains(type)) {
                result.add(cd);
            }
        }
        return result;
    }

    public ArrayList<CD> GetListByPrice(double Price) {
        ArrayList<CD> result = new ArrayList<>();
        CD cd;
        for (int i = 0; i < Cds.size(); i++) {
            cd = Cds.get(i);
            if (cd.getPrice() == Price) {
                result.add(cd);
            }
        }
        return result;
    }
}

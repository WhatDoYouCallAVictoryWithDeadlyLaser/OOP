package Bai_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class CD_Store {
    private static Scanner sc = new Scanner(System.in);
    private ArrayList<CD> cdlist = new ArrayList<CD>();
    public CD_Store() {
    }
    public CD_Store(ArrayList<CD> cdlist) {
        this.cdlist = cdlist;
    }

    public void addCD(){
        System.out.println("How many CDs do you want to add?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            CD cd = new CD();
            cd.addInfo();
            cdlist.add(cd);
        }
    }
    public void findTitle(String title){
        boolean found = false;
        for (CD cd : cdlist) {
            if (cd.getTitle().equals(title)) {
                cd.getInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Could not find: " + title);
        }

    }
    public void findCollection(String collection){
        boolean found = false;
        for (CD cd : cdlist) {
            if (cd.getCollection().equals(collection)) {
                cd.getInfo();
                found = true;
            }
        }
        if (!found){
            System.out.println("Could not find: " + collection);
        }
    }
    public void findType(String type){
        boolean found = false;
        for (CD cd : cdlist) {
            if (cd.getType().equals(type)) {
                cd.getInfo();
                found = true;
            }
        }
        if (!found){
            System.out.println("Could not find: " + type);}
    }
    public void deleteByID(String id){
        Iterator<CD> iterator = cdlist.iterator();
        while (iterator.hasNext()) {
            CD cd = iterator.next();
            if (cd.getId().equals(id)) {
                iterator.remove();
                break;
            }
        }
    }
    public void editCD(String id){
        for (CD cd : cdlist) {
            if (cd.getId().equals(id)) {
                cd.editCD();
                break;
            }
        }
    }
    public void displayAll(){
        for (CD cd : cdlist) {
            cd.getInfo();
        }
    }
    public void sortYearAscending(){
        cdlist.sort(new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                return Integer.compare(o1.getReleaseYear(), o2.getReleaseYear());
            }
        });
    }
}
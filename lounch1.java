package Encaosulation;

import java.sql.SQLOutput;

class student {
    private int age ;
    private String name ;

    void setData(){
        age =18;
        name = "Riya";
    }

    void show(){
        System.out.println(name + " " +age);
    }
}

public class lounch1 {
    public static void main(String[] args) {
        student sc= new student();
        sc.setData();
        sc.show();
    }
}

package com.brainacad.oop.diplom;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Администратор on 31.01.2016.
 */
public class Student {
 private int idStudent;
    private String firstName;
    private String secondName;
    ArrayList <Integer> arrayListCourseStudent;
     Map<Integer,String> mapTask;



    public  Student(int idStudent,String firstName,String secondName, ArrayList<Integer> arrayListCourseStudent){
        this.idStudent = idStudent;
        this.firstName = firstName;
        this.secondName = secondName;
        this.arrayListCourseStudent = arrayListCourseStudent;
       // this.mapTask = mapTask;

    }

}

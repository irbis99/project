package com.brainacad.oop.diplom;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Администратор on 31.01.2016.
 */
public class Course {
    private Integer idCourse;
    private String nameCourse;
    private String shotDesc;
    private List<Student> listStudent;
    private Trainer trainer;
    private GregorianCalendar startDate;
    private GregorianCalendar endDate;
    private ArrayList<String> listDayWeek;
    public Course(Integer idCourse, String nameCourse, String shotDesc, GregorianCalendar startDate, GregorianCalendar endDate, ArrayList<String> arraydateweek1List){
        this.idCourse = idCourse;
        this.nameCourse = nameCourse;
        this.shotDesc = shotDesc;
        this.startDate = startDate;
        this.endDate = endDate;
        this.listDayWeek = arraydateweek1List;
    }

    public Integer getIdCourse() {
        return idCourse;
    }

    @Override
    public String toString() {
        return "Course{" +
                "idCourse=" + idCourse +
                ", nameCourse='" + nameCourse + '\'' +
                ", shotDesc='" + shotDesc + '\'' +
                ", listStudent=" + listStudent +
                ", trainer=" + trainer +
                ", startDate=" + startDate.get(startDate.YEAR)+"."+ startDate.get(startDate.MONTH)+"."+startDate.get(startDate.DAY_OF_MONTH) +
                ", endDate=" + endDate.get(endDate.YEAR) +"."+ endDate.get(endDate.MONTH)+"."+endDate.get(endDate.DAY_OF_MONTH) +
                ", listDayWeek=" + listDayWeek +
                '}';
    }
}

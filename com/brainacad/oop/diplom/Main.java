package com.brainacad.oop.diplom;

import java.util.*;

/**
 * Created by Администратор on 25.01.2016.
 */
public class Main {
    public static void main(String [] args){
        List<Course> listCourses = new LinkedList<>();
        GregorianCalendar calendar1start = new GregorianCalendar(2016,Calendar.JANUARY, 1);
        GregorianCalendar calendar1end = new GregorianCalendar(2016,Calendar.MARCH, 10);
        GregorianCalendar calendar2start = new GregorianCalendar(2016,Calendar.JANUARY, 1);
        GregorianCalendar calendar2end = new GregorianCalendar(2016,Calendar.JANUARY, 1);
        GregorianCalendar calendar3start = new GregorianCalendar(2016,Calendar.JANUARY, 1);
        GregorianCalendar calendar3end = new GregorianCalendar(2016,Calendar.JANUARY, 1);
        ArrayList<String> arraydateweek1= new ArrayList<String>();
        ArrayList<String> arraydateweek2= new ArrayList<String>();
        ArrayList<String> arraydateweek3= new ArrayList<String>();
        arraydateweek1.add("Mon");
        arraydateweek1.add("Wen");
        arraydateweek1.add("Fri");
        arraydateweek2.add("Mon");
        arraydateweek2.add("The");
        arraydateweek2.add("Fri");
        arraydateweek3.add("Mon");
        arraydateweek3.add("Wen");
        arraydateweek3.add("Sat");
        Course course1 = new Course(1,"Java base","Java for beginers",calendar1start,calendar1end,arraydateweek1);

        Course course2 = new Course(2,"Net base","Net for beginers",calendar2start,calendar2end,arraydateweek2);
        Course course3 = new Course(3,"Tester base","Tester for beginers",calendar3start,calendar3end,arraydateweek3);
       // System.out.print();
        listCourses.add(course1);
        listCourses.add(course2);
        listCourses.add(course3);
       // System.out.println(calendar1start.get(calendar1start.YEAR));
        for (Course cr: listCourses){
            System.out.println(cr);
        }

        Student student1 = new Student(1,"Petr","Pertov",{1,3});
    }
}

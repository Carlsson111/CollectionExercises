package se.lexicon;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex6();
    }
    public static void ex1(){
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday ");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        System.out.println(daysOfWeek);



    }
    public static void ex2(){
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday ");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        for (String day : daysOfWeek) {
            System.out.println(day);
        }

    }
    public static void ex3(){
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday ");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        int index = daysOfWeek.indexOf("Friday"); // Creates index and finds ""

        daysOfWeek.add(index,"Thursday"); //Replaces "Friday" with "Thursday" then adds +1 size

        System.out.println(daysOfWeek);
    }
    public static void ex4(){
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday ");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        List<String> firstThreeDays = daysOfWeek.subList(0, 3); // looks though the list 0,1,2 and stops before 3
        System.out.println(firstThreeDays); // prints out the elements of sublist,


    }
    public static void ex5(){
        Set<String> daysOFWeek= new HashSet<>();

        daysOFWeek.add("Monday");
        daysOFWeek.add("Tuesday");
        daysOFWeek.add("Wednesday");
        daysOFWeek.add("Thursday");
        daysOFWeek.add("Friday");
        daysOFWeek.add("Saturday");
        daysOFWeek.add("Sunday");


        System.out.println(daysOFWeek);

    }
    public static void ex6(){
        Set<String> daysOFWeek= new HashSet<>();

        daysOFWeek.add("Monday");
        daysOFWeek.add("Tuesday");
        daysOFWeek.add("Wednesday");
        daysOFWeek.add("Thursday");
        daysOFWeek.add("Friday");
        daysOFWeek.add("Saturday");
        daysOFWeek.add("Sunday");

        List<String> daysOfWeekList = new ArrayList<>(daysOFWeek);

        System.out.println(daysOFWeek);

    }

    public static void ex7(){

    }




}
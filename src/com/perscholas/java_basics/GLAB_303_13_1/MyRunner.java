package com.perscholas.java_basics.GLAB_303_13_1;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class MyRunner {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            String location = "src/com/perscholas/java_basics/GLAB_303_13_1/CourseData.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<Course> data = new ArrayList<Course>();

            while(input.hasNextLine()){
                String line = input.nextLine();
                String [] splittedLine = line.split(",");
                Course obj = new Course();
                obj.setCode(splittedLine[0]);
                obj.setCourse_name(splittedLine[1]);
                obj.setInstructor_name(splittedLine[2]);
                data.add(obj);
            }
            for(Course c : data){
                System.out.println(c.getCode() +" | " +c.getCourse_name() +" | " +c.getInstructor_name());
                System.out.println("====================================================");
            }

        }catch(FileNotFoundException e){
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}

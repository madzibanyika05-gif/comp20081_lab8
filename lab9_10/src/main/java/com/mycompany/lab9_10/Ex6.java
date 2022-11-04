/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9_10;


import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author ntu-user
 */
public class Ex6 {

    public static void main(String[] args) throws IOException {
        File file = new File("grades.csv");
        //TODO add you code here 
        
        // create FileWriter object with file as parameter

        // add header to csv
        System.out.println("Saving into file grades.csv");
        String[] header = {"Name", "Class", "Marks"};

        // add data to csv
        String[] data1 = {"John Doe", "10", "620"};

        String[] data2 = {"Joanne Doe", "10", "630"};

    }
}
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9_10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;
/**
 *
 * @author ntu-user
 */
public class Ex4 {
    public static void main(String[] args) throws FileNotFoundException {
        
                //TODO add you code here

		//create empBuilder and of type JsonObjectBuilder with the following fields:

                //street
                //city
                //zipcode
                //create addressBuilder of type JsonObjectBuilder with the following fields:
                //
                //id
                //name
                //permanent
                //role
                //phoneNumbers
                //address
                //create phoneNumBuilder of type JsonArrayBuilder to accept multiple mobile numbers
        
		
		//write to file emp.json
		
		
	}
	

	public static Employee createEmployee() {
            
            Employee emp = new Employee();
            //TODO add you code here

            //Add the following employee to an object emp of type employee in the method createEmployee()
            //
            //Id: 100
            //
            //name: Joanne Doe
            //
            //permanent: false
            //
            //Phone numbers: 123456, 987654
            //
            //role: Manager
            //
            //create the address of type Address with the following information:
            //
            //city: Nottigham
            //
            //street: somewhere
            //
            //zip code: NG1 1FX
            //
            //add the obj address to emp

            return emp;
	}
}

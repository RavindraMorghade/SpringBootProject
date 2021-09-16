package com.tbp.crud.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	
	public static void main(String[] args) throws ParseException {
		
		String sd ="15/09/2021";
		String sd1 ="09-15-2021";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
		
		Date d = sdf.parse(sd);
		Date d1 = sdf1.parse(sd1);
		 
		System.out.println(d);
		System.out.println(d1);
	}

}

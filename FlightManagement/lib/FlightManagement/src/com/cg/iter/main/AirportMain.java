package com.cg.iter.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.iter.dao.AirportDaoImpl;
import com.cg.iter.dto.AirportDTO;
import com.cg.iter.exception.airportNotFoundException;
import com.cg.iter.service.AirportService;
import com.cg.iter.service.AirportServiceImpl;

public class AirportMain {
	private AirportService aservice; 
	
	public AirportMain(AirportService aservice){
		this.aservice=aservice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		AirportService airportmain = new AirportServiceImpl();
		String arr[] = {"A111","A222","A333","A444"};
		List<AirportDTO> list;
		list = airportmain.viewAirport(arr);
		System.out.println("List of all Airports are : ");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getAirportName());
		}
		
		try {
			System.out.println("Enter the airport code");
			String airportCode = sc.next();
			AirportDTO air;
			air = airportmain.viewAirport(airportCode);
			System.out.println(air);
		} catch (airportNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}

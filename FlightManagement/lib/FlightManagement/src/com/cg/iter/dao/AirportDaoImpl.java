package com.cg.iter.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.iter.dto.AirportDTO;
import com.cg.iter.util.AirportDatabase;


public class AirportDaoImpl implements AirportDao{
	private AirportDatabase adb = new AirportDatabase();
//	private Map<String,AirportDTO> airportMap= new HashMap<>();
//	AirportDTO airport;
//	
//	public AirportDaoImpl() {
//		airportMap.put("A111", new AirportDTO("BangaloreAirport","A111","Bangalore"));
//		airportMap.put("A222", new AirportDTO("DelhiAirport","A222","Delhi"));
//		airportMap.put("A333", new AirportDTO("MumbaiAirport","A333","Mumbai"));
//		airportMap.put("A444", new AirportDTO("ChennaiAirport","A444","Chennai"));
//		
//	}
//	

	@Override
	public List<AirportDTO> viewAirport(String arr[]) {
		List<AirportDTO> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(adb.getAllAirport().get(arr[i]));
		}
		
		return list;
	}
	public AirportDTO viewAirport(String airportCode) {
		return adb.getAllAirport().get(airportCode);
		
	}





}

package com.cg.iter.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.iter.dto.AirportDTO;


public class AirportDatabase {
	private static Map<String,AirportDTO> airportMap= new HashMap<>();
	static{
		airportMap.put("A111", new AirportDTO("BangaloreAirport","A111","Bangalore"));
		airportMap.put("A222", new AirportDTO("DelhiAirport","A222","Delhi"));
		airportMap.put("A333", new AirportDTO("MumbaiAirport","A333","Mumbai"));
		airportMap.put("A444", new AirportDTO("ChennaiAirport","A444","Chennai"));
	}
	public Map<String,AirportDTO> getAllAirport() {
		return airportMap;
		//if(airportMap==null)throw new DataNotFoundException("There is no airport information available");
	}
}

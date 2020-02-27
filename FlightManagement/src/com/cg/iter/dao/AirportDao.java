package com.cg.iter.dao;

import java.util.List;

import com.cg.iter.dto.AirportDTO;



public interface AirportDao {
	
	public List<AirportDTO> viewAirport(String arr[]);
	public AirportDTO viewAirport(String airportCode) ;
		
	//public List<AirportDTO> viewAirport(String airportCode) ;
}

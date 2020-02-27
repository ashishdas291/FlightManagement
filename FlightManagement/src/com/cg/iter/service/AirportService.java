package com.cg.iter.service;

import java.util.List;

import com.cg.iter.dto.AirportDTO;
import com.cg.iter.exception.airportNotFoundException;

public interface AirportService {
	List<AirportDTO> viewAirport(String arr[]);
	public AirportDTO viewAirport(String airportCode) throws airportNotFoundException;
}

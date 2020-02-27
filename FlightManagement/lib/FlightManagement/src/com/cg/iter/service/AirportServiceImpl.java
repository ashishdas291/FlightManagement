package com.cg.iter.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.iter.dao.AirportDaoImpl;
import com.cg.iter.dto.AirportDTO;
import com.cg.iter.exception.airportNotFoundException;

public class AirportServiceImpl implements AirportService {
	List<AirportDTO> airportlist ;
	AirportDaoImpl airportDao;

	public AirportServiceImpl()  {

		airportDao=new AirportDaoImpl();
	
	}
	@Override
public List<AirportDTO> viewAirport(String arr[])  {
	      
	return airportDao.viewAirport(arr);
}
	@Override
	public AirportDTO viewAirport(String airportCode) throws airportNotFoundException {
		AirportDTO  re = airportDao.viewAirport(airportCode);
		if(re==null)throw new airportNotFoundException("No airport with this name!!");
		
		return re;
	}


}

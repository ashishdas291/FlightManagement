package com.cg.iter.dto;

public class AirportDTO {
	private String airportName;
	private String airportCode;
	private String airportLocation;
	public AirportDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportLocation() {
		return airportLocation;
	}
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
	
	@Override
	public String toString() {
		return "airportName=" + airportName + ", airportCode=" + airportCode + ", airportLocation="
				+ airportLocation ;
	}
	public AirportDTO(String airportName,String airportCode,String airportLocation){
		this.airportName=airportName;
		this.airportCode=airportCode;
		this.airportLocation=airportLocation;
	}
}

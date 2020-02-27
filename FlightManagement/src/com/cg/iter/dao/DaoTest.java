package com.cg.iter.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.iter.dto.AirportDTO;

public class DaoTest {
	private static AirportDaoImpl test;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		test = new AirportDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void viewAirporttest() {
		AirportDTO  obj = test.viewAirport("A111");
		assertNotNull(obj);
	}

}

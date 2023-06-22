package com.example.trip.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.trip.dto.Trip;

public interface TripService {
	public int maxNum() throws Exception;
	
	public void insertData(Trip trip) throws Exception;
	
	public int getDataCount(String searchKey, String searchValue) throws Exception;
	
	public List<Trip> getLists(String searchKey, String searchValue, int start, int end) throws Exception;
	
	public void updateHitCount(int num) throws Exception;
	
	public Trip getReadData(int num) throws Exception;
	
	public void updateData(Trip trip) throws Exception;
	
	public void deleteData(int num) throws Exception;
	
}

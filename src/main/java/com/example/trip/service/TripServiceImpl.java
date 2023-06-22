package com.example.trip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.trip.dao.TripDao;
import com.example.trip.dto.Trip;

@Service
public class TripServiceImpl implements TripService{

	@Autowired
	private TripDao tripMapper;

	@Override
	public int maxNum() throws Exception {
		return tripMapper.maxNum();
	}

	@Override
	public void insertData(Trip trip) throws Exception {
		tripMapper.insertData(trip);
	}

	@Override
	public int getDataCount(String searchKey, String searchValue) throws Exception {
		return tripMapper.getDataCount(searchKey, searchValue);
	}

	@Override
	public List<Trip> getLists(String searchKey, String searchValue, int start, int end) throws Exception {
		return tripMapper.getLists(searchKey, searchValue, start, end);
	}

	@Override
	public void updateHitCount(int num) throws Exception {
		tripMapper.updateHitCount(num);
	}

	@Override
	public Trip getReadData(int num) throws Exception {
		return tripMapper.getReadData(num);
	}

	@Override
	public void updateData(Trip trip) throws Exception {
		tripMapper.updateData(trip);
	}

	@Override
	public void deleteData(int num) throws Exception {
		tripMapper.deleteData(num);
	}


}

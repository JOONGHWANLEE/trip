package com.example.trip.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Trip {
	private int num;
	private String name;
	private String address;
	private String subject;
	private String content;
	private int hitCount;
	private String created;
	private String img;
}

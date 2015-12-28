package com.xuejun.entity;

public class Address extends IdEntity {
	private String city;
	private String county;
	private Long userId;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", county=" + county + ", userId=" + userId + ", id=" + id + "]";
	}
	
}

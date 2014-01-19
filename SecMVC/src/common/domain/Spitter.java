package common.domain;

import java.util.List;

public class Spitter {
	private int id;
	private String userName;
	List<Spittle> spittles;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Spittle> getSpittles() {
		return spittles;
	}
	public void setSpittles(List<Spittle> spittles) {
		this.spittles = spittles;
	}
	
}

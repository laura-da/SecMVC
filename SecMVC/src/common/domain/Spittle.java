package common.domain;

import java.util.Date;

public class Spittle {
	private int id;
	private String text;
	private Date created;
	private Spitter owner;
	
	public Spittle(Spitter o) {
		owner = o;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Spitter getOwner() {
		return owner;
	}
	
}

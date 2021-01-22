package com.javaex.vo;

public class PersonVo {

	private int person_id;
	private String name;
	private String hp;
	private String company;
	
	public PersonVo() {
	}
	
	public PersonVo(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	public PersonVo(int person_id, String name, String hp, String company) {
		this.person_id = person_id;
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	public int getPerson_id() {
		return person_id;
	}
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	public String getCompany() {
		return company;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String toString() {
		return "["+person_id+", "+name+", "+hp+", "+company+", "+"]";
	}
}

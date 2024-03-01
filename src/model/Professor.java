package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Professor {
	private long p_id;
	private String name;
	private String surname;
	private Degree profDegree;
	
	private static long counter = 0;
	
	public long getP_id() {
		return p_id;
	}
	public void setP_id(long p_id) {
		this.p_id = p_id;
		counter++;
	}
	public String getName() {
		if (name != null && name.matches("[A-Z]{1}[a-z]{1-20}"))
			this.name = name;
		else {
			this.name = "undefined";
		}
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		if (surname != null && surname.matches("[A-Z]{1}[a-z]{1-20}"))
			this.surname = surname;
		else {
			this.surname = "undefined";
	}
	public Degree getProfDegree() {
		return profDegree;
	}
	public void setProfDegree(Degree profDegree) {
		this.profDegree = profDegree;
	}

		
}

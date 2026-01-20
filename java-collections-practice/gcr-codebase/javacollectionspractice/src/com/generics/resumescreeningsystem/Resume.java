package com.generics.resumescreeningsystem;

public class Resume<T extends JobRole> {
	String name;
	T role;
	
	public Resume(String name, T role) {
		this.name = name;
		this.role = role;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getRole() {
		return role.getRole();
	}
	
	public String toString() {
		return name + " " + role.getRole();
	}
}

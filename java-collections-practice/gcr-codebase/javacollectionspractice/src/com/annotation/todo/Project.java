package com.annotation.todo;

public class Project {
	@Todo(
			task ="tuition",
			assignedTo ="harshita",
			priority="MEDIUM"
			)
	public void teaching() {
		
	}
	@Todo(
	        task = "Add payment gateway",
	        assignedTo = "Amit"
	    )
	    public void paymentFeature() {
	    }
	@Todo(
	        task = "Improve UI",
	        assignedTo = "Neha",
	        priority = "LOW"
	    )
	    public void uiFeature() {
	    }


	

}

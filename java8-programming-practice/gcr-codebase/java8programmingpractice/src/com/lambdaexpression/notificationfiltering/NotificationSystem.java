package com.lambdaexpression.notificationfiltering;

import java.util.*;

public class NotificationSystem {
	public static void main(String[] args) {
		List<User> list = List.of(
				new User("user1", true), 
				new User("user2", false), 
				new User("user3", true), 
				new User("user4", false), 
				new User("user5", true)
				);
		
		list.stream().filter(u -> u.preference).forEach(u -> u.sendNotification());
	}
}
package org.gradle;

import org.gradle.type.User;

public class MainClass {

	public static void main(String[] args) {
		org.gradle.xml.User user = new org.gradle.xml.User();
		user.setName("Manu");
		User userType = RequestMapper.INSTANCE.map(user);
		System.out.println(userType);

	}

}

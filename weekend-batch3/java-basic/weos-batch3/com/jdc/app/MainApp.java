package com.jdc.app;

import com.jdc.app.pkg2.PackageTwo;
import com.jdc.app.pkg1.Access;

// public

class MainApp {

	public static void main(String[] args) {
		PackageTwo two = new PackageTwo();
		two.showInfo();

		System.out.println("===============");
		Access acc = new Access();
		acc.showInfo();

	}
	
}
package com.jdc.app.pkg1;

public class Access {

	public void showInfo() {
		PackageOne one = new PackageOne();
		// System.out.println(one.priVar);
		System.out.println(one.defVar);
		System.out.println(one.proVar);
		System.out.println(one.pubVar);
	}
	
}
package com.jdc.app;

import com.jdc.factory.EntityFactory;

public class FactoryApp {
	
	public static void main(String[] args) {
		
		var ent1 = EntityFactory.withName("Person");
		
		var ent2 = EntityFactory.withCatalog("Person Catalog");
		
		var ent3 = EntityFactory.withNameAndCatalog("Student", "Student Catalog");

		System.out.println("""
				%s
				%s
				%s
				%s
				""".formatted(
						ent1.getName(), ent2.getCatalog(),
						ent3.getName(), ent3.getCatalog()
							 )
						  );
	}

}

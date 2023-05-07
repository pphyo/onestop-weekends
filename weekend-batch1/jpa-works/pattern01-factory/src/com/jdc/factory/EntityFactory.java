package com.jdc.factory;

public class EntityFactory {
	
	public static Entity withName(String name) {
		var entity = new Entity();
		entity.setName(name);
		return entity;
	}
	
	public static Entity withCatalog(String catalog) {
		var entity = new Entity();
		entity.setCatalog(catalog);
		return entity;
	}
	
	public static Entity withSchema(String schema) {
		var entity = new Entity();
		entity.setSchema(schema);
		return entity;
	}

	public static Entity withNameAndCatalog(String name, String catalog) {
		var entity = new Entity();
		entity.setName(name);
		entity.setCatalog(catalog);
		return entity;
	}

}

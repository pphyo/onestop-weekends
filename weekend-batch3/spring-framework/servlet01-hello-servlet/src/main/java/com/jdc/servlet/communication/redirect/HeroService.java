package com.jdc.servlet.communication.redirect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeroService {
	
	private List<Hero> database = new ArrayList<>();
	
	public boolean save(Hero hero) {
		return database.add(hero);
	}
	
	public List<Hero> getAll() {
		return Collections.unmodifiableList(database);
	}

}

package com.jdc.stream.optional;

import java.util.Optional;

public class OptionalApp {
	
	public static void main(String[] args) {

		var app = new OptionalApp();
		System.out.println(app.getCarInsuranceName(null));
		
		System.out.println(app.getCarInsuranceNameOptional(Optional.ofNullable(null)));

	}
	
	String getCarInsuranceNameOptional(Optional<Person> person) {
		return person.map(Person::getCar) // arbitrary method reference
					 .map(Car::getInsurance)
					 .map(Insurance::getName)
					 .orElse("Unknown");
	}
	
	String getCarInsuranceName(Person person) {
		
		if(person == null) {
			return "Unknown";
		}
		
		var car = person.getCar();
		if(null == car) {
			return "Unknown";
		}
		
		var insurance = car.getInsurance();
		if(null == insurance) {
			return "Unknown";
		}
		
		return insurance.getName();
		
//		if(person != null) {
//			var car = person.getCar();
//			
//			if(car != null) {
//				var insurance = car.getInsurance();
//				
//				if(null != insurance) {
//					return insurance.getName();
//				}
//			}
//		}
//		return "Unknown";
	}

}




package com.jdc.app.override;

public class OverrideApp {

	public static void main(String[] args) {
		
		Vehicle honda = new MotorCycle(); // Upcasting or Implicit
		honda.onStop();
		
//		Car car = (Car) honda; // Downcasting or Explicit
//		car.playMusicWithDvdPlayer();
		
		System.out.println(honda.getInstData());
		
		display(new MotorCycle());

	}
	
	static void display(Vehicle veh) {
		System.out.println(veh instanceof MotorCycle);
		if(veh instanceof Car) {
			Car car = (Car) veh;
			car.playMusicWithDvdPlayer();
		} else if(veh instanceof MotorCycle) {
			MotorCycle cycle = (MotorCycle) veh;
			cycle.onStart();
		}
	}

}







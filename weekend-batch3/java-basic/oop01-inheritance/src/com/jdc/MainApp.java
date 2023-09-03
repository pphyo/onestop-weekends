package com.jdc;

import java.util.Calendar;

import com.jdc.abstraction.Animal;
import com.jdc.abstraction.Bird;
import com.jdc.abstraction.Flyable;
import com.jdc.compo.Document;
import com.jdc.compo.Printer;
import com.jdc.inherit.Student;
import com.jdc.inherit.StudentChild;

class A {
	public void load() {
		System.out.println("A loads");
	}
}

class B extends A {
	@Override
	public void load() {
		System.out.println("B loads");
	}
}

public class MainApp {

	public static void main(String[] args) {
		MainApp app = new MainApp();
		A a = new B();
		app.overload(a);
	}
	
	void overload(A a) {
		System.out.println("A version");
		a.load();
	}
	
	void overload(B b) {
		System.out.println("B version");
		b.load();
	}
	
	static void runAbstraction() {
		startAction(new Bird("", "", 0));
		
		// anonymous inner class
		Flyable fly = new Flyable() {
			
			@Override
			public void fly() {
				System.out.println("Flyable Object fly");				
			}
		};
		
		fly = new Bird("", "", 0);
		
		fly.fly();
	}
	
	private static void startAction(Animal ani) {
//		ani = new Animal("", "", 0) {
//			
//			@Override
//			public void eat() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		// pattern matching
		if(ani instanceof Bird b) {
//			Bird b = (Bird)ani;
			b.eat();
			b.fly();
			b.swim();
		} else {
			System.out.println("Your object is not a bird.");
		}
	}
	
	static void runComposition() {
		Document doc = new Document();
		doc.setName("Low-Fieldility Prototype");
		doc.setCreated(Calendar.getInstance().getTime());
		doc.setDocText("Lo-Fi for Flower Delivery App");
		doc.setOwner("Pyae Phyo");
		doc.setWordCount(300);
		
		Printer printer = new Printer();
		printer.setDocument(doc);
		printer.print();
	}
	
	static void runInheritance() {
		Student stu = new StudentChild();
		System.out.println(StudentChild.rollNo); // RN-10
		System.out.println(stu.avgMark); // 300
		
		stu.study(); // 
		Student.gotoExam(); // student
	}

}

package com.jdc;

import java.util.Calendar;

import com.jdc.abstraction.Animal;
import com.jdc.abstraction.Bird;
import com.jdc.abstraction.Dog;
import com.jdc.abstraction.Horse;
import com.jdc.compo.Document;
import com.jdc.compo.Printer;
import com.jdc.inherit.Student;
import com.jdc.inherit.StudentChild;

public class MainApp {

	public static void main(String[] args) {
		runAbstraction();
	}
	
	static void runAbstraction() {
		startAction(new Bird("", "", 0));
	}
	
	private static void startAction(Animal ani) {
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

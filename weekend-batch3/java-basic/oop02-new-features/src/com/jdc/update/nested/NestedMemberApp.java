package com.jdc.update.nested;

public class NestedMemberApp {

	public static void main(String[] args) {
		
		Outer.StaticInner stInner = new Outer.StaticInner();
		stInner.doStaticInner();
		
		Outer.InstanceInner instInner = new Outer().new InstanceInner();
		instInner.doInstanceInner();
		
	}

}

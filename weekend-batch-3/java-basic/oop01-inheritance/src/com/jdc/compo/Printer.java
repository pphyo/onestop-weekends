package com.jdc.compo;

public class Printer {
	
	// Composition or has a relationship
	private Document document;
	
	public void setDocument(Document document) {
		this.document = document;
	}
	
	public void print() {
		System.out.println(document.getName());
		System.out.println(document.getDocText());
		System.out.println(document.getCreated());
		System.out.println(document.getOwner());
		System.out.println(document.getWordCount());
	}

}

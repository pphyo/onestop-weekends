package com.jdc.prototype;

public class AppService {
	
	private String data;
	
	public AppService clone() {
		var cloneObj = new AppService();
		cloneObj.setData(this.data);
		return cloneObj;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}

package com.jdc.app;

public class Outer {

	private int outData;

	public int getOutData() {
		return outData;
	}

	public void setOutData(int outData) {
		this.outData = outData;

	}

	static class InnerStatic {

		private int inData;

		public int getInData() {
			return inData;
		}

		public void setInData(int inData) {
			this.inData = inData;
		}

	}

	class InnerInstance {

		private int inData;

		public int getInData() {
			return inData;
		}

		public void setInData(int inData) {
			this.inData = inData;
		}

	}

}

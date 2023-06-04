package com.chandan.mockito.mockitodemo.business;

public class SomeBusinessImplStubTest {

	private DataService dataservice;

	public SomeBusinessImplStubTest(DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}

	public int findGreatestFromAllData() {

		int[] data = dataservice.retrieveAllData();
		int greatestValue = Integer.MIN_VALUE;
		for (int value : data) {
			if (value > greatestValue) {
				greatestValue = value;
			}
		}
		return greatestValue;
	}

}

interface DataService {
	int[] retrieveAllData();
}
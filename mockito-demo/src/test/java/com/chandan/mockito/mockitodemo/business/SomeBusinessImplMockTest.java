package com.chandan.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

	@Mock
	private DataService dataServiceMock;

	@InjectMocks
	private SomeBusinessImplStubTest businessImpl;

	@Test
	void findGreatestFromAllData_basicScenario() {

	//	DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 25, 15, 5 });
	//	SomeBusinessImplStubTest businessImpl = new SomeBusinessImplStubTest(dataServiceMock);
		assertEquals(25, businessImpl.findGreatestFromAllData());
	}

	@Test
	void findGreatestFromAllData_OneValue() {

	//	DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 35 });
	//	SomeBusinessImplStubTest businessImpl = new SomeBusinessImplStubTest(dataServiceMock);
		assertEquals(35, businessImpl.findGreatestFromAllData());
	}

	@Test
	void findGreatestFromAllData_EmptyArray() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { });
		assertEquals(Integer.MIN_VALUE, businessImpl.findGreatestFromAllData());
	}

}

//class DataServiceStub implements DataService {
//
//	@Override
//	public int[] retrieveAllData() {
//		return new int[] { 25, 15, 5 };
//	}

//}

package com.chandan.mockito.mockitodemo.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {

	@Test
	void simpleTest() {

		List listMock = mock(List.class);

		when(listMock.size()).thenReturn(3);

		assertEquals(3, listMock.size());

	}

	@Test
	void multipleReturns() {

		List listMock = mock(List.class);

		when(listMock.size()).thenReturn(1).thenReturn(2);

		assertEquals(1, listMock.size());
		assertEquals(2, listMock.size());

	}

	@Test
	void specificparameters() {

		List listMock = mock(List.class);

		when(listMock.get(0)).thenReturn("some string back");
		assertEquals("some string back", listMock.get(0));
		assertEquals(null, listMock.get(1));

	}

	@Test
	void genericparameters() {

		List listMock = mock(List.class);

		when(listMock.get(Mockito.anyInt())).thenReturn("some other string back");
		assertEquals("some other string back", listMock.get(0));
		assertEquals("some other string back", listMock.get(1));

	}

}

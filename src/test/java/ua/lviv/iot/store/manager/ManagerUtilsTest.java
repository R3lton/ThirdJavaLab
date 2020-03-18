package ua.lviv.iot.store.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.store.model.AbstractMusicalInstrument;
import ua.lviv.iot.store.model.SortType;

class ManagerUtilsTest extends BaseMusicalInstrumentTest {
	@BeforeEach
	void setUp() throws Exception {
		createInstruments();
	}

	@Test
	void testSortProductByPriceInUAHAscending() {
		List<AbstractMusicalInstrument> sortedProducts = ManagerUtils.sortProductByPriceInUAH(instruments,
				SortType.ASCENDING);
		assertEquals(700.50, sortedProducts.get(0).getPriceInUAH());
		assertEquals(710.50, sortedProducts.get(1).getPriceInUAH());
		assertEquals(1300.50, sortedProducts.get(2).getPriceInUAH());
		assertEquals(1350.50, sortedProducts.get(3).getPriceInUAH());
		assertEquals(2000.50, sortedProducts.get(4).getPriceInUAH());
		assertEquals(2100.50, sortedProducts.get(5).getPriceInUAH());
	}

	@Test
	void testSortProductByPriceInUAHDescending() {
		List<AbstractMusicalInstrument> sortedProducts = ManagerUtils.sortProductByPriceInUAH(instruments,
				SortType.DESCENDING);
		assertEquals(2100.50, sortedProducts.get(0).getPriceInUAH());
		assertEquals(2000.50, sortedProducts.get(1).getPriceInUAH());
		assertEquals(1350.50, sortedProducts.get(2).getPriceInUAH());
		assertEquals(1300.50, sortedProducts.get(3).getPriceInUAH());
		assertEquals(710.50, sortedProducts.get(4).getPriceInUAH());
		assertEquals(700.50, sortedProducts.get(5).getPriceInUAH());
	}

	@Test
	void testSortProductByColorAscending() {
		List<AbstractMusicalInstrument> sortedProducts = ManagerUtils.sortProductByColor(instruments,
				SortType.ASCENDING);
		assertEquals("Black", sortedProducts.get(0).getColor());
		assertEquals("Black", sortedProducts.get(1).getColor());
		assertEquals("Green", sortedProducts.get(2).getColor());
		assertEquals("Red", sortedProducts.get(3).getColor());
		assertEquals("White", sortedProducts.get(4).getColor());
		assertEquals("Yellow", sortedProducts.get(5).getColor());
	}

	@Test
	void testSortProductByColorDescending() {
		List<AbstractMusicalInstrument> sortedProducts = ManagerUtils.sortProductByColor(instruments,
				SortType.DESCENDING);
		assertEquals("Yellow", sortedProducts.get(0).getColor());
		assertEquals("White", sortedProducts.get(1).getColor());
		assertEquals("Red", sortedProducts.get(2).getColor());
		assertEquals("Green", sortedProducts.get(3).getColor());
		assertEquals("Black", sortedProducts.get(4).getColor());
		assertEquals("Black", sortedProducts.get(5).getColor());
	}
}
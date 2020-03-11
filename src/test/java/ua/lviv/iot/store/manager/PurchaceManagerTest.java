package ua.lviv.iot.store.manager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EnumSet;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.store.manager.PurchaceManager;
import ua.lviv.iot.store.model.AbstractMusicalInstrument;
import ua.lviv.iot.store.model.TypeOfMusicalInstrument;
import ua.lviv.iot.store.model.MusicalInstrumentForBand;

class PurchaceManagerTest extends BaseMusicalInstrumentTest {

	@BeforeEach
	void setUp() {
		createInstruments();
	}

	@Test
	void testFindProductByType() {
		PurchaceManager manager = new PurchaceManager(instruments);

		List<AbstractMusicalInstrument> productFromWindInstrumentFound = manager
				.findProductByType(EnumSet.of(TypeOfMusicalInstrument.WIND_INSTRUMENTS));
		assertEquals(2, productFromWindInstrumentFound.size());
		for (AbstractMusicalInstrument currentProductsAvailable : productFromWindInstrumentFound) {
			assertTrue(currentProductsAvailable.getTypeOfMusicalInstrument()
					.contains(TypeOfMusicalInstrument.WIND_INSTRUMENTS));
		}

		List<AbstractMusicalInstrument> productFromPercussionInstrumentFound = manager
				.findProductByType(EnumSet.of(TypeOfMusicalInstrument.PERCUSSION_INSTRUMENTS));
		assertEquals(2, productFromPercussionInstrumentFound.size());
		for (AbstractMusicalInstrument currentProductsAvailable : productFromPercussionInstrumentFound) {
			assertTrue(currentProductsAvailable.getTypeOfMusicalInstrument()
					.contains(TypeOfMusicalInstrument.PERCUSSION_INSTRUMENTS));
		}

		List<AbstractMusicalInstrument> productFromFolkInstrumentFound = manager
				.findProductByType(EnumSet.of(TypeOfMusicalInstrument.FOLK_INSTRUMENTS));
		assertEquals(2	, productFromFolkInstrumentFound.size());
		for (AbstractMusicalInstrument currentProductsAvailable : productFromFolkInstrumentFound) {
			assertTrue(currentProductsAvailable.getTypeOfMusicalInstrument()
					.contains(TypeOfMusicalInstrument.FOLK_INSTRUMENTS));
		}

	}

	@Test
	void testFindProductForBand() {
		PurchaceManager manager = new PurchaceManager(instruments);

		List<AbstractMusicalInstrument> productForRockBand = manager
				.findProductForBand(EnumSet.of(MusicalInstrumentForBand.ROCK_BAND));
		assertEquals(2, productForRockBand.size());
		for (AbstractMusicalInstrument currentProductsAvailable : productForRockBand) {
			assertTrue(currentProductsAvailable.getMusicalInstrumentForBand()
					.contains(MusicalInstrumentForBand.ROCK_BAND));
		}

		List<AbstractMusicalInstrument> productForJazzBand = manager
				.findProductForBand(EnumSet.of(MusicalInstrumentForBand.JAZZ_BAND));
		assertEquals(4, productForJazzBand.size());
		for (AbstractMusicalInstrument currentProductsAvailable : productForJazzBand) {
			assertTrue(currentProductsAvailable.getMusicalInstrumentForBand()
					.contains(MusicalInstrumentForBand.JAZZ_BAND));
		}

		List<AbstractMusicalInstrument> productForFolkOrchestra = manager
				.findProductForBand(EnumSet.of(MusicalInstrumentForBand.FOLK_ORCHESTRA));
		assertEquals(4, productForFolkOrchestra.size());
		for (AbstractMusicalInstrument currentProductsAvailable : productForFolkOrchestra) {
			assertTrue(currentProductsAvailable.getMusicalInstrumentForBand()
					.contains(MusicalInstrumentForBand.FOLK_ORCHESTRA));
		}
	}
}
package ua.lviv.iot.store.manager;

import java.util.LinkedList;
import java.util.List;
import java.util.EnumSet;

import ua.lviv.iot.store.model.AbstractMusicalInstrument;
import ua.lviv.iot.store.model.TypeOfMusicalInstrument;
import ua.lviv.iot.store.model.MusicalInstrumentForBand;
import ua.lviv.iot.store.model.Domra;
import ua.lviv.iot.store.model.Drums;
import ua.lviv.iot.store.model.Panpipe;

class BaseMusicalInstrumentTest {
	protected List<AbstractMusicalInstrument> instruments = new LinkedList<AbstractMusicalInstrument>();

	public void createInstruments() {
		instruments.add(new Domra(23, "Black", 1350.50, 1.5, EnumSet.of(TypeOfMusicalInstrument.FOLK_INSTRUMENTS),
				EnumSet.of(MusicalInstrumentForBand.FOLK_ORCHESTRA)));
		instruments.add(new Domra(24, "Red", 1300.50, 1.2, EnumSet.of(TypeOfMusicalInstrument.FOLK_INSTRUMENTS),
				EnumSet.of(MusicalInstrumentForBand.FOLK_ORCHESTRA)));
		instruments.add(new Drums(21, "Green", 2000.50, 5.5, EnumSet.of(TypeOfMusicalInstrument.PERCUSSION_INSTRUMENTS),
				EnumSet.of(MusicalInstrumentForBand.ROCK_BAND, MusicalInstrumentForBand.JAZZ_BAND)));
		instruments.add(new Drums(22, "White", 2100.50, 5.5, EnumSet.of(TypeOfMusicalInstrument.PERCUSSION_INSTRUMENTS),
				EnumSet.of(MusicalInstrumentForBand.ROCK_BAND, MusicalInstrumentForBand.JAZZ_BAND)));
		instruments.add(new Panpipe(31, "Black", 700.50, 1, EnumSet.of(TypeOfMusicalInstrument.WIND_INSTRUMENTS),
				EnumSet.of(MusicalInstrumentForBand.JAZZ_BAND, MusicalInstrumentForBand.FOLK_ORCHESTRA)));
		instruments.add(new Panpipe(32, "Yellow", 710.50, 1, EnumSet.of(TypeOfMusicalInstrument.WIND_INSTRUMENTS),
				EnumSet.of(MusicalInstrumentForBand.JAZZ_BAND, MusicalInstrumentForBand.FOLK_ORCHESTRA)));

	}

}

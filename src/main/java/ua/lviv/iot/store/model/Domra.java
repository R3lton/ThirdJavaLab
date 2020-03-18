package ua.lviv.iot.store.model;

import java.util.EnumSet;

public class Domra extends AbstractMusicalInstrument {

	private int musicalStrings;

	public Domra(int id, String color, double priceInUAH, double weightInKilograms,
			EnumSet<TypeOfMusicalInstrument> typeOfMusicalInstrument,
			EnumSet<MusicalInstrumentForBand> musicalInstrumentForBand) {
		super(id, color, priceInUAH, weightInKilograms, typeOfMusicalInstrument, musicalInstrumentForBand);
	}

	public int getMusicalStrings() {
		return musicalStrings;
	}

	public void setMusicalStrings(int musicalStrings) {
		this.musicalStrings = musicalStrings;
	}

}

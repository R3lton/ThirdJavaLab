package ua.lviv.iot.store.model;

import java.util.EnumSet;

public class Panpipe extends AbstractMusicalInstrument {

	private int numberOfHoles;

	public Panpipe(int iD, String color, double priceInUAH, double weightInKilograms,
			EnumSet<TypeOfMusicalInstrument> typeOfMusicalInstrument,
			EnumSet<MusicalInstrumentForBand> musicalInstrumentForBand) {
		super(iD, color, priceInUAH, weightInKilograms, typeOfMusicalInstrument, musicalInstrumentForBand);
	}

	public int getNumberOfHoles() {
		return numberOfHoles;
	}

	public void setNumberOfHoles(int numberOfHoles) {
		this.numberOfHoles = numberOfHoles;
	}

}

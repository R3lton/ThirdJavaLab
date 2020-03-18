package ua.lviv.iot.store.model;

import java.util.EnumSet;

public class Drums extends AbstractMusicalInstrument {

	private int numberOfDrumSticks;

	public Drums(int id, String color, double priceInUAH, double weightInKilograms,
			EnumSet<TypeOfMusicalInstrument> typeOfMusicalInstrument,
			EnumSet<MusicalInstrumentForBand> musicalInstrumentForBand) {
		super(id, color, priceInUAH, weightInKilograms, typeOfMusicalInstrument, musicalInstrumentForBand);
	}

	public int getNumberOfDrumSticks() {
		return numberOfDrumSticks;
	}

	public void setNumberOfDrumSticks(int numberOfDrumSticks) {
		this.numberOfDrumSticks = numberOfDrumSticks;
	}

}

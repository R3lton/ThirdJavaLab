package ua.lviv.iot.store.model;

import java.util.EnumSet;

public class Panpipe extends AbstractMusicalInstrument {

	private int numberOfHoles;

	public Panpipe(int id, String color, double priceInUAH, double weightInKilograms,
			EnumSet<TypeOfMusicalInstrument> typeOfMusicalInstrument,
			EnumSet<MusicalInstrumentForBand> musicalInstrumentForBand) {
		super(id, color, priceInUAH, weightInKilograms, typeOfMusicalInstrument, musicalInstrumentForBand);
	}

	public int getNumberOfHoles() {
		return numberOfHoles;
	}

	public void setNumberOfHoles(int numberOfHoles) {
		this.numberOfHoles = numberOfHoles;
	}

	public String getHeaders() {
		return super.getHeaders() + ", numberOfHoles";
	}

	public String toCSV() {
		return super.toCSV() + ", " + numberOfHoles;
	}

	@Override
	public String toString() {
		return "Panpipe [numberOfHoles=" + numberOfHoles + super.toString();
	}
}

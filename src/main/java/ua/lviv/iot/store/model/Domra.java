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

	public String getHeaders() {
		return super.getHeaders() + ", musicalStrings";
	}

	public String toCSV() {
		return super.toCSV() + ", " + musicalStrings;
	}

	@Override
	public String toString() {
		return "Domra [musicalStrings=" + musicalStrings + super.toString();
	}
}

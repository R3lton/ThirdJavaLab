package ua.lviv.iot.store.model;

import java.util.EnumSet;

public abstract class AbstractMusicalInstrument {

	private static final int DEFAULT_YEAR_OF_PRODUCTION = 1999;
	private static final String DEFAULT_PRODUCER = "Ukrainian Producer";

	protected int id;
	protected String color;
	protected double priceInUAH;
	protected double weightInKilograms;
	protected EnumSet<TypeOfMusicalInstrument> typeOfMusicalInstrument;
	protected EnumSet<MusicalInstrumentForBand> musicalInstrumentForBand;
	protected String producer;
	protected int yearOfProduction;

	public AbstractMusicalInstrument(int id, String color, double priceInUAH, double weightInKilograms,
			EnumSet<TypeOfMusicalInstrument> typeOfMusicalInstrument,
			EnumSet<MusicalInstrumentForBand> musicalInstrumentForBand) {
		this(id, color, priceInUAH, weightInKilograms, typeOfMusicalInstrument, musicalInstrumentForBand,
				DEFAULT_PRODUCER, DEFAULT_YEAR_OF_PRODUCTION);

	}

	public AbstractMusicalInstrument(int id, String color, double priceInUAH, double weightInKilograms,
			EnumSet<TypeOfMusicalInstrument> typeOfMusicalInstrument,
			EnumSet<MusicalInstrumentForBand> musicalInstrumentForBand, String producer, int yearOfProduction) {
		super();
		this.id = id;
		this.color = color;
		this.priceInUAH = priceInUAH;
		this.weightInKilograms = weightInKilograms;
		this.typeOfMusicalInstrument = typeOfMusicalInstrument;
		this.musicalInstrumentForBand = musicalInstrumentForBand;
		this.producer = producer;
		this.yearOfProduction = yearOfProduction;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPriceInUAH() {
		return priceInUAH;
	}

	public void setPriceInUAH(double priceInUAH) {
		this.priceInUAH = priceInUAH;
	}

	public double getWeightInKilograms() {
		return weightInKilograms;
	}

	public void setWeightInKilograms(double weightInKilograms) {
		this.weightInKilograms = weightInKilograms;
	}

	public EnumSet<TypeOfMusicalInstrument> getTypeOfMusicalInstrument() {
		return typeOfMusicalInstrument;
	}

	public void setTypeOfMusicalInstrument(EnumSet<TypeOfMusicalInstrument> typeOfMusicalInstrument) {
		this.typeOfMusicalInstrument = typeOfMusicalInstrument;
	}

	public EnumSet<MusicalInstrumentForBand> getMusicalInstrumentForBand() {
		return musicalInstrumentForBand;
	}

	public void setMusicalInstrumentForBand(EnumSet<MusicalInstrumentForBand> musicalInstrumentForBand) {
		this.musicalInstrumentForBand = musicalInstrumentForBand;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public boolean checkCriterion(EnumSet<TypeOfMusicalInstrument> criterion) {
		return this.typeOfMusicalInstrument.containsAll(criterion);
	}

	public boolean checkCriterio(EnumSet<MusicalInstrumentForBand> criterion) {
		return this.musicalInstrumentForBand.containsAll(criterion);
	}

	public String toCSV() {
		return id + ", " + color + ", " + priceInUAH + ", " + weightInKilograms + ", " + typeOfMusicalInstrument + ", "
				+ musicalInstrumentForBand + ", " + producer + ", " + yearOfProduction;
	}

	public String getHeaders() {

		return "id, color, priceInUAH, weightInKilograms, typeOfMusicalInstrument, musicalInstrumentForBand, producer, yearOfProduction";
	}

	@Override
	public String toString() {
		return "id=" + id + ", color=" + color + ", priceInUAH=" + priceInUAH + ", weightInKilograms="
				+ weightInKilograms + ", typeOfMusicalInstrument=" + typeOfMusicalInstrument
				+ ", musicalInstrumentForBand=" + musicalInstrumentForBand + ", producer=" + producer
				+ ", yearOfProduction=" + yearOfProduction + "]";
	}
}

package ua.lviv.iot.store.manager;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.store.model.AbstractMusicalInstrument;
import ua.lviv.iot.store.model.MusicalInstrumentForBand;
import ua.lviv.iot.store.model.TypeOfMusicalInstrument;

public class PurchaceManager {
	private List<AbstractMusicalInstrument> productsAvailable;

	public List<AbstractMusicalInstrument> getProductsAvailable() {
		return productsAvailable;
	}

	public void setProductsAvailable(List<AbstractMusicalInstrument> productsAvailable) {
		this.productsAvailable = productsAvailable;
	}

	public PurchaceManager(List<AbstractMusicalInstrument> productsAvailable) {
		super();
		this.productsAvailable = productsAvailable;
	}

	public List<AbstractMusicalInstrument> findProductByType(EnumSet<TypeOfMusicalInstrument> criterion) {
		List<AbstractMusicalInstrument> foundProductsAvailable = new LinkedList<AbstractMusicalInstrument>();
		for (AbstractMusicalInstrument currentProductsAvailable : this.productsAvailable) {
			if (currentProductsAvailable.checkCriterion(criterion)) {
				foundProductsAvailable.add(currentProductsAvailable);
			}
		}
		return foundProductsAvailable;
	}

	public List<AbstractMusicalInstrument> findProductForBand(EnumSet<MusicalInstrumentForBand> criterion) {
		List<AbstractMusicalInstrument> foundProductsAvailable = new LinkedList<AbstractMusicalInstrument>();
		for (AbstractMusicalInstrument currentProductsAvailable : this.productsAvailable) {
			if (currentProductsAvailable.checkCriterio(criterion)) {
				foundProductsAvailable.add(currentProductsAvailable);
			}
		}
		return foundProductsAvailable;
	}
}

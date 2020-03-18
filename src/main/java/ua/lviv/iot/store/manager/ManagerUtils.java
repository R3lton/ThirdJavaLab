package ua.lviv.iot.store.manager;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ua.lviv.iot.store.model.AbstractMusicalInstrument;
import ua.lviv.iot.store.model.SortType;

public class ManagerUtils {

	public static List<AbstractMusicalInstrument> sortProductByPriceInUAH(List<AbstractMusicalInstrument> instruments,
			SortType sortType) {
		Comparator<AbstractMusicalInstrument> comparator = new PriceComparator();
		return sortProductBy(instruments, sortType, comparator);
	}

	public static List<AbstractMusicalInstrument> sortProductByColor(List<AbstractMusicalInstrument> instruments,
			SortType sortType) {
		ManagerUtils utils = new ManagerUtils();
		Comparator<AbstractMusicalInstrument> comparator = utils.new ColorComparator();
		return sortProductBy(instruments, sortType, comparator);
	}

	public static List<AbstractMusicalInstrument> sortProductByProducer(List<AbstractMusicalInstrument> instruments,
			SortType sortType) {
		ManagerUtils utils = new ManagerUtils();
		Comparator<AbstractMusicalInstrument> comparator = utils.producerComparator;
		return sortProductBy(instruments, sortType, comparator);
	}

	public static List<AbstractMusicalInstrument> sortDecorationsByYearOfProduction(
			List<AbstractMusicalInstrument> instruments, SortType sortType) {
		Comparator<AbstractMusicalInstrument> comparator = (AbstractMusicalInstrument firstInstrument,
				AbstractMusicalInstrument secondInstrument) -> firstInstrument.getYearOfProduction()
						- secondInstrument.getYearOfProduction();
		return sortProductBy(instruments, sortType, comparator);
	}

	private static List<AbstractMusicalInstrument> sortProductBy(List<AbstractMusicalInstrument> instruments,
			SortType sortType, Comparator<AbstractMusicalInstrument> comparator) {
		instruments.sort(sortType == SortType.ASCENDING ? comparator : Collections.reverseOrder(comparator));
		return instruments;
	}

	private Comparator<AbstractMusicalInstrument> producerComparator = new Comparator<AbstractMusicalInstrument>() {

		@Override
		public int compare(AbstractMusicalInstrument firstInstrument, AbstractMusicalInstrument secondInstrument) {
			return firstInstrument.getProducer().compareTo(secondInstrument.getProducer());
		}

	};

	private static class PriceComparator implements Comparator<AbstractMusicalInstrument>, Serializable {
		private static final long serialVersionUID = 8317167932427493028L;

		@Override
		public int compare(AbstractMusicalInstrument firstInstrument, AbstractMusicalInstrument secondInstrument) {
			return (int) (firstInstrument.getPriceInUAH() - secondInstrument.getPriceInUAH());
		}
	}

	private class ColorComparator implements Comparator<AbstractMusicalInstrument> {

		@Override
		public int compare(AbstractMusicalInstrument firstInstrument, AbstractMusicalInstrument secondInstrument) {
			return firstInstrument.getColor().compareTo(secondInstrument.getColor());
		}
	}
}
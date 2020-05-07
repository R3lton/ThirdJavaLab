package ua.lviv.iot.store.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.store.model.AbstractMusicalInstrument;

class InstrumentsWriterReaderTest extends BaseMusicalInstrumentTest {

	private static final String PATH_TO_WRTIE = "objects.csv";
	InstrumentsWriter instrumentsWriter;

	@BeforeEach
	void setUp() {
		createInstruments();
		instrumentsWriter = new InstrumentsWriter();
	}

	@Test
	void testInstrumentsFileWriter() {
		try (Writer fileWriter = new FileWriter(PATH_TO_WRTIE);) {
			instrumentsWriter.setTextWriter(fileWriter);
			instrumentsWriter.writeToFile(instruments);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testInstrumentsStringWriter() {
		try (Writer stringWriter = new StringWriter();) {
			instrumentsWriter.setTextWriter(stringWriter);
			instrumentsWriter.writeToFile(instruments);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String expectedString = "";
		for (AbstractMusicalInstrument currentInstruments : instruments) {
			expectedString += currentInstruments.getHeaders() + ", " + currentInstruments.toCSV() + "\r\n";
		}

		assertEquals(expectedString, instrumentsWriter.toString());
	}
}

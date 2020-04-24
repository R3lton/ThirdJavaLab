package ua.lviv.iot.store.manager;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import ua.lviv.iot.store.model.AbstractMusicalInstrument;

public class InstrumentsWriter {
	Writer textWriter;

	public void setTextWriter(Writer textWriter) {
		this.textWriter = textWriter;
	}

	public void writeToFile(List<AbstractMusicalInstrument> instruments) throws IOException {
		for (AbstractMusicalInstrument currentInstruments : instruments) {
			String lineToWrite = currentInstruments.getHeaders() + ", " + currentInstruments.toCSV();
			writeLine(textWriter, lineToWrite);
		}
		textWriter.flush();
	}

	private void writeLine(Writer writer, String text) throws IOException {
		writer.write(text + "\r\n");
	}

	@Override
	public String toString() {
		return textWriter.toString();
	}

}

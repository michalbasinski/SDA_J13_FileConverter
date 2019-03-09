package pl.sda.converters;

import pl.sda.readers.ReaderFactory;
import pl.sda.readers.SdaFileReader;
import pl.sda.writers.SdaFileWriter;
import pl.sda.writers.WriterFactory;

import java.util.List;
import java.util.Map;

public class FileConverter {

    public void convert(String sourcePath, String outputPath) {

        ReaderFactory readerFactory = new ReaderFactory();
        SdaFileReader reader = readerFactory.produce(sourcePath);
        List<Map<String, String>> records = reader.read(sourcePath);

        WriterFactory writerFactory = new WriterFactory();
        SdaFileWriter writer = writerFactory.produce(outputPath);
        writer.write(records, outputPath);
    }
}

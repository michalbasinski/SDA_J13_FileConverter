package pl.sda.writers;

public class WriterFactory {

    public SdaFileWriter produce(String filePath) {
        SdaFileWriter writer = null;

        if (filePath.endsWith(".csv")) {
            writer = new CsvWriter();
        }

        return writer;
    }

}

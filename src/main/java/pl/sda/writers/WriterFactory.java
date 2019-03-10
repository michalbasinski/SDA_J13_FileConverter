package pl.sda.writers;

public class WriterFactory {

    public SdaFileWriter produce(String filePath) {
        SdaFileWriter writer = null;

        if (filePath.endsWith(".csv")) {
            writer = new CsvWriter();
        }
        if (filePath.endsWith(".json")) {
            writer = new JsonWriter();
        }
        if (filePath.endsWith(".xlsx")) {
            writer = new ExcelWriter();
        }

        return writer;
    }

}

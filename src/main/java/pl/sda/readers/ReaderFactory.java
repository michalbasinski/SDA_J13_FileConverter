package pl.sda.readers;

public class ReaderFactory {

    public SdaFileReader produce(String filePath) {

        SdaFileReader reader = null;
        if (filePath.endsWith(".csv")) {
            reader = new CSVReader();
        }
        if (filePath.endsWith(".json")) {
            reader = new JSONReader();
        }
        if (filePath.endsWith(".xlsx")) {
            reader = new ExcelReader();
        }
        return reader;
    }

}

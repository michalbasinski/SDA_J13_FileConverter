package pl.sda.readers;

public class ReaderFactory {

    public SdaFileReader produce(String filePath) {

        SdaFileReader reader = null;
        if (filePath.endsWith(".csv")) {
            reader = new CSVReader();
        }
        return reader;
    }

}

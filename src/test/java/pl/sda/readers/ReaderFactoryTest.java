package pl.sda.readers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReaderFactoryTest {

    @Test
    public void shouldReturnCSVReaderWhenPathEndsWithCSV() {
        //given
        final String filePath = "path/to/file.csv";
        final ReaderFactory factory = new ReaderFactory();

        //when
        SdaFileReader product = factory.produce(filePath);

        //then
        Assert.assertTrue(product instanceof CSVReader);
        Assert.assertTrue(product instanceof SdaFileReader);
    }
}
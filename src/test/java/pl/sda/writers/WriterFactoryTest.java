package pl.sda.writers;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WriterFactoryTest {

    @Test
    public void shouldReturnCSVWriterWhenPathEndsWithCSV() {
        //given
        final String filePath = "file/path/to.csv";
        final WriterFactory factory = new WriterFactory();

        //when
        SdaFileWriter product = factory.produce(filePath);

        //then
        Assert.assertTrue(product instanceof SdaFileWriter);
        Assert.assertTrue(product instanceof CsvWriter);
    }
}
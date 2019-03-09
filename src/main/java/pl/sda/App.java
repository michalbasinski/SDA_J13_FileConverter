package pl.sda;

import pl.sda.converters.FileConverter;

public class App {

    public static void main(String[] args) {
        FileConverter fileConverter = new FileConverter();

        String sourcePath = "/home/michal/SDA/Java13/Projekty/SDA_J13_FileConverter/src/main/resources/cards.json";
        String outputPath = "/home/michal/convertedJson.csv";
        fileConverter.convert(sourcePath, outputPath);
    }
}

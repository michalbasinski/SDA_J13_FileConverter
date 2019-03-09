package pl.sda;

import pl.sda.converters.FileConverter;

public class App {

    public static void main(String[] args) {
        FileConverter fileConverter = new FileConverter();

        String sourcePath = "/home/michal/custom.csv";
        String outputPath = "/home/michal/convertedFile.csv";
        fileConverter.convert(sourcePath, outputPath);
    }
}

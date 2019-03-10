package pl.sda;

import pl.sda.converters.FileConverter;

public class App {

    public static void main(String[] args) {
        FileConverter fileConverter = new FileConverter();

        String sourcePath = "/home/michal/myExcel.xlsx";
        String outputPath = "/home/michal/fromExcel.json";
        fileConverter.convert(sourcePath, outputPath);
    }
}

package pl.sda;

import pl.sda.converters.FileConverter;

public class App {

    public static void main(String[] args) {
        FileConverter fileConverter = new FileConverter();

        String sourcePath = "/home/michal/fromExcel.json";
        String outputPath = "/home/michal/fromExcelWriter.xlsx";
        fileConverter.convert(sourcePath, outputPath);
    }
}

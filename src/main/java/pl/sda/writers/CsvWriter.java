package pl.sda.writers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CsvWriter implements SdaFileWriter {

    private static final String CSV_FILE_SEPARATOR = ";";
    private final WriterUtils writerUtils = new WriterUtils();

    @Override
    public void write(List<Map<String, String>> records, String filePath) {

        Set<String> headers = writerUtils.prepareHeaders(records);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            String headerLine = prepareLine(headers);
            bufferedWriter.write(headerLine);

            for (Map<String, String> record : records) {
                List<String> lineValues = new ArrayList<>();

                for (String header : headers) {
                    lineValues.add(record.get(header));
                }

                String csvLine = prepareLine(lineValues);
                bufferedWriter.write(csvLine);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String prepareLine(Collection<String> cells) {
        StringBuilder stringBuilder = new StringBuilder();

        int counter = 0;
        for (String cell : cells) {
            stringBuilder.append(cell);
            if (counter < cells.size() - 1) {
                stringBuilder.append(CSV_FILE_SEPARATOR);
            }
            counter++;
        }
        stringBuilder.append("\n");

        return stringBuilder.toString();
    }
}

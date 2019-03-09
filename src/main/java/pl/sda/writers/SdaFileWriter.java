package pl.sda.writers;

import java.util.List;
import java.util.Map;

public interface SdaFileWriter {
    void write(List<Map<String, String>> records, String filePath);
}

package pl.sda.readers;

import java.util.List;
import java.util.Map;

public interface SdaFileReader {
    List<Map<String, String>> read(String filePath);
}

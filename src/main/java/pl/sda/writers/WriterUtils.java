package pl.sda.writers;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class WriterUtils {

    Set<String> prepareHeaders(List<Map<String, String>> records) {
        Set<String> headers = new HashSet<String>();

        for (Map<String, String> record : records) {
            headers.addAll(record.keySet());
        }

        return headers;
    }
}
package pl.sda.writers;

import java.util.*;

class WriterUtils {

    Set<String> prepareHeaders(List<Map<String, String>> records) {
        Set<String> headers = new LinkedHashSet<String>();

        for (Map<String, String> record : records) {
            headers.addAll(record.keySet());
        }

        return headers;
    }
}
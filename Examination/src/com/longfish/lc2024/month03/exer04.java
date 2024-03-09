package com.longfish.lc2024.month03;

import java.util.HashMap;
import java.util.Map;

public class exer04 {

    private final Map<Long, String> db = new HashMap<>();

    private Long id = 0L;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        id++;
        db.put(id, longUrl);
        return "https://tinyurl.com/" + id;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return db.get(Long.parseLong(shortUrl.substring(shortUrl.lastIndexOf('/') + 1)));
    }
}

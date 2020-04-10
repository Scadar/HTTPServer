package ru.scadarnull.http.io.exception;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Constants {
    public static final String GET = "GET";
    public static final String POST = "POST";
    public static final String HEAD = "HEAD";
    public static final List<String> ALLOWED_METHODS = Collections.unmodifiableList(Arrays.asList(GET, POST, HEAD));
    private Constants(){
    }
}

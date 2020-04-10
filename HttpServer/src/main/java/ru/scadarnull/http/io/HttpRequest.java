package ru.scadarnull.http.io;

import javax.swing.*;
import java.util.Map;

public interface HttpRequest {

    String getStartingLine();

    String getMethod();

    String getUri();

    String getHttpVersion();

    String getRemoteAddress();

    Map<String, String> getHeaders();

    Map<String, String> getParameters();
}

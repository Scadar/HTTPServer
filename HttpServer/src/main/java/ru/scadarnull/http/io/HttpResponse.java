package ru.scadarnull.http.io;

import java.io.InputStream;
import java.io.Reader;

public interface HttpResponse {

    void setStatus(int status);

    void setHeader(String name, Object val);

    void setBody(String content);

    void setBody(InputStream in);

    void setBody(Reader reader);
}

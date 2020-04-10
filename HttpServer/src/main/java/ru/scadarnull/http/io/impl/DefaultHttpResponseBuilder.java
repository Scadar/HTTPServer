package ru.scadarnull.http.io.impl;

import ru.scadarnull.http.io.config.HttpResponseBuilder;
import ru.scadarnull.http.io.config.ReadableHttpResponse;

class DefaultHttpResponseBuilder implements HttpResponseBuilder {
    @Override
    public ReadableHttpResponse buildNewHttpResponse() {
        return null;
    }

    @Override
    public void prepareHttpResponse(ReadableHttpResponse response, boolean clearBody) {

    }
}

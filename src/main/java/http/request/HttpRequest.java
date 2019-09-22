package http.request;

import http.common.HeaderFields;

import java.util.Map;

public class HttpRequest {
    private final RequestLine requestLine;
    private final HeaderFields headerFields;
    private final RequestBody datas;

    public HttpRequest(RequestLine requestLine, HeaderFields headerFields, RequestBody datas) {
        this.requestLine = requestLine;
        this.headerFields = headerFields;
        this.datas = datas;
    }

    public boolean isGetMethod() {
        return requestLine.isGetMethod();
    }

    public boolean isPostMethod() {
        return requestLine.isPostMethod();
    }

    public String getHeader(String fieldName) {
        return headerFields.getHeader(fieldName);
    }

    public String getData(String fieldName) {
        return datas.getData(fieldName);
    }

    public String getPath() {
        return requestLine.getPath();
    }
}

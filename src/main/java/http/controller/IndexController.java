package http.controller;

import http.HttpRequest;
import http.HttpResponse;
import utils.HttpResponseHeaderParser;

public class IndexController implements Controller {
    @Override
    public HttpResponse get(HttpRequest httpRequest) {
        return new HttpResponse(HttpResponseHeaderParser.response302Header("/index.html"));
    }

    @Override
    public HttpResponse post(HttpRequest httpRequest) {
        return new HttpResponse(HttpResponseHeaderParser.response405Header());
    }
}

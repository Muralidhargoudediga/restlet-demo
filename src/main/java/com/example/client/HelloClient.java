package com.example.client;

import org.restlet.resource.ClientResource;

import java.io.IOException;

public class HelloClient {
    public static void main(String[] args) throws IOException {
        ClientResource httpClientResource = new ClientResource("http://localhost:8111");
        httpClientResource.get().write(System.out);
    }
}

package com.levizheng.space.ai.core;

import retrofit2.Response;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        final String API_KEY = "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";

        ChatGptApi api = ChatGptApiClient.getApi();
        String jsonBody = "{\"prompt\":\"Hello, World!\",\"max_tokens\":5,\"temperature\":0.5}";
        Response<String> response = api.test(API_KEY, jsonBody).execute();
        if (response.isSuccessful()) {
            String completion = response.body();
            System.out.println(completion);
        } else {
            System.out.println(response.errorBody().string());
        }
    }
}
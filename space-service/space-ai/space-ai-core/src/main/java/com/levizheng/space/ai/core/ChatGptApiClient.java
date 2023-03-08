package com.levizheng.space.ai.core;


import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;


public class ChatGptApiClient {
    private static final String BASE_URL = "https://api.openai.com";

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();

    public static ChatGptApi getApi() {
        return retrofit.create(ChatGptApi.class);
    }
}

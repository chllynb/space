package com.levizheng.space.ai.core;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ChatGptApi {
    @POST("/api/completions/v1")
    @Headers("Content-Type: application/json")
    Call<String> complete(@Header("Authorization") String apiKey, @Body String jsonBody);


    @POST("/api/v1/engines/davinci-codex/completions")
    Call<String> test(@Header("Authorization") String apiKey, @Body String jsonBody);
}

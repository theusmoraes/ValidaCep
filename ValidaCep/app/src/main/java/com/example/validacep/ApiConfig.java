package com.example.validacep;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class ApiConfig {
    private final Retrofit retrofit;
    public ApiConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://viacep.com.br")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public CepService getCepService(){
        return this.retrofit.create(CepService.class);
    }

}

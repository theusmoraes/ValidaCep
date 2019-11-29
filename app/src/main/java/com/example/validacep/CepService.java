package com.example.validacep;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CepService {
    @GET ("ws/{cep}/json")
    Call<CEP> buscarCEP(@Path("cep") String cep);


}

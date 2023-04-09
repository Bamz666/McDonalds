package com.example.fragmentmcd;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataServices {
    @GET("/mcd.json")
    public Call<List<Mcd>> getMcds();
}

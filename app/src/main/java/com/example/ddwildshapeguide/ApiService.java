package com.example.ddwildshapeguide;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface ApiService {
    @GET("/api/monsters/{monster}")
    Call<Monster> getMonsterByName(@Path("monster") String name);
}

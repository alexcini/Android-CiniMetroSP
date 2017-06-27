package com.alexcini.metrosp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by logonrm on 26/06/2017.
 */


public interface MetroAPI {
    @GET("http://localhost:3000/linhas")
    Call<List<Linhas>> getLinhas();
}

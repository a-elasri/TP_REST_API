package ma.enset.tp3restapi.service;

import java.util.List;

import ma.enset.tp3restapi.model.ListArticlesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RestServiceAPI {
    @GET("v2/everything")
    Call<ListArticlesResponse> getArticles(@Query("q") String key, @Query("date") String date , @Query("apiKey") String s);

}

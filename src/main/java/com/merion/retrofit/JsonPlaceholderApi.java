package com.merion.retrofit;

import com.merion.retrofit.request.PostCreateRequest;
import com.merion.retrofit.request.PostUpdateRequest;
import com.merion.retrofit.response.PostResponse;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface JsonPlaceholderApi {
    @GET("/posts")
    Call<List<PostResponse>> posts(@Query("id") Integer id);
    //Call<List<PostResponse>> posts(@Query("userId") Integer userId);

    @POST("/posts")
    Call<PostResponse> create(@Body PostCreateRequest postCreateRequest);

    @PUT("/posts/{id}")
    Call<PostResponse> update(@Path("id") Integer id, @Body PostUpdateRequest postUpdateRequest);

    @DELETE("/posts/{id}")
    Call<Void> delete(@Path("id") Integer id);

}

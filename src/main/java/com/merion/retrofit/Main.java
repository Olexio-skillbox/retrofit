package com.merion.retrofit;

import com.merion.retrofit.request.PostCreateRequest;
import com.merion.retrofit.request.PostUpdateRequest;
import com.merion.retrofit.response.PostResponse;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("\nHello!!!\n");

        JsonPlaceholderApi api = JsonPlaceholderService.getInstance().api();

        System.out.println("\nGET:/posts --------------------");
        Response<List<PostResponse>> postResponses = api.posts(/*null*/4).execute();
        System.out.println("\tis successful\t" + postResponses.isSuccessful());
        System.out.println("\tHTTP Code\t" + postResponses.code());
        System.out.println("\tHEADERS\t" + postResponses.headers());
        List<PostResponse> posts = postResponses.body();
        System.out.println("\n\n\tPOSTS\n\t" + posts);

        System.out.println("\nPOST:/posts --------------------");
        PostCreateRequest createRequest = new PostCreateRequest();
        createRequest.setBody("create");
        createRequest.setTitle("create");
        createRequest.setUserId(1);
        PostResponse postResponseCreate = api.create(createRequest).execute().body();
        System.out.println(postResponseCreate);

        System.out.println("\nPUT:/posts --------------------");
        PostUpdateRequest updateRequest = new PostUpdateRequest();
        updateRequest.setId(1);
        updateRequest.setUserId(1);
        updateRequest.setTitle("update");
        updateRequest.setBody("update");
        PostResponse postResponseUpdate = api.update(1, updateRequest).execute().body();
        System.out.println(postResponseUpdate);

        System.out.println("\nDELETE:/posts --------------------");
        Integer code = api.delete(1).execute().code();
        System.out.println(code);
    }
}

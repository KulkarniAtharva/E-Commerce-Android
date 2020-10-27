package dev.atharvakulkarni.e_commerce.net;


import dev.atharvakulkarni.e_commerce.model.CartApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api
{
    String HTTPS_API_GITHUB_URL = "https://api.github.com/";

   /* @GET("users/{user}/repos")
    Call<List<Project>> getProjectList(@Path("user") String user);

    @GET("/repos/{user}/{reponame}")
    Call<Project> getProjectDetails(@Path("user") String user, @Path("reponame") String projectName);  */

    @GET("carts")
    Call<CartApiResponse> getProductsInCart(@Query("userId") int userId);
}
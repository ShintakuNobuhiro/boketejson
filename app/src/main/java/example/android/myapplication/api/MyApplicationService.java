package  example.android.myapplication.api;

import example.android.myapplication.model.Image;
import example.android.myapplication.model.Images;

import retrofit.Callback;
import retrofit.ResponseCallback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public interface MyApplicationService {

    @GET("/images.json")
    void fetchImages(Callback<Images> callback);

    @GET("/images/{id}.json")
    void fetchImage(@Path("id") int imageId, Callback<Image> callback);

    @FormUrlEncoded
    @POST("/images/{id}/comments.json")
    void postComment(@Path("id") int imageId, @Field("comment[body]") String commentBody,
                     ResponseCallback callback);

}
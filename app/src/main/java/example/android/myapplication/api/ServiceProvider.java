package example.android.myapplication.api;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

public class ServiceProvider {

    private static RestAdapter restAdapter = null;

    private static RestAdapter getRestAdapter() {
        if (restAdapter == null) {
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create();
            restAdapter = new RestAdapter.Builder()
                    .setEndpoint("https://pacific-hamlet-7266.herokuapp.com")
                    .setConverter(new GsonConverter(gson))
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .build();
        }
        return restAdapter;
    }

    public static MyApplicationService getPictBoardService() {
        return getRestAdapter().create(MyApplicationService.class);
    }

}
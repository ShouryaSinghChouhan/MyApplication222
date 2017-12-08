package google.com.myapplication22;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by HP on 05/12/2017.
 */
public interface Api {

    String BASE_URL= " https://jsonplaceholder.typicode.com/photos";

@GET("photos")

    Call<List<Product>> getProducts();




}

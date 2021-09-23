package sidiq.project.kepegawaian.Network


import com.sidiq.listmovie.Model.Response
import com.sidiq.listmovie.Model.movieRespon
import retrofit2.Call


import retrofit2.http.*

interface ApiInterface {

    @GET("movie/popular")


    fun getMovie(
        @Query("api_key") apikey: String,
        @Query("language") laguage: String,
        @Query("page") page: Long)
            : Call<Response>


}
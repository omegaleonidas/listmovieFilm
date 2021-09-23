
package com.sidiq.listmovie.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.sidiq.listmovie.Adapter.AdapterMovie
import com.sidiq.listmovie.Model.Data
import com.sidiq.listmovie.Model.Result
import com.sidiq.listmovie.Model.movieRespon
import com.sidiq.listmovie.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response
import sidiq.project.kepegawaian.Network.ApiServices

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private var adapter: AdapterMovie? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        val view = binding!!.root
        setContentView(view)
        getData()
    }
    fun getData() {

        Log.i("TAG", "getData: ")

        ApiServices.restApi().getMovie("944d73ea54a5d50fc22a44f810d6aeed","en-US",1)
            .enqueue(object : retrofit2.Callback<com.sidiq.listmovie.Model.Response> {
                override fun onFailure(call: Call<com.sidiq.listmovie.Model.Response>, t: Throwable) {
                    Log.i("TAG", "onFailure: ${t.message}")
                }

                override fun onResponse(
                    call: Call<com.sidiq.listmovie.Model.Response>,
                    response: Response<com.sidiq.listmovie.Model.Response>
                ) {
                    val dataMovie = response.body()

                    if (response.isSuccessful) {
                        Log.i("TAG", "onResponse: ${response.body()}")
                        showData(dataMovie!!.results)

                    }else {
                        Log.i("TAG", "onResponse: ${response.errorBody()?.string()}")
                    }
                }

            })


    }


    fun showData(movie: List<Data>) {

        binding?.recylerViewmovie?.apply {
//            binding?.recylerViewmovie?.setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = AdapterMovie(movie).apply {
                notifyDataSetChanged()
            }

        }

        Log.i("TAG", "showData: ${movie[0].original_title}")
    }










}
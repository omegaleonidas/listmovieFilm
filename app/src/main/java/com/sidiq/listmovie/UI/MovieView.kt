package com.sidiq.listmovie.UI

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.sidiq.listmovie.Adapter.AdapterMovie
import com.sidiq.listmovie.Model.Result
import com.sidiq.listmovie.Model.movieRespon

import com.sidiq.listmovie.databinding.FragmentMovieViewBinding
import retrofit2.Call
import retrofit2.Response
import sidiq.project.kepegawaian.Network.ApiServices


class MovieView : Fragment() {

    private var binding: FragmentMovieViewBinding? = null
    private var adapter: AdapterMovie? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        binding = FragmentMovieViewBinding.inflate(inflater, container, false)
        val view = binding?.root
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        getData()
    }
//    fun getData() {
//
//        Log.i("TAG", "getData: ")
//
//        ApiServices.restApi().getMovie("944d73ea54a5d50fc22a44f810d6aeed","en-US",1)
//            .enqueue(object : retrofit2.Callback<movieRespon> {
//                override fun onFailure(call: Call<movieRespon>, t: Throwable) {
//
//                }
//
//                override fun onResponse(
//                    call: Call<movieRespon>,
//                    response: Response<movieRespon>
//                ) {
//                    val dataMovie = response.body()
//
//                    if (response.isSuccessful) {
//                        Log.i("TAG", "onResponse: ${response.body()}")
//                        showData(dataMovie!!.results)
//
//                    }else {
//                        Log.i("TAG", "onResponse: ${response.errorBody()?.string()}")
//                    }
//                }
//
//            })
//
//
//    }
//
//
//    fun showData(movie: List<Result>) {
//
//        binding?.recylerViewmovie?.apply {
////            binding?.recylerViewmovie?.setHasFixedSize(true)
//            layoutManager = LinearLayoutManager(context)
//            adapter = AdapterMovie(movie).apply {
//                notifyDataSetChanged()
//            }
//
//        }
//
//        Log.i("TAG", "showData: ${movie[0].original_title}")
//    }


}






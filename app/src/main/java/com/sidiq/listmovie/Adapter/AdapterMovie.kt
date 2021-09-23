package com.sidiq.listmovie.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sidiq.listmovie.Model.Data
import com.sidiq.listmovie.Model.Result
import com.sidiq.listmovie.Model.movieRespon
import com.sidiq.listmovie.databinding.CardMovieBinding

class AdapterMovie(private  val list: List<Data>) : RecyclerView.Adapter<AdapterMovie.movieHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = movieHolder(
        CardMovieBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )


    inner class movieHolder(var binding: CardMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindTo(item: Data?) {

            binding.tvJudul.text = item?.title
            binding.tvDescripsi.text = item?.release_date
            Glide.with  (binding.imageMovie.context).load("https://image.tmdb.org/t/p/w500/"+ item?.poster_path)
                .into(binding.imageMovie)



        }



    }

    override fun onBindViewHolder(holder: movieHolder, position: Int) {
        val info = list[position]
        holder.bindTo(info)


    }

    override fun getItemCount() = list.size


}
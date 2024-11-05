package com.example.pokedex.data.remote

import com.example.pokedex.data.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeApi {

    @GET("api/v2/pokemon")
    suspend fun read(): List<Pokemon>

    @GET("api/v2/pokemon/{id}")
    suspend fun readOne(@Path("id") id:Int): Pokemon

    @GET("api/v2/pokemon/{name}")
    suspend fun readOne(@Path("name") name: String): Pokemon

}
package com.example.pokedex.data.remote

import com.example.pokedex.data.Pokemon
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokemonNetworkDataSource
    @Inject constructor(
        private val pokemonApi: PokeApi
    ) : PokemonRemoteDataSource {

    override suspend fun readAll(): List<Pokemon> {
        val pokemons = pokemonApi.read()
        return pokemons
    }

    override suspend fun readOne(id: Int): Pokemon {
        val pokemon = pokemonApi.readOne(id)
        return pokemon
    }

    override suspend fun readOne(name: String): Pokemon {
        val pokemon = pokemonApi.readOne(name)
        return pokemon
    }

    override fun observeAll(): Flow<List<Pokemon>> {
        TODO("Not yet implemented")
    }

}
package com.example.pokedex.ui

import androidx.lifecycle.ViewModel
import com.example.pokedex.data.Pokemon
import com.example.pokedex.data.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonListViewModel @Inject constructor(
    private val repository: PokemonRepository
) :ViewModel() {
    suspend fun read(): List<Pokemon> {
        var pokemonList: List<Pokemon> = repository.readAll()
        return pokemonList
    }
}
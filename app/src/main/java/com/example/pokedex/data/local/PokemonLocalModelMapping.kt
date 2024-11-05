package com.example.pokedex.data.local

import com.example.pokedex.data.Pokemon


fun Pokemon.toLocal() = PokemonEntity(
        id = this.id,
        name = this.name,
        height = this.height,
        width = this.width
    )

fun List<Pokemon>.toLocal(): List<PokemonEntity> {
    return this.map { p -> p.toLocal() }
}

fun PokemonEntity.toExternal() = Pokemon(
        id = this.id,
        name = this.name,
        height = this.height,
        width = this.width
    )

fun List<PokemonEntity>.toExternal() = map(PokemonEntity::toExternal)
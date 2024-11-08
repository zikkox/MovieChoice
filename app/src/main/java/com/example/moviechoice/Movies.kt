package com.example.moviechoice

data class Movie(
    val title: String,
    val rating: Double,
    val posterId: Int) {
}

object MoviesList{
    public val movieList: List<Movie> = listOf(
        Movie("Arcane", 9.0, R.drawable.arcane),
        Movie("The Dark Knight", 9.0, R.drawable.darkknight),
        Movie("Fight Club", 8.8, R.drawable.fightclub),
        Movie("Shutter Island", 8.2, R.drawable.shutterisland),
        Movie("The Wolf of Wall Street", 8.2, R.drawable.wallstreet),
        Movie("Dune: Part One", 8.0, R.drawable.dune))
}
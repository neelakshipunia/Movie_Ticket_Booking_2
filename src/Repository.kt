class Repository {

    fun getMovieList() : List<Movie> = listOf(
        Movie(1,"Harry Potter"),
        Movie(2,"Don"),
        Movie(3, "War"),
        Movie(4, "Inception"))

    fun theatreData() : Map<Int,List<Cinema>> = mapOf(
            1 to listOf(
                Cinema("PVR", arrayListOf("9am","12pm"), "S1"),
                Cinema("Inox", arrayListOf("12pm, 2pm"), "S1"),
                Cinema("Cinepolis", arrayListOf("6pm"), "S1")),
            2 to listOf(
                Cinema("PVR", arrayListOf("1pm"), "S2"),
                Cinema("Inox", arrayListOf("12pm, 2pm"), "S2"),
                Cinema("Cinepolis", arrayListOf("6pm"), "S2")),
            3 to listOf(
                Cinema("Inox", arrayListOf("12pm, 2pm"), "S3"),
                Cinema("Cinepolis", arrayListOf("6pm"), "S3")),
            4 to listOf(
                Cinema("PVR", arrayListOf("9am","12pm"), "S3"),
                Cinema("Cinepolis", arrayListOf("6pm"), "S4")))
}
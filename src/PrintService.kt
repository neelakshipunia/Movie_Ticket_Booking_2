class PrintService {

    val repository = Repository()

    fun printCinemaList(movieChoice : Int){
        repository.theatreData().filter { it.key == movieChoice }
            .flatMap { it.value }.forEach {println(it.theatreName + " -> " + it.showTime)}
    }

    fun printBookingDetails(cinemaName : String , time : String){
        println("Your Booking Details\n" +
                "Theatre Name: $cinemaName \n" +
                "Show Time: $time")
    }

    fun printScreenDetail(movieChoice: Int , cinemaName: String){
        repository.theatreData().filter{it.key == movieChoice}.flatMap { it.value }.
        filter { it.theatreName == cinemaName }.forEach {println("Screen Number: ${it.screen}")}
    }
}
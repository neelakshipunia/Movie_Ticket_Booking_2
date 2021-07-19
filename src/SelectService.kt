import java.util.*

class SelectService {
    private val repository = Repository()
    private val scanner = Scanner(System.`in`)

    fun selectMovie(): Int {
        println("***************WELCOME TO MOVIE TICKET BOOKING, BANGALORE**************")
        println("***************************\nMOVIE LIST\n***************************")
        repository.getMovieList().forEach { println("${it.id} -> ${it.name}") }
        println("Enter The No. Corresponding to the Movie You Want to Watch: ")
        return scanner.nextInt()
    }

    fun selectTheatre() : String{
        println("Please Enter the Cinema name (As given in the List)")
        return readLine()!!
    }

    fun selectShowTime() : String{
        println("Please Enter Timing available in the List (eg: 11am)")
        return readLine()!!
    }
}
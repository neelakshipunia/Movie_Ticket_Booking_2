fun main(){
    val selectService = SelectService()
    val movieChoice = selectService.selectMovie()
    val printService = PrintService()
    printService.printCinemaList(movieChoice)
    val theatreName = selectService.selectTheatre()
    val showTime = selectService.selectShowTime()
    printService.printBookingDetails(theatreName, showTime)
    printService.printScreenDetail(movieChoice , theatreName)
}
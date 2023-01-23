class Mitarbeiter {


    var id = 2345673829


    var name1 = "Nikos"
    var position = "München"

    //var gehalt = mutableListOf<Int>(3000,4000,6000)
    var gehalt = 3000
    var artDerBeschaeftigung = "UI/UX designer"
    var mutterschaftsUrlaub = false


    //    }
    fun gehaltAusgeben() {
        println("Der Mitarbeiter  $name1 hat ein Gehalt von $gehalt € als $artDerBeschaeftigung")
    }


    fun befoerdern(positionNeue:String, gehaltNeue: Int) {
        position = positionNeue
        gehalt = gehaltNeue

        /**
         * was betueten hier mit position = positionneu weil ich hatte etwas adere in meine
         * kopf wie ich auf die aufgaben 4 gemacht mit alt zu ädert
         */
    }
   // danke von die feedback

    fun istVerfuegbar() {
        if (mutterschaftsUrlaub) {
            println("$name1 ist nicht verfügbar")
        } else {
            println("$name1 ist verfügbar")
        }
    }
}
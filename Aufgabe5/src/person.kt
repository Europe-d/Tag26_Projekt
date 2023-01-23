fun main() {


    var erstePerson: Mitarbeiter = Mitarbeiter()
    var zweitePerson: Mitarbeiter = Mitarbeiter()
    var trittePerson: Mitarbeiter = Mitarbeiter()

    erstePerson.gehaltAusgeben()
    //println("der name von unsere Mitarbeiters ist : ${erstePerson.name1} und das gehalt ist : ${erstePerson.gehalt}")
    zweitePerson.befoerdern("LMK", 5000)
    //zweitePerson.befoerdern("mun",5000)
    //erstePerson.position.also { erstePerson.gehalt = 4000 }
    trittePerson.istVerfuegbar()


}
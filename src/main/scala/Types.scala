object Types extends App {

  val a = 0 // constantes
  var b = 1 // variables

  //Int
  //val x: Int = 1   // déclare le type
  val x = 1        // ou pas

  //String
  val name = "Michel"
  //Char
  val n = 'R'

  println(s"Nom:  $name $n ")

  println(s"2 + 2 = ${2 + 2}")
  val l = -1
  println(s"Absolu de l = ${l.abs}")

  val phrase =
    """Je fais une phrase
sur plusieurs lignes
pour voir ce que ca donne."""
  println(phrase)
}

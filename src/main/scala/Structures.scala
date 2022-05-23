object Structures extends App {

  //condition
  val x = 0

  if (x < 0)
    println("x est négatif")
  else if (x == 0)
    println("x est égal à zéro")
  else
    println("x est positif")

  //boucle for
  val ints = List(1, 2, 3, 4, 5)

  for (i <- ints) println(i)

  //guards ajoute condition
  for (i <- ints if(i > 2)) println(i)

  //yield stock chaque résultat d'une itération du for dans une liste
  val doubles = for( i <- ints) yield i * 2
  println(doubles)

  //parcourir une liste
  val names = List("chris", "ed", "maurice")
  val capNames = for (name <- names) yield name.capitalize
  println(capNames)
}

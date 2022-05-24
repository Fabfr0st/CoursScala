//fonctions
def double(i: Int): Int = i * 2

def sum(list: List[Int]): Int = list match {
  case Nil => 0
  case head :: tail => head + sum(tail)
}

double(4)
val ints: List[Int] = List(1,2,3)
sum(ints)
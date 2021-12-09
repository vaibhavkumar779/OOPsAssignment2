package OOPS

//Person Class mixed with Ordered Trait
class Person(val name: String, val age: Int) extends Ordered[Person]{

  //  Comparing name parameter
  def compare(that: Person): Int ={

    if(that.name == this.name)
      this.age.compare(that.age)

    else this.name.compare(that.name)
  }
}


object Person{

  def main(args: Array[String]): Unit = {

    //comparing using age
    val personOne = new Person("Test", 24)
    val personTwo = new Person("Test", 25)
    println(personOne<personTwo)

    //comparing using name length
    val personThree = new Person("TestAgain", 24)
    val personFour = new Person("Test", 25)
    println(personThree<personFour)

  }


}
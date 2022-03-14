
object StringTask extends App {

  //TODO
  def processString(text:String, uppercaseChars:String ="", needsTrim:Boolean=false):String = {
    //TODO first trim string if it needs trimming from the argument
    //TODO replace All characters in uppercaseChars with their uppercase versions
    //you will need to write a loop
    //you will probably want to use var to store a temporary string that you keep reweriting
    //return newly created string
    "FIXME" //FIXME
  }
  val name = "abracadabra"

  println(name.trim.replaceAll("c", "C").replace("r", "R"))

for (c <- name) {
    println(s" upercaseChar $c upercase is ${c.toUpper}")
}

  val tempName  = name.toUpperCase()
  print(tempName)


  //println(processString("abracadabra", "cr")) //should print abRaCadabRa
  //println(processString("   abracadabra  ", "cr", needsTrim = true)) //should print abRaCadabRa
}


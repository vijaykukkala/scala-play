package com.lnc.vijay.pkg.euler

import org.junit.runner.RunWith
import org.scalatest.Style
import org.scalatest.FlatSpec
import org.scalatest.GivenWhenThen
import org.scalatest.junit.JUnitRunner
import scala.io.Source
import java.io.File

@RunWith(classOf[JUnitRunner])
class AdditionSpec extends FlatSpec with GivenWhenThen {

  "For Strings made of numbers" must "perform addition" in {

    given("two Strings")
    val xs = "1111"
    val ys = "1111"
    when("String addition applied")
    val operation = new Addition
    val result = operation.add(xs, ys)
    then("return value")
    assert("2222" equals result)
  }

  it must "perform addition 1111 & 4444" in {

    given("two Strings")
    val xs = "1111"
    val ys = "4444"
    when("String addition applied")
    val operation = new Addition
    val result = operation.add(xs, ys)
    then("return value")
    assert("5555" equals result)
  }

  it must "perform addition 1111 & 4499" in {
  
    given("two Strings")
    val xs = "1111"
    val ys = "4499"
    when("String addition applied")
    val operation = new Addition
    val result = operation.add(xs, ys)
    then("return value")
    assert("5610" equals result)
  }
  
   it must "perform addition 009211 & 000799" in {

    given("two Strings")
    val xs = "009211"
    val ys = "000799"
    when("String addition applied")
    val operation = new Addition
    val result = operation.add(xs, ys)
    then("return value")
    assert("010010" equals result)
  }

  it must "perform addition 08762 & 04499" in {
 
    given("two Strings")
    val xs = "08762"
    val ys = "04499"
    when("String addition applied")
    val operation = new Addition
    val result = operation.add(xs, ys)
    then("return value")
    assert("13261" equals result)
  }

  it must "perform addition for list of 4 digit numbers" in {
 
    given("List of 4 digit numbers")
    val xs = "371072875339021027987979982208375902465101357402".grouped(4).toList.map("00" + _)
    when("String addition applied")
    val operation = new Addition
    val result = ("000000" /: xs)(operation.add(_, _))
    then("return value")
    val expected = (0 /: xs.map(_.toInt))(_ + _)
    assert(expected == result.toInt)
  }

  it must "perform addition for two 50 digit numbers" in {
 
    given("two Strings")
    val xs = "037107287533902102798797998220837590246510135740250"
    val ys = "046376937677490009712648124896970078050417018260538"
    when("String addition applied")
    val operation = new Addition
    val result = operation.add(xs, ys)
    then("return value")
    assert("083484225211392112511446123117807668296927154000788" equals result)
  }

  it must "perform addition for List of 4 50-digit numbers" in {
 
    given("List Strings")
    val xs = List("037107287533902102798797998220837590246510135740250", "046376937677490009712648124896970078050417018260538", "074324986199524741059474233309513058123726617309629",
      "091942213363574161572522430563301811072406154908250")
    when("String addition applied")
    val operation = new Addition
    val result = xs.scanLeft("000000000000000000000000000000000000000000000000000")(operation.add(_, _))
    then("return value")
    println(result.max)
    assert("249751424774491015143442786990622537493059926218667" equals result.max)
  }

  it must "perform addition on List of 27 50-digit numbers" in {
 
    given("List Strings")
    val xstr = List("37107287533902102798797998220837590246510135740250",
      "46376937677490009712648124896970078050417018260538", "74324986199524741059474233309513058123726617309629",
      "91942213363574161572522430563301811072406154908250", "23067588207539346171171980310421047513778063246676",
      "89261670696623633820136378418383684178734361726757", "28112879812849979408065481931592621691275889832738",
      "44274228917432520321923589422876796487670272189318", "47451445736001306439091167216856844588711603153276",
      "70386486105843025439939619828917593665686757934951", "62176457141856560629502157223196586755079324193331",
      "64906352462741904929101432445813822663347944758178", "92575867718337217661963751590579239728245598838407",
      "58203565325359399008402633568948830189458628227828", "80181199384826282014278194139940567587151170094390",
      "35398664372827112653829987240784473053190104293586", "86515506006295864861532075273371959191420517255829",
      "71693888707715466499115593487603532921714970056938", "54370070576826684624621495650076471787294438377604",
      "53282654108756828443191190634694037855217779295145", "36123272525000296071075082563815656710885258350721",
      "45876576172410976447339110607218265236877223636045", "17423706905851860660448207621209813287860733969412",
      "81142660418086830619328460811191061556940512689692", "51934325451728388641918047049293215058642563049483",
      "62467221648435076201727918039944693004732956340691", "15732444386908125794514089057706229429197107928209")
    val xs = xstr.map("000" + _)
    when("String addition applied")
    val operation = new Addition
    val result = xs.scanLeft("00000000000000000000000000000000000000000000000000000")(operation.add(_, _))
    then("return value")
    assert("01522310157564745702505660431125059581636173705657872" equals result.max)
  }
  
  it must "Read a file consisting of 100 50-digit Numbers" in  {
    
    given("Given a file name consisting ")
    val filename = "C:/Users/vijay/50DigitNumbers.txt"
    val lines = Source.fromFile(new File(filename)).getLines().toList
    val xs = lines.map("000"+_)
    when("read a file")
    val operation = new Addition
    var initialValue ="00000000000000000000000000000000000000000000000000000"
    val scanResult = xs.scanLeft(initialValue)(operation.add(_,_))
    then("validate")
   // scanResult.foreach(println(_))
    assert("05537376230390876637302048746832985971773659831892672" equals scanResult.max)
  }

}
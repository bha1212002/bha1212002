fun main()
{
    var a : Int = 2147483647
    val b : Double = a.toDouble()
    val c : String = "814"
    var d : Int = c.toInt()
    val e : String = "814.54"
    val f : Double = e.toDouble()
    println("Integer value : $a")
    println("Double value (from integer) : $b")
    println("String value = $c")
    println("Integer value (from string) = $d")
    println("Double value (from string) = $f")
} 
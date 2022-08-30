fun main()
{
    println("*****Car1 Object*****")
    var c1=Car("Mercz","2017",5000000,"HNJ",2356)
    println("${c1.getCarInformation()}")
    println("${c1.displayCarInfo()}")
    println("${c1.getOriginalCarPrice()}")
    println("${c1.getCurrentCarPrice()}")
    println("\n*****Car2 Object*****")
    var c2=Car("Bugati","2019",400000,"TGF",9876)
    println("${c2.getCarInformation()}")
    println("${c2.displayCarInfo()}")
    println("${c2.getOriginalCarPrice()}")
    println("${c2.getCurrentCarPrice()}")
    println("\n*****ArrayList of Car*****")
    var alist = ArrayList<String>()
    var c3=Car("volkswagon","2015",1987046,"LOP",6789)

    alist.add("${c3.getCarInformation()}\n${c3.displayCarInfo()}\n${c3.getOriginalCarPrice()}\n${c3.getCurrentCarPrice()}")
    var c4=Car("Audi","2018",2908452,"KHK",3467)

    alist.add("${c4.getCarInformation()}\n${c4.displayCarInfo()}\n${c4.getOriginalCarPrice()}\n${c4.getCurrentCarPrice()}")
    for(i in alist)
    {
        println("$i \n")
    }
}
class Car constructor(type:String, model:String, price:Long, owner:String,
                      miles:Long)
{
    var type:String=type
    var model:String=model
    var owner:String=owner
    var price:Long= price
    var miles:Long=miles
    var currentPrice= price -(miles*10)
    fun getCarInformation():String
    {
        return "Car Information: $type, $model"
    }
    fun getOriginalCarPrice():String{
        return "Car Original Price: $price"
    }
    fun getCurrentCarPrice():String{
        return "Car Current Price: $currentPrice"
    }
    fun displayCarInfo():String{
        return "Car Owner: $owner\nMiles Drive: $miles"
    }
}

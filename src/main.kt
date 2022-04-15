import javax.management.MBeanRegistration

fun main() {
    var name=listOf("Catherine","Kanini","Timothy","Shaina","Violet","Ngina","Chende","John")
    println(name[0])
    println(name[2])
    println(name[4])
    println(name[6])
    println(name[8])
    var meters=height(listOf(2,4,7,8,6))
    println(meters)

    var person1=Person("Vida",20,146,40)
    var person2=Person("Vayo",18,166,50)
    var person3=Person("Nini",14,126,38)
    var people= listOf(person1,person2,person3)
    var x=people.sortedBy { Person->Person.age }
    println(x)

    var a=Person("Catherine",24,156,42)
    var b =Person("Ngina",34,149,55)
    var list=listOf(a,b)
    println(list.plus(list))

    var Tesla=Car("kcka 145",150)
    var Ferrari=Car("kda 342",50)
    var cars= listOf(Tesla,Ferrari)
    println(listOfObjects(cars))



}
fun name(names:List<String>):List<String>{
    names.forEachIndexed{name,k->
        if(name % 2 ==0){
            println(k)
        }
    }
    return names
}
fun height(numbers:List<Int>):String{
    var x=numbers.sum()
    var average=numbers.average()
    var totalheight= "$x, $average"

    return totalheight
}
data class Person(var name:String,var age:Int,var height:Int,var weight:Int)

fun add(name:List<Any>):List<Any>{
    return listOf()
}
data class Car(var registration:String,var mileage:Int)

fun listOfObjects(vehicles:List<Car>):Int {
    var M = 0
    vehicles.forEach { car ->
        car.mileage
        M += car.mileage
    }
    var average = M / vehicles.count()
    return average

}
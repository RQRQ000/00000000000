import kotlin.random.Random

class dog(dogsize:Int,dogactive:Int) {
     var size : Int =1
    init {
        size=dogsize
    }
    var name = "Бобик"
    var activ: Int = 1
    init {
        activ = dogactive
    }
    var Randomsize:Int = (15..50).random()
    fun privet1(){
        println("BOBY:Привет")
        println("DODO:Привет")
    }

    fun guv (){
        if (size>20){
            println(" говорит:")
            println("ГАААААВ")

        }

        if (size<20){
            println("говорит:")
            println("Тяффф")}
    }
    fun  eat1 (){
        if (size>20){
            println(" говорит:")
            println("Еще")
            size ++
            println("Размер:")
            println(size)
        }

        if (size<20) {
            println("говорит:")
            println("хватит")
            size ++
            println("Размер:")
            println(size)
        }
    }
    fun trink1 () {
        if (size>20){
            println("говорит:")
            println("Еще")}
        if (size<20){
            println("говорит:")
            println("хватит")}
    }

    fun play1 () {
        if (activ<6){
            println("говорит:")
            println("я устал")}
        if (activ>6){
            println("говорит:")
            println("давай играть")}

    }
    fun newdog (){
        println("У вас новая собака в воображении")
        println("Ее размер : ")
        println(Randomsize)


    }
}
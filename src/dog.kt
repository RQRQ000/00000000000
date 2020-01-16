class dog {
    var size : Int = 1
    var activ: Int = 1

    fun guv (){
        if (size>20){
            println("говорит:")
            println("ГАААААВ")

        }

        if (size<20){
            println("говорит:")
            println("Тяффф")}
    }
    fun  eat1 (){
        if (size>20){
            println("говорит:")
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
}
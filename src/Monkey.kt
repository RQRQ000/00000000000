class Monkey {
    var size : Int = 1
    var activ: Int = 1
    fun eat4 (){
        if (size>60){
            println("говорит:")
            println("ЕСТЬ")
            size ++
            println("Размер:")
            println(size)
        }
        if (size<60){
            println("говорит:")
            println("ммммм")
            size++
            println("Размер:")
            println(size)
        }
    }
    fun trink4 () {
        if (size>60){
            println("говорит:")
            println("Еще")}
        if (size<60){
            println("говорит:")
            println("хватит")}
}
    fun play4 () {
        if (activ<150){
            println("говорит:")
            println("Еще играть")}
        if (activ>150){
            println("говорит:")
            println("Крушить")}

    }

}
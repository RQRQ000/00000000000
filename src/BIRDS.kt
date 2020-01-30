class BIRDS(birdssize:Int,birdsactive:Int) {
    var size : Int = 1
    init {
        size = birdssize
    }
    var activ: Int = 1
    init {
        activ = birdsactive
    }
    fun sing (){
        if (size>5) {
            println("\u001B[31m говорит:")
            println("\u001B[31m КАААР")}
        if (size<5){
            println("\u001B[31m говорит:")
            println("\u001B[31m Чик Чик Чик")}
    }
    fun trink3 (){
        if (size>5){
            println("\u001B[31m говорит:")
            println("\u001B[31m еще")
            size ++
            println("\u001B[31m Размер:")
            println(size)
        }
        if (size<5){
            println("\u001B[31m говорит:")
            println("\u001B[31m все все")
            size ++
            println("\u001B[31m Размер:")
            println(size)
        }
    }
    fun fly () {
        if (activ<21){
            println("\u001B[31m говорит:")
            println("\u001B[31m сложно")}
        if (activ<21) {
            println("\u001B[31m говорит:")
            println("\u001B[31m уди сейчас снесу")}
    }
}
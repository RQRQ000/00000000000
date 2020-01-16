class BIRDS {
    var size : Int = 1
    var activ: Int = 1
    fun sing (){
        if (size>5) {
            println("говорит:")
            println("КАААР")}
        if (size<5){
            println("говорит:")
            println("Чик Чик Чик")}
    }
    fun trink3 (){
        if (size>5){
            println("говорит:")
            println("еще")
            size ++
            println("Размер:")
            println(size)
        }
        if (size<5){
            println("говорит:")
            println("все все")
            size ++
            println("Размер:")
            println(size)
        }
    }
    fun fly () {
        if (activ<21){
            println("говорит:")
            println("сложно")}
        if (activ<21) {
            println("говорит:")
            println("уди сейчас снесу")}
    }
}
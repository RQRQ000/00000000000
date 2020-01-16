class CATS {
    var  size : Int = 1
    var activ: Int = 1
    fun mjy () {
        if (size>11){
            println("говорит:")
            println("МЯУУУУ")}
        if (size<11){
            println("говорит:")
            println("мя")}
    }
    fun eat2 () {
        if (size>11){
            println("говорит:")
            println("Жрать")
            size ++
            println("Размер:")
            println(size)}
        if (size<11){
            println("говорит:")
            println("ВСЕЕЕ")
            size ++
            println("Размер:")
            println(size)}
    }
    fun trink2 () {
        if (size>11){
            println("говорит:")
            println("ПИИИТЬЬЬ, ПОМЕРАЮ")}
        if (size<11){
            println("говорит:")
            println("Я ЩАС ЛОПНУ")}
    }
    fun play2 () {
        if (activ<16){
            println("говорит:")
            println("ЕЩЕ ИГРАТЬ")}

        if (activ>16){
            println("говорит:")
            println("ИГРАТЬ,ИГРАТЬ,ХОЧУ ИГРАТЬ")}

    }
}
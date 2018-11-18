fun main(args: Array<String>) {
    var number_list: ArrayList<String> = ArrayList<String>()

    number_list.add("Zero")
    number_list.add("One")
    number_list.add("Two")
    number_list.add("Three")
    number_list.add("Four")

    println("0 location: " + number_list.get(0))
    println("1 location: " + number_list.get(1))
    println("2 location: " + number_list.get(2))
    println("3 location: " + number_list.get(3))
    println("4 location: " + number_list.get(4))

    println()

    for (name in number_list) {
        println(name)
    }

    println()

    number_list.set(3,"THREE")

    println("String got replaced")

    for (name in number_list) {
        println(name)
    }

    println()

    // check for the name in the list

    if (number_list.contains("Five")) {
        println("Number list contains Five")
    } else {
        println("Number List dont have Five")
    }

    println("number list by index")

    for (index in 0..number_list.size - 1 ){
        println(number_list[index])
    }

    println()

    // remove the element THREE

    println("Remove the Element THREE")

    number_list.remove("THREE")


    println()

    for (name in number_list) {
        println(name)
    }

    println()

    // Remove Two based on index
    println("Remove Two")

    number_list.removeAt(2)

    println()

    for (name in number_list) {
        println(name)
    }

    println()
    
}
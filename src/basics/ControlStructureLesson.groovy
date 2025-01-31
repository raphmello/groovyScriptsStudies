package basics

class ControlStructure {
}

static void main(String[] args) {
    if (true)
        println "value is true"

    String name = null
    if (name)
        println "name is not null"
    else
        println "name is null"

    def last = ""
    if (last)
        println "last is not empty"
    else
        println "last is empty"

    def emptyList = []
    if (emptyList)
        println "emptyList is not empty"
    else
        println "emptyList is empty"

    for (i in 0..<10) {
        print i
    }
    println()

    def list = [1, 2, 3, 4, 5]
    for (item in list) {
        print item
    }
    println()

    def list2 = [1, 2, 3, 4, 5]
    list2.each { print it}
    println()
}

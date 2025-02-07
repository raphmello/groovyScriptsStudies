package controlStructures

def num = 100
switch (num) {
    case 1:
        println "1"
        break
    case 2:
        println "2"
        break
    case 3..5:
        println "3..5"
        break
    case [100,200,300]:
        println "num is in list [100,200,300]"
        break
    case Integer:
        println "num is an Integer"
        break
    case Float:
        println "num is a Float"
        break
    default:
        println "null"
}

def validAges = 30..39
println 30 in validAges
println "test" in ["test": 1].keySet()


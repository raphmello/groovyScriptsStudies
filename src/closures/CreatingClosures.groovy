package closures

def c = {}
println c.class
println c instanceof Closure

def sayHello = { name ->
    println "Name"
}
sayHello("John")

def nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
nums.each { num ->
    print num
}
println()
nums.each {
    print it
}
println()
10.times({  print it })

Random rand = new Random()
3.times {
    println rand.nextInt(100)
}
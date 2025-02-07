package closures

def sayHello = { String firstName, String lastName ->
    println "Hello $firstName $lastName"
}
sayHello("John", "Doe")

def greet = { String firstName, String greeting = "Hello" ->
    println "$greeting, $firstName"
}

greet("Jane", "Good Morning")
greet("Jane")

def concat = { String... strings ->
    strings.join(" ")
}

println concat("Hello", "World", "Groovy", "Programming")

def someMethod(Closure closure) {
    println "..."
    println closure.maximumNumberOfParameters
    println closure.parameterTypes
}

def someClosure = { int x, int y ->
    x + y
}
someMethod(someClosure)

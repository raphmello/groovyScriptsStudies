package metaprogramming

//def expando = new Expando()
//expando.name = 'Dan'
//expando.writeCode = { -> println "$name loves to write code" }
//expando.writeCode()

class Developer {

}

def dan = new Developer()
dan.metaClass.name = 'Dan'
dan.metaClass.writeCode = { -> println "$name loves to write code" }
dan.writeCode()

String.metaClass.shout = { -> toUpperCase() }
println "hi dan".shout()

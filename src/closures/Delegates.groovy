package closures

//this -> the enclosing class
//owner -> the enclosing object, it may be a class or a closure
//delegate -> third party object where methods call or properties are resolved whenever the receiver is not defined

class ScopeDemo {
    def outerClosure = {
        println this.class.name
        println owner.class.name
        println delegate.class.name
        def nestedClosure = {
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }
        nestedClosure()
    }
}

def demo = new ScopeDemo()
demo.outerClosure()

def writer = {
    append "Dan"
    append " lives in Cleveland"
}

def append (String s) {
    println "append() called: $s"
}
StringBuffer sb = new StringBuffer()
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb
writer()
println sb
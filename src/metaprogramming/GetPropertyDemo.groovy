package metaprogramming

class PropertyDemo {
    def prop1 = "prop1"
    def prop2 = "prop2"
    def prop3 = "prop3"

    def getProperty(String name) {
        println "getProperty($name)"
        getMetaClass().getProperty(this, name)
    }
}

def propertyDemo = new PropertyDemo()

println propertyDemo.prop1
println propertyDemo.prop2
println propertyDemo.prop3


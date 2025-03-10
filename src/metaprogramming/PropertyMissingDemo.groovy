package metaprogramming

class PropertyMissing {
    def propertyMissing(String name) {
        return "missing $name"
    }

    def propertyMissing(String name, def arg) {

    }
}

def propertyMissing = new PropertyMissing()

println propertyMissing.prop1


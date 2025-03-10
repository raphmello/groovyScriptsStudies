package metaprogramming

class InvokeDemo {
    def invokeMethod(String name, Object args) {
        return "$name $args"
    }

    def test() {
        return "method exists"
    }
}

def invokeDemo = new InvokeDemo()

assert invokeDemo.test() == "method exists"
assert invokeDemo.methodNotExist() == "methodNotExist []"

import groovy.xml.MarkupBuilder

static void main(String[] args) {
    println "Hello world!"
    def i = test()
    println i
    markupTest()
    assertTest()
}

class Person {
    String name
    int age
}

def test() {
    println "Test"
    1 + 1
    def person = new Person()
    person.setName("John")
    person.setAge(30)
    println(person.name)
    println(person.age)
}

def markupTest() {
    def builder = new MarkupBuilder()
    builder.people() {
        person(name: "John", age: 30)
    }
    builder.test() {
        builder.div()
    }

    builder.html() {
        head()
        body()
        div() {
            p("Hello world!")
        }
    }

    assert !builder.toString().contains("Hello world!")
}

def assertTest() {
    assert true
    assert 1 == 1
    def x = 1
    assert x == 1
    assert false == false
    def y = [1, 2, 3]
    assert y << 6 == [1, 2, 3, 4]
    assert 1 == 2, "1 is not equal to 2"
}
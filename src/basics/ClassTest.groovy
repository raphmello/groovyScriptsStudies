package basics

import groovy.transform.ToString

static void main(String[] args) {
    def developer = new Developer(first: "John", last: "Doe")
    developer.work()
    developer.languages << "Groovy"
    developer.languages << "Java"
    println developer
    println developer.languages

    def bird = new Bird()
    println bird

    def pig = new Pig()
    println pig
}
@ToString
class Developer {
    String first
    String last
    def languages = []

    void work() {
        println("$first $last is working...")
    }
}

class Bird {

}

class Pig {

}

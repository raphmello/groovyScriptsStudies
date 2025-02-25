package oop

import groovy.transform.ToString

@ToString
class Person1 {
    String firstName, lastName

    Person1(String fullName) {
        def split = fullName.split(" ")
        firstName = split[0]
        lastName = split[1]
    }

    String someMethod(List numbers = [1, 2, 3], Boolean canAccess = false) {
        "$numbers $canAccess"
    }
}

//def person1 = new Person1(firstName: "firstName", lastName: "lastName")
//println person1

def person2 = new Person1("Rapha Mello")
println person2
println person2.someMethod(null, true)



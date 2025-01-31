package basics

import groovy.transform.Immutable
import groovy.transform.Sortable
import groovy.transform.ToString

@Immutable
class AnnotationsTransformation {
    String first, last
    int age
    Date since
    Collection favItems
}

@ToString
@Sortable
class Person {
    String first, last
}

static void main(String[] args) {
    def transformation = new AnnotationsTransformation(first: 'John', last: 'Doe', age: 30,
            since: new Date(), favItems: ['apple', 'banana'])
//    println transformation
    def person = new Person(first: 'John', last: 'Zoe')
    def person2 = new Person(first: 'Ane', last: 'Doe')

    def personList =  [person, person2]
    def sorted = personList.sort(false)
    println personList
    println sorted
}

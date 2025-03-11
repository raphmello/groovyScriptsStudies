package compileMetaProgramming

def person = new Person(first:'Rapha', last:'Mello', email:'ra@ra.com')
def person2 = new Person(first:'Rapha', last:'de Mello', email:'ra@ra.com')
println person.toString()
println person == person2

//TupleConstructor
def person3 = new Person('Rapha','de Mello', 'ra@ra.com')

def personSingleton = PersonSingleton.instance
println personSingleton

def ps1 = new PersonSortable("C", "Z", "ra")
def ps2 = new PersonSortable("A", "Z", "ra")
def ps3 = new PersonSortable("B", "G", "ra")
def personSortables = [ps1, ps2, ps3]
println personSortables.toSorted()
println "-------------------------"
println personSortables.email.join()

def personBuilder = PersonBuilder.builder()
def personBuilderInstance = personBuilder.email("").first("").last("").build()




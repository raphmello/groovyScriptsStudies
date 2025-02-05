package collection

def map = [:]
println map
println map.getClass().getName()

def emailKey = "EmailAddress"
def person = ["firstName": "John", lastName: "Doe", age: 21, (emailKey): "test@email.com"]
person.link = "www.johndoe.com"
println person
println person.lastName

for (entry in person) {
    println entry
}

def person2 = [:].tap {
    firstName = "Jane"
    lastName = "Doe"
    age = 22
    it.emailKey = emailKey
}

for (entry in person2) {
    println entry
}


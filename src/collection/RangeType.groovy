package collection

def letters = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j"]

println letters
println letters.class
for (letter in letters[2..5]) {
    println letter
}

Range r = 1..10
println r
println r.class
println r.from
println r.to

Range r2 = 1..<10
println r2
println r2.class
println r2.from
println r2.to

assert (0..10).contains(5)
assert (0..10).contains(10)
assert !(0..10).contains(-1)

def today = new Date()
def oneWeekLater = today + 7

println today
println oneWeekLater

def rangeOfDates = today..oneWeekLater
println rangeOfDates.findAll()

def rangeOfStrings = "a".."z"
println rangeOfStrings.findAll()
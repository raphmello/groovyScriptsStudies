package closures

def favNums = [2, 21, 44, 35, 8, 4]

for (num in favNums) {
    print num + " "
}
println()
favNums.each { print it + " "}
println()

favNums.eachWithIndex { int entry, int i -> print "$i $entry " }
println()

println favNums.findAll { it > 20}

println favNums.collect { it * 10}

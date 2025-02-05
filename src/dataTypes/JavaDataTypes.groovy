package dataTypes

import org.apache.commons.lang3.StringUtils
import org.apache.groovy.internal.util.Function

@Grab(group='org.apache.commons', module='commons-lang3', version='3.17.0')

def i = 1
println i.getClass().getName()

def d = ""
def defaultIfEmpty = StringUtils.defaultIfEmpty(d, "default")
println defaultIfEmpty

println 5d - 4.1d
println 5 - 4.1

// GDK Methods
assert 2 == 2.5.toInteger()
assert 2 == 2.5 as Integer
assert 2 == (int) 2.5
assert '5.50'.isNumber()
assert 5 == '5'.toInteger()

Function<Double, Integer> test = (n) -> println(n)
test.apply(123)
20.times {print '-'}
println()
1.upto(10) {print it}
println()
10.downto(1, {print it})
println()
10.step(101, 10, {print it})
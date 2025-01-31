package basics

import org.apache.commons.lang3.StringUtils
import org.apache.commons.lang3.text.WordUtils
@Grapes(
    @Grab(group='org.apache.commons', module='commons-lang3', version='3.17.0')
)
static void main(String[] args) {
    println Math.pow(10,2)
    println 10**2

    //Ternary Operator
    def a = 10
    def x = a == 11 ? 'yes' : 'no'
    println x

    //Elvis Operator
    def y = a != null ? a : 0
    println y
    def z = a ?: 0
    println z

    def person = new Person()
    def name = person?.first
    println name?.chars()

    //Safe Navigation Operator
    def name1 = person?.first?.chars()
    def fully = StringUtils.abbreviateMiddle("Raphael", "...", 5)
    println fully
}
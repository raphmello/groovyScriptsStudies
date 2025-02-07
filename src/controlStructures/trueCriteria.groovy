package controlStructures

import java.util.regex.Matcher
import java.util.regex.Pattern

def booleans = true
if (booleans) {
    println "boolean true"
}

def list = []
if (!list) {
    println "list false"
}

def map = [:]
if (!map) {
    println "map false"
}

def string = ""
if (!string) {
    println "string false"
}

def number = 0.0
if (!number) {
    println "BigDecimal false"
}
def pattern = ~$/\d/$
def matcher = pattern.matcher("123")
if(matcher) {
    println "Matcher true"
}

class TestInstance {
}

TestInstance instance = new TestInstance()
TestInstance nullInstance = null
if (instance) {
    println "Object true"
}
if (!nullInstance) {
    println "Object false"
}
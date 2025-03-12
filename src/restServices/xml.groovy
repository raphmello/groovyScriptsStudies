package restServices

import groovy.xml.MarkupBuilder

def writer = new FileWriter('data/sports.xml')
def builder = new MarkupBuilder(writer)
builder.doubleQuotes = true

builder.sports {
    sport(id: 1) {
        name 'Baseball'
    }
    sport(id: 2) {
        name 'Basketball'
    }
    sport(id: 3) {
        name 'Football'
    }
    sport(id: 4) {
        name 'Hockey'
    }
}
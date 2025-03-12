package builders

import groovy.xml.MarkupBuilder

def markupBuilder = new MarkupBuilder()
markupBuilder.omitEmptyAttributes = true
markupBuilder.omitNullAttributes = true
markupBuilder.sports {
    sport(id:1) {
        name 'Baseball'
    }
    sport(id:2) {
        name 'Basketball'
    }
    sport(id:3) {
        name 'Football'
    }
    sport(id:4) {
        name 'Hockey'
    }
    sport(id:null) {
        name ''
    }
}

println markupBuilder.toString()
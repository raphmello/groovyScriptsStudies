package builders

import groovy.json.JsonBuilder

def jsonBuilder = new JsonBuilder()
def bookList = ['builders.Book 1', 'builders.Book 2']
jsonBuilder.books {
    book {
        title 'The title'
        isbn '123-45-3-54'
        author(first: 'Rapha', last: 'Mello')
        related bookList
    }
}

println jsonBuilder.toPrettyString()

new File("jsonTest.json").write(jsonBuilder.toPrettyString())

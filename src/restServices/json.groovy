package restServices

import groovy.json.JsonBuilder

def jsonBuilder = new JsonBuilder()
def bookList = ['builders.Book 1', 'builders.Book 2']
jsonBuilder.books {
    currentBook {
        title 'The title'
        isbn '123-45-3-54'
        author(first: 'Rapha', last: 'Mello')
        related bookList
    }
    nextBook {
        title 'The title 2'
        isbn '123-45-3-54-2'
        author(first: 'Rapha', last: 'Melo')
        related bookList
    }
}

println jsonBuilder.toPrettyString()

new File("data/books.json").write(jsonBuilder.toPrettyString())
package restServices

import groovy.json.JsonSlurper

def booksJson = """
{
    "books": {
        "currentBook": {
            "title": "The title",
            "isbn": "123-45-3-54",
            "author": {
                "first": "Rapha",
                "last": "Mello"
            },
            "related": [
                "builders.Book 1",
                "builders.Book 2"
            ]
        },
        "nextBook": {
            "title": "The title 2",
            "isbn": "123-45-3-54-2",
            "author": {
                "first": "Rapha",
                "last": "Melo"
            },
            "related": [
                "builders.Book 1",
                "builders.Book 2"
            ]
        }
    }
}
"""

def slurper = new JsonSlurper()
def books = slurper.parse(new File('data/books.json'))
println books
println books.books.currentBook.title
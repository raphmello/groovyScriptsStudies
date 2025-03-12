package builders

import groovy.xml.MarkupBuilder

def writer = new FileWriter("about.html")
def markupBuilder = new MarkupBuilder(writer)
def list = [
        [id: 1, name: "Groovy"],
        [id: 2, name: "Java"]
]
markupBuilder.html {
    head {
        title 'About Raphael'
        description 'This is about'
        keywords 'Rapha, Java'
    }
    body {
        h1 'About Me'
        p 'This is about me...'
        section {
            h2 'Courses'
            table {
                tr {
                    th 'id'
                    th 'name'
                }
                list.each {item ->
                    tr {
                        td item.id
                        td item.name
                    }
                }
            }
        }
    }
}


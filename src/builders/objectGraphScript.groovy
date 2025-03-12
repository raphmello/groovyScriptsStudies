package builders
//Java Style
//public Book createBook() {
//    def book = new Book()
//    book.setTitle("My Book")
//    book.setSummary('My Summary')
//
//    def section = new Section()
//    section.setTitle("Section 1")
//
//    def chapter1 = new Chapter()
//    chapter1.setTitle("Chapter 1")
//    def chapter2 = new Chapter()
//    chapter2.setTitle("Chapter 2")
//
//    section.getChapters().addAll([chapter1, chapter2])
//    book.getSections().add(section)
//    return book
//}
def objectGraphBuilder = new ObjectGraphBuilder()
def book = objectGraphBuilder.book(title: 'Title', summary: 'Summary') {
    section(title: 'Section 1') {
        chapter(title: 'Chapter 1')
        chapter(title: 'Chapter 2')
        chapter(title: 'Chapter 3')
    }
    section(title: 'Section 2') {
        chapter(title: 'Chapter 1')
        chapter(title: 'Chapter 2')
        chapter(title: 'Chapter 3')
    }
}

println book


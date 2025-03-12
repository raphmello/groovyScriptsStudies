

import groovy.transform.ToString

@ToString(includeNames = true)
class Book {
    String title
    String summary
    List<Section> sections = []
}

@ToString(includeNames = true)
class Section {
    String title
    List<Chapter> chapters = []
}

@ToString(includeNames = true)
class Chapter {
    String title
}


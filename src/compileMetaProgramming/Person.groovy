package compileMetaProgramming

import groovy.transform.*
import groovy.transform.builder.Builder

import java.lang.reflect.Type

@ToString(includeNames = true, excludes = ['email'])
@EqualsAndHashCode(includes = ['first', 'last'])
@TupleConstructor
class Person {
    String first
    String last
    String email
}

@Canonical //ToString, EqualsAndHashCode and TupleConstructor
class Person2 {
    String first
    String last
    String email
}

@Singleton
class PersonSingleton {
    String first
    String last
    String email
}

@Canonical
@Sortable(includes = ['last', 'first'])
class PersonSortable {
    String first
    String last
    String email
}

@ToString
@Immutable
class PersonImmutable {
    String first
    String last
    String email
}

@TypeChecked
class PersonTypeChecked {
    String first
    String last
    String email

    def test() {
        this.first = 1
//        this.fist -> compile time error
    }
}

@CompileStatic
class PersonComplileStatic {
    String first
    String last
    String email

    @CompileStatic(TypeCheckingMode.SKIP)
    def test() {
        this.lassssst
    }

    def test1() {
//        this.lassssst -> compile time error
    }
}

@Builder
class PersonBuilder {
    String first
    String last
    String email
}

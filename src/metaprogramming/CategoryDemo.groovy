package metaprogramming

import groovy.time.TimeCategory

String.metaClass.shoutOld = { -> toUpperCase() }

println "Hello, World".shoutOld()


class StringCategory {
    static String getShout(String str) {
        str.toUpperCase()
    }
}

use(StringCategory) {
    println "Hello, World".shout
    println "Hello, World".getShout()
}

use(TimeCategory) {
    println 1.minute.from.now
    println 1.getMinute().getFrom().getNow()
    println 10.hours.ago
    println 10.hours.ago + 1.hour
}


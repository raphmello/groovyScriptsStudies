package metaprogramming

class DeveloperDemo {
    List languages = []

    def methodMissing(String name, def args) {
        println "$name method was called"

        if (name.startsWith("write")) {
            String language = name.split("write")[1]
            if (languages.contains(language)) {
                def impl = { Object[] theArgs ->
                    println "I code in $language"
                }
                getMetaClass()."$name" = impl
                return impl(args)
            }
        }
    }
}

def dan = new DeveloperDemo()
dan.languages << "Groovy"
dan.languages << "Java"
println dan.metaClass.methods.size()
dan.writeGroovy()
dan.writeGroovy()
dan.writeGroovy()
println dan.metaClass.methods.size()
dan.writeJava()
println dan.metaClass.methods.size()





package basics

class NumbersClass {
    int a = 1
    int b = 2
}

static void main(String[] args) {
    int a = 1
    println a.class // Integer

    def b = 1
    println b.class // Integer

    def c = 1d
    println c.class // Double
}
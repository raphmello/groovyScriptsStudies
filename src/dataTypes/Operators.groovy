package dataTypes

def a = 1
def b = 2

println a + b
println a.plus(b)

def s1 = "Hello"
def s2 = " World"

println s1 + s2
println s1.plus(s2)


class Account {
    BigDecimal balance

    Account plus(Account other) {
        new Account(balance: this.balance + other.balance)
    }
}
Account savings = new Account(balance: 100)
Account checking = new Account(balance: 500)

def account = savings + checking
println account.balance


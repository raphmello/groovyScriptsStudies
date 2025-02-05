package dataTypes

def msg1 = "Hello"
def msg2 = "World"
println "${msg1} ${msg2}"

def msg3 = """
Hello
    World
        ${msg1} ${msg2}
"""
println msg3

def folder1 = "C:\\Users\\Test\\Desktop"
println folder1
def folder2 = $/C:\Users\Test\Desktop/$
println folder2


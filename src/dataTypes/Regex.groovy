package dataTypes

import java.util.regex.Pattern

def pattern = Pattern.compile("a\\\\b")
println pattern
println pattern.class

/////// Groovy
String msgPattern = /a\b/
println msgPattern

String url = $/http://www.google.com//$
println url

def patternGroovy = ~/a\b/
println patternGroovy
println patternGroovy.class

// Find / Match
def text = "Being a Cleveland Sports Fan is no way to go through life"
def pattern2 = ~/Cleveland/
def finderGroovy = text =~ pattern2
def matcherGroovy = text ==~ pattern2

println finderGroovy.find()
println finderGroovy.size()
println finderGroovy.matches()

println matcherGroovy

def text2 = "Cleveland"
def matcherGroovy2 = text2 ==~ pattern2
println matcherGroovy2

def replacedText = text.replaceFirst(pattern2, "Columbus")
println replacedText


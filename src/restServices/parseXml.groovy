package restServices

import groovy.xml.XmlSlurper

def xml = """
<sports>
  <sport>
    <name>Football</name>
  </sport>
</sports>
"""

def sports = new XmlSlurper().parseText(xml)

println sports.sport.name

def sports2 = new XmlSlurper().parse('data/sports.xml')
println sports2
println sports2.sport[1]


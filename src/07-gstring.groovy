// 1) simple quote is java.lang.String
var str = 'truc'
assert str.getClass().toString() == 'class java.lang.String'
assert str.getClass() == String
assert str.getClass() == String. class assert str instanceof String
println str.getClass()

// 2) double quote is also java.lang.String, but...
var str2 = "truc"
assert str2.getClass() == String
println str2.getClass()

var a = 1
var b = 2

// 3) if the double quote string has interpolation, then it is a GString
var str3 = "truc ${a + b}"
println "str3 = $str3"

assert str3.getClass().toString() == 'class org.codehaus.groovy.runtime.GStringImpl'
assert str3.getClass() == org.codehaus.groovy.runtime.GStringImpl
assert str3 instanceof GString
println str3.getClass()


// 4) comparison operator is not .equals but ==
var str4 = "hello"
if (str4 == "hello" + "") {
  println "this is equal"
}

def interpolation = 'INTERPOLATION'

// 5) Triple single quote string are multiline but do not support interpolation.
// The shlash at the beginning allows the first return character to be removed.
var multilineStr = '''\
This is a multiline
with an ${interpolation} that
is not working.
'''
println multilineStr

// 6) Triple double quote string are multiline and support interpolation.
multilineStr = """\
This is a multiline
with an ${interpolation} that
is working.
"""
println multilineStr

// 7) Slashy string
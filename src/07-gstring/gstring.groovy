var str = 'truc'

assert str.getClass().toString() == 'class java.lang.String'
assert str.getClass() == String.class
println str.getClass()

var str2 = "truc"

assert str2.getClass().toString() == 'class java.lang.String'
assert str2.getClass() == String.class
println str2.getClass()

var a = 1
var b = 2

var str3 = "truc ${a + b}"
println "str3 = $str3"

assert str3.getClass().toString() == 'class org.codehaus.groovy.runtime.GStringImpl'
assert str3.getClass() == org.codehaus.groovy.runtime.GStringImpl.class
println str3.getClass()

var str4 = "hello"
if (str4 == "hello" + "") {
    println "this is equal"
}

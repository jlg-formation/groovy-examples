// Unlike Java, Groovy will evaluate the type of an object at runtime to choose the right method.
// Java chooses at compile time.

int method(String arg) {
    return 1
}

int method(Object arg) {
    return 2
}

Object o = "Object"

// method chosen is string because at runtime, Groovy sees
// that o is a string.
// at compile time, Java would see o as an object.
int result = method(o)

// Groovy has a keyword to make assertion
assert result == 1

println "result = " + result

import static org.junit.Assert.assertEquals

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

assertEquals(1, result)

println "result = " + result

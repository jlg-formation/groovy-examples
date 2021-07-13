// Get the current directory (like in Java)
var currentDirectory = System.getProperty("user.dir")
println "The current working directory is " + currentDirectory

var filename = '08-readfile.groovy'

// The java.io.File class is not the original one of Java. It has been enhanced. This is the Groovy JDK.
var file = new File(currentDirectory, filename)

// print java.io.File (yes, but the Groovy JDK java.io.File)
println file.getClass()

// eachLine is specific to Groovy.
// the {...} is the short notation for a closure object. (equivalent of lambda function in Groovy)
file.eachLine { line, nb ->
    println "${nb}: ${line}"
}

var content = new File(currentDirectory, filename).getText()
println "content size: " + content.length()

var currentDirectory = System.getProperty("user.dir")
println "The current working directory is " + currentDirectory

new File(currentDirectory, 'readfile.groovy').eachLine { line, nb ->
    println "${nb}: ${line}"
}

var content = new File(currentDirectory, 'readfile.groovy').getText()
println "content size: " + content.length()

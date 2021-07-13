var currentDirectory = System.getProperty("user.dir")
println "The current working directory is " + currentDirectory

var file = new File(currentDirectory, 'hello.txt')

file << '''Premiere ligne
Seconde ligne
Et Troisieme ligne
'''

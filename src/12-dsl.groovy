def myClosure = { println "coucou" }

def twice = { Closure<Closure> c ->
    println "start twice: " + c
    // to execute a closure without args, you must use the () or .call()
    c()
    c.call()
}

twice {
    println "start"
    myClosure()
    println "end"
}

def repeatN(int n, Closure c) {
    println "repeat " + n + " times..."
    for (int i = 0; i < n; i++) {
        c()
    }
}

repeatN(3) {
    myClosure()
}
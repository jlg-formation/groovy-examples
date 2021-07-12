def bidule = { println "coucou" }

def twice = { Closure<Closure> t ->
    println "start twice"
    println t
    t()
    t.call()
}

twice {
    println "start"
    bidule()
    println "end"
}

def t = 5

def repeatN(int n, Closure c) {
    println "repeat " + n + " times..."
    for (int i = 0; i < n; i++) {
        c()
    }
}

repeatN(3) {
    bidule()
}
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
//def item = 9
def incr = { it + 1 }
def array = [3, 7]
println "array = $array"
def array2 = array.collect(incr)
println "array2 = $array2"
println "array = $array"
//println "item = $item"

// the varialbe 'it' always exists when no arg is specified.
// { it + 1 } is equivalent to { it -> it + 1 }
def incr = {
  it + 1
}
def array = [3, 7]
println "array = $array"

// collect is equivalent to map in Javascript.
def array2 = array.collect(incr)
println "array2 = $array2"
println "array = $array"
//println "item = $item"
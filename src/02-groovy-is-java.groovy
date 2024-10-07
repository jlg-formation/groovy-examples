println "Enter a number: "

// 1) All Java class can be accessed from Groovy
// 2) def and var are identical to Object.
def scanner = new Scanner(System.in)
var nbr = scanner.nextInt()

// 3) println is in fact groovy.lang.Script.println
// 4) Some packages are already imported (not only java.lang.*)
println "your number is " + nbr

// 5) method can be used before they are defined.
// Because in fact, the script is itself a class method.
if (isPrime(nbr)) {
  println nbr + " is a prime number."
  return
}

// 5) Here is the long form for println
groovy.lang.Script.println(nbr + " is NOT a prime number")


// 6) Here is the function used before.
static boolean isPrime(int nbr) {
  for (int i = 2; i < nbr; i++) {
    if (nbr % i == 0) {
      return false
    }
  }
  return true
}
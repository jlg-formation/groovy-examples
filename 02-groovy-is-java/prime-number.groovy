println "Enter a number: "
def scanner = new Scanner(System.in)
def nbr = scanner.nextInt()
println "your number is " + nbr

if (isPrime(nbr)) {
    println nbr + " is a prime number."
    return
}

println nbr + " is NOT a prime number"

boolean isPrime(int nbr) {
    for (int i = 2; i < nbr; i++) {
        if (nbr % i == 0) {
            return false
        }
    }
    return true
}

@Grab('io.github.jlguenego:jlg-prime:0.0.1')
import io.github.jlguenego.prime.Prime

var nbr = 13
if (Prime.isPrime(nbr)) {
  println nbr + " is prime."
  return
}
println nbr + " is not prime."
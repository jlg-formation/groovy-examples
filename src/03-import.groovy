import lib.Person

Person alice = new Person()
alice.sayHello()
println("str=" + alice.getName())
alice.name = "Karen"
println "str=" + alice.getName()
alice.setName("Alice")
println "str=${alice.name}"

// Groovy creates a constructor that take a map in input
def bob = new Person(name: "Bob", age: 34)

// semicolon is allowed but unnecessary.
// bob.age will be in fact bob.getAge()
println("age=" + bob.age); 

// bob.age = 45 will call the setter bob.setAge(45).
bob.age = 45
println("age=" + bob.age)
bob.setAge(23)
println("age=" + bob.age)

// Groovy can instantiate object directly from a map.
Person charly = [name: 'Charly', age: 56]; 
charly.sayHello();
import toto.Titi

Titi titi = new Titi()
titi.hello()
println("str=" + titi.getName())
titi.name = "toto"
println("str=" + titi.getName())
titi.setName("tutu")
println("str=" + titi.name)

println("age=" + titi.age);
// this will call the setter.
titi.age = 45
println("age=" + titi.age);
titi.setAge(23)
println("age=" + titi.age);

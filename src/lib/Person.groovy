package lib

class Person {
  // every field has automatically its setter and getter created and is in fact private.
  String name = "Albert"
  int age = 45
  void setAge(int age) {
    println "setting age..."
    this.age = age
  }
  int getAge() {
    println "getting age..."
    return age
  }
  void sayHello() {
    println "Hello I am ${name}, and I am ${age} old!"
  }
}
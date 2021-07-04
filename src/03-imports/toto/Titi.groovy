package toto

class Titi {

    // every field has automatically its setter and getter created and is in fact private.
    String name = "titi"

    int age = 12

    void setAge(int age) {
        println "setting age..."
        this.age = age
    }

    int getAge() {
        println "getting age..."
        return age
    }

    void hello() {
        println "Hello from " + name
    }
}

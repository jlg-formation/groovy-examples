class MyResource implements AutoCloseable {

    void open(int x) throws Exception {
        println "opening..."
        if (x > 0) {
            throw new Exception("x is bigger than zero.")
        }
    }

    @Override
    void close() throws Exception {
        println "closing..."
    }
}

void tryThis(int x) {
    // syntax ARM (coming from Java 7)
    try (def myRes = new MyResource()) {
        myRes.open(x)
    } catch (Exception e) {
        println "e = $e"
    }
}

tryThis(0)
tryThis(1)

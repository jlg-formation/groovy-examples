package lib

// class is by default public (and accessible outside the package)
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
import lib.MyResource

void tryThis(int x) {
  // syntax ARM - Automatic Resource Management (coming from Java 7)
  try (def myRes = new MyResource()) {
    println myRes.getClass()
    myRes.open(x)
  } catch (Exception e) {
    println "e = $e"
  }
}

tryThis(0)
tryThis(1)
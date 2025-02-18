```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y //This line is causing the bug.
  }
}
```
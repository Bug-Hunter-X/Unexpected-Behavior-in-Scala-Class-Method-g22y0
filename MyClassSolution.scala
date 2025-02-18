```scala
class MyClass(private val x: Int) {
  private var _x = x
  def myMethod(y: Int): Int = {
    _x + y 
  }
  def updateX(newX:Int): Unit = {
    _x = newX
  }
}
```
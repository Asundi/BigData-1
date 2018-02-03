package example

import org.scalatest._

class HelloSpec extends FlatSpec {
  
  
  "Adding 2 and 2 " should "be 4" in{
    assert(Hello.addInt(2,2) ==4)
  }
  
}

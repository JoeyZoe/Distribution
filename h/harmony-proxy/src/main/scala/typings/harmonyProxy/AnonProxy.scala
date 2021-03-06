package typings.harmonyProxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProxy[T] extends js.Object {
  var proxy: T
  def revoke(): Unit
}

object AnonProxy {
  @scala.inline
  def apply[T](proxy: T, revoke: () => Unit): AnonProxy[T] = {
    val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any], revoke = js.Any.fromFunction0(revoke))
  
    __obj.asInstanceOf[AnonProxy[T]]
  }
}


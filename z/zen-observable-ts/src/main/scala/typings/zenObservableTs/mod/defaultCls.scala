package typings.zenObservableTs.mod

import typings.zenObservableTs.zenObservableMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zen-observable-ts", JSImport.Default)
@js.native
class defaultCls[T] protected ()
  extends typings.zenObservableTs.zenObservableMod.Observable[T] {
  def this(subscriber: Subscriber[T]) = this()
}


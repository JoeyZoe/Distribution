package typings.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/wait-for", JSImport.Namespace)
@js.native
object waitForMod extends js.Object {
  def waitFor[T](callback: js.Function0[T]): js.Promise[T] = js.native
  def waitFor[T](callback: js.Function0[T], options: AnonContainer): js.Promise[T] = js.native
}


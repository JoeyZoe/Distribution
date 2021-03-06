package typings.rcAlign

import typings.rcAlign.interfaceMod.TargetPoint
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-align/lib/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def isSamePoint(prev: TargetPoint, next: TargetPoint): Boolean = js.native
  def monitorResize(element: HTMLElement, callback: js.Function): js.Function0[Unit] = js.native
  def restoreFocus(activeElement: js.Any, container: js.Any): Unit = js.native
}


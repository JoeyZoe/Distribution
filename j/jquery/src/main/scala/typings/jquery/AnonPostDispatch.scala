package typings.jquery

import typings.jquery.JQuery_._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPostDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def postDispatch(event: typings.jquery.JQuery_.Event): Unit
}

object AnonPostDispatch {
  @scala.inline
  def apply[TTarget](postDispatch: typings.jquery.JQuery_.Event => Unit): AnonPostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction1(postDispatch))
  
    __obj.asInstanceOf[AnonPostDispatch[TTarget]]
  }
}


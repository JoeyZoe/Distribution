package typings.antd.radioInterfaceMod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioChangeEvent extends js.Object {
  var nativeEvent: MouseEvent
  var target: RadioChangeEventTarget
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object RadioChangeEvent {
  @scala.inline
  def apply(
    nativeEvent: MouseEvent,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: RadioChangeEventTarget
  ): RadioChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RadioChangeEvent]
  }
}


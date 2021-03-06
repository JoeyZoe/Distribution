package typings.preact.mod.createElement.JSX

import typings.std.DataTransfer
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.ClipboardEvent> */
@js.native
trait TargetedClipboardEvent[Target /* <: EventTarget */] extends js.Object {
  var AT_TARGET: Double = js.native
  var BUBBLING_PHASE: Double = js.native
  var CAPTURING_PHASE: Double = js.native
  var NONE: Double = js.native
  var bubbles: Boolean = js.native
  var cancelBubble: Boolean = js.native
  var cancelable: Boolean = js.native
  var clipboardData: js.UndefOr[DataTransfer] = js.native
  var composed: Boolean = js.native
  @JSName("composedPath")
  var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
  val currentTarget: Target = js.native
  var defaultPrevented: Boolean = js.native
  var eventPhase: Double = js.native
  @JSName("initEvent")
  var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
  var isTrusted: Boolean = js.native
  @JSName("preventDefault")
  var preventDefault_Original: js.Function0[Unit] = js.native
  var returnValue: Boolean = js.native
  var srcElement: js.UndefOr[EventTarget] = js.native
  @JSName("stopImmediatePropagation")
  var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
  @JSName("stopPropagation")
  var stopPropagation_Original: js.Function0[Unit] = js.native
  var target: js.UndefOr[EventTarget] = js.native
  var timeStamp: Double = js.native
  var `type`: String = js.native
  def composedPath(): js.Array[EventTarget] = js.native
  def initEvent(`type`: String): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}


package typings.electron.Electron

import typings.electron.electronStrings.alt
import typings.electron.electronStrings.capsLock
import typings.electron.electronStrings.cmd
import typings.electron.electronStrings.command
import typings.electron.electronStrings.contextMenu
import typings.electron.electronStrings.control
import typings.electron.electronStrings.ctrl
import typings.electron.electronStrings.isAutoRepeat
import typings.electron.electronStrings.isKeypad
import typings.electron.electronStrings.left
import typings.electron.electronStrings.leftButtonDown
import typings.electron.electronStrings.meta
import typings.electron.electronStrings.middle
import typings.electron.electronStrings.middleButtonDown
import typings.electron.electronStrings.mouseDown
import typings.electron.electronStrings.mouseEnter
import typings.electron.electronStrings.mouseLeave
import typings.electron.electronStrings.mouseMove
import typings.electron.electronStrings.mouseUp
import typings.electron.electronStrings.mouseWheel
import typings.electron.electronStrings.numLock
import typings.electron.electronStrings.right
import typings.electron.electronStrings.rightButtonDown
import typings.electron.electronStrings.shift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseInputEvent extends InputEvent {
  // Docs: http://electronjs.org/docs/api/structures/mouse-input-event
  /**
    * The button pressed, can be `left`, `middle`, `right`.
    */
  var button: js.UndefOr[left | middle | right] = js.undefined
  var clickCount: js.UndefOr[Double] = js.undefined
  var globalX: js.UndefOr[Double] = js.undefined
  var globalY: js.UndefOr[Double] = js.undefined
  var movementX: js.UndefOr[Double] = js.undefined
  var movementY: js.UndefOr[Double] = js.undefined
  /**
    * The type of the event, can be `mouseDown`, `mouseUp`, `mouseEnter`,
    * `mouseLeave`, `contextMenu`, `mouseWheel` or `mouseMove`.
    */
  var `type`: mouseDown | mouseUp | mouseEnter | mouseLeave | contextMenu | mouseWheel | mouseMove
  var x: Double
  var y: Double
}

object MouseInputEvent {
  @scala.inline
  def apply(
    `type`: mouseDown | mouseUp | mouseEnter | mouseLeave | contextMenu | mouseWheel | mouseMove,
    x: Double,
    y: Double,
    button: left | middle | right = null,
    clickCount: Int | Double = null,
    globalX: Int | Double = null,
    globalY: Int | Double = null,
    modifiers: js.Array[
      shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right
    ] = null,
    movementX: Int | Double = null,
    movementY: Int | Double = null
  ): MouseInputEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (clickCount != null) __obj.updateDynamic("clickCount")(clickCount.asInstanceOf[js.Any])
    if (globalX != null) __obj.updateDynamic("globalX")(globalX.asInstanceOf[js.Any])
    if (globalY != null) __obj.updateDynamic("globalY")(globalY.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (movementX != null) __obj.updateDynamic("movementX")(movementX.asInstanceOf[js.Any])
    if (movementY != null) __obj.updateDynamic("movementY")(movementY.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseInputEvent]
  }
}


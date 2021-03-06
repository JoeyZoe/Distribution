package typings.winjs.mod.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies how items in a ListView respond to the tap interaction.
  **/
@JSImport("winjs", "UI.TapBehavior")
@js.native
object TapBehavior extends js.Object {
  /* 0 */ val directSelect: typings.winjs.WinJS.UI.TapBehavior.directSelect with Double = js.native
  /* 2 */ val invokeOnly: typings.winjs.WinJS.UI.TapBehavior.invokeOnly with Double = js.native
  /* 3 */ val none: typings.winjs.WinJS.UI.TapBehavior.none with Double = js.native
  /* 1 */ val toggleSelect: typings.winjs.WinJS.UI.TapBehavior.toggleSelect with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winjs.WinJS.UI.TapBehavior with Double] = js.native
}


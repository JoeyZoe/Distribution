package typings.antd.subMenuMod

import typings.react.mod.Component
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubMenu
  extends Component[SubMenuProps, js.Any, js.Any] {
  var subMenu: js.Any = js.native
  def onKeyDown(e: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def saveSubMenu(subMenu: js.Any): Unit = js.native
}


package typings.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSelectActions[Item] extends js.Object {
  def closeMenu(): Unit
  def openMenu(): Unit
  def reset(): Unit
  def selectItem(item: Item): Unit
  def setHighlightedIndex(index: Double): Unit
  def toggleMenu(): Unit
}

object UseSelectActions {
  @scala.inline
  def apply[Item](
    closeMenu: () => Unit,
    openMenu: () => Unit,
    reset: () => Unit,
    selectItem: Item => Unit,
    setHighlightedIndex: Double => Unit,
    toggleMenu: () => Unit
  ): UseSelectActions[Item] = {
    val __obj = js.Dynamic.literal(closeMenu = js.Any.fromFunction0(closeMenu), openMenu = js.Any.fromFunction0(openMenu), reset = js.Any.fromFunction0(reset), selectItem = js.Any.fromFunction1(selectItem), setHighlightedIndex = js.Any.fromFunction1(setHighlightedIndex), toggleMenu = js.Any.fromFunction0(toggleMenu))
  
    __obj.asInstanceOf[UseSelectActions[Item]]
  }
}


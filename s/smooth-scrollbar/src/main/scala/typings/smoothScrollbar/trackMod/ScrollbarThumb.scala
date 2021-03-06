package typings.smoothScrollbar.trackMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarThumb extends js.Object {
  var displaySize: Double
  val element: HTMLElement
  var offset: Double
  var realSize: Double
  def attachTo(track: HTMLElement): Unit
  def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit
}

object ScrollbarThumb {
  @scala.inline
  def apply(
    attachTo: HTMLElement => Unit,
    displaySize: Double,
    element: HTMLElement,
    offset: Double,
    realSize: Double,
    update: (Double, Double, Double) => Unit
  ): ScrollbarThumb = {
    val __obj = js.Dynamic.literal(attachTo = js.Any.fromFunction1(attachTo), displaySize = displaySize.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], realSize = realSize.asInstanceOf[js.Any], update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[ScrollbarThumb]
  }
}


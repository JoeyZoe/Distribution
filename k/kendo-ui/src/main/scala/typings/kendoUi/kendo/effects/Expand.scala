package typings.kendoUi.kendo.effects

import typings.kendoUi.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expand extends Effect {
  def direction(value: String): Expand
}

object Expand {
  @scala.inline
  def apply(
    add: Effect => Effect,
    direction: String => Expand,
    duration: Double => Effect,
    play: () => JQueryPromise[_],
    reverse: () => JQueryPromise[_],
    stop: () => Effect
  ): Expand = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), direction = js.Any.fromFunction1(direction), duration = js.Any.fromFunction1(duration), play = js.Any.fromFunction0(play), reverse = js.Any.fromFunction0(reverse), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Expand]
  }
}


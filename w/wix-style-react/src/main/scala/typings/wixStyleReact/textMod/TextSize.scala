package typings.wixStyleReact.textMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wixStyleReact.wixStyleReactStrings.tiny
  - typings.wixStyleReact.wixStyleReactStrings.small
  - typings.wixStyleReact.wixStyleReactStrings.medium
*/
trait TextSize extends js.Object

object TextSize {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def medium: typings.wixStyleReact.wixStyleReactStrings.medium = this.cast("medium")
  @scala.inline
  def small: typings.wixStyleReact.wixStyleReactStrings.small = this.cast("small")
  @scala.inline
  def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = this.cast("tiny")
}


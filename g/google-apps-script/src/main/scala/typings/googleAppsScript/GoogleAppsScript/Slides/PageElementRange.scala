package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of one or more PageElement instances.
  */
trait PageElementRange extends js.Object {
  def getPageElements(): js.Array[PageElement]
}

object PageElementRange {
  @scala.inline
  def apply(getPageElements: () => js.Array[PageElement]): PageElementRange = {
    val __obj = js.Dynamic.literal(getPageElements = js.Any.fromFunction0(getPageElements))
  
    __obj.asInstanceOf[PageElementRange]
  }
}


package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.PivotPager")
@js.native
class PivotPager_ protected () extends Widget_ {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.PivotPager.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.PivotPager.Model) = this()
  var defaults: typings.ejWebAll.ej.PivotPager.Model = js.native
  @JSName("model")
  var model_PivotPager_ : typings.ejWebAll.ej.PivotPager.Model = js.native
  /** This function initializes the page counts and page numbers for the PivotPager.
    * @returns {void}
    */
  def initPagerProperties(): Unit = js.native
}


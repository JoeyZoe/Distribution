package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.materializeCss.PartialDatepickerOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Datepicker")
@js.native
class Datepicker ()
  extends typings.materializeCss.M.Datepicker

/* static members */
@JSImport("materialize-css", "Datepicker")
@js.native
object Datepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Datepicker = js.native
  /**
    * Init Datepickers
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Datepicker] = js.native
  def init(els: MElements, options: PartialDatepickerOptions): js.Array[typings.materializeCss.M.Datepicker] = js.native
  /**
    * Init Datepicker
    */
  def init(els: Element): typings.materializeCss.M.Datepicker = js.native
  def init(els: Element, options: PartialDatepickerOptions): typings.materializeCss.M.Datepicker = js.native
}


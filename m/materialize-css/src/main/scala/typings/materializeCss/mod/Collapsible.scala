package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.materializeCss.PartialCollapsibleOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Collapsible")
@js.native
class Collapsible ()
  extends typings.materializeCss.M.Collapsible

/* static members */
@JSImport("materialize-css", "Collapsible")
@js.native
object Collapsible extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Collapsible = js.native
  /**
    * Init Collapsibles
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Collapsible] = js.native
  def init(els: MElements, options: PartialCollapsibleOptions): js.Array[typings.materializeCss.M.Collapsible] = js.native
  /**
    * Init Collapsible
    */
  def init(els: Element): typings.materializeCss.M.Collapsible = js.native
  def init(els: Element, options: PartialCollapsibleOptions): typings.materializeCss.M.Collapsible = js.native
}


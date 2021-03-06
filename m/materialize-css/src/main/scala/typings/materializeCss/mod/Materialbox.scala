package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.materializeCss.PartialMaterialboxOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Materialbox")
@js.native
class Materialbox ()
  extends typings.materializeCss.M.Materialbox

/* static members */
@JSImport("materialize-css", "Materialbox")
@js.native
object Materialbox extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Materialbox = js.native
  /**
    * Init Materialboxes
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Materialbox] = js.native
  def init(els: MElements, options: PartialMaterialboxOptions): js.Array[typings.materializeCss.M.Materialbox] = js.native
  /**
    * Init Materialbox
    */
  def init(els: Element): typings.materializeCss.M.Materialbox = js.native
  def init(els: Element, options: PartialMaterialboxOptions): typings.materializeCss.M.Materialbox = js.native
}


package typings.materializeCss.mod

import typings.materializeCss.MElements
import typings.materializeCss.PartialSidenavOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Sidenav")
@js.native
class Sidenav ()
  extends typings.materializeCss.M.Sidenav

/* static members */
@JSImport("materialize-css", "Sidenav")
@js.native
object Sidenav extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Sidenav = js.native
  /**
    * Init Sidenavs
    */
  def init(els: MElements): js.Array[typings.materializeCss.M.Sidenav] = js.native
  def init(els: MElements, options: PartialSidenavOptions): js.Array[typings.materializeCss.M.Sidenav] = js.native
  /**
    * Init Sidenav
    */
  def init(els: Element): typings.materializeCss.M.Sidenav = js.native
  def init(els: Element, options: PartialSidenavOptions): typings.materializeCss.M.Sidenav = js.native
}


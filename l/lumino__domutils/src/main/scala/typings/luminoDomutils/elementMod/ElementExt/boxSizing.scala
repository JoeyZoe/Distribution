package typings.luminoDomutils.elementMod.ElementExt

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/domutils/lib/element", "ElementExt.boxSizing")
@js.native
object boxSizing extends js.Object {
  /**
    * Compute the box sizing for an element.
    *
    * @param element - The element of interest.
    *
    * @returns The box sizing data for the specified element.
    */
  def apply(element: Element): IBoxSizing = js.native
}


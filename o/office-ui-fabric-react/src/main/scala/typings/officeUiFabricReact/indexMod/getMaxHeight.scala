package typings.officeUiFabricReact.indexMod

import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.officeUiFabricReact.positioningTypesMod.IPoint
import typings.std.Element
import typings.std.MouseEvent
import typings.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/positioning/index", "getMaxHeight")
@js.native
object getMaxHeight extends js.Object {
  def apply(target: IPoint, targetEdge: DirectionalHint): Double = js.native
  def apply(target: IPoint, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def apply(target: IPoint, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def apply(
    target: IPoint,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def apply(target: Element, targetEdge: DirectionalHint): Double = js.native
  def apply(target: Element, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def apply(target: Element, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def apply(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def apply(target: MouseEvent, targetEdge: DirectionalHint): Double = js.native
  def apply(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def apply(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def apply(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
}


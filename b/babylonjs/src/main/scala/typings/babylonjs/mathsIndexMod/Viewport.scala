package typings.babylonjs.mathsIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Maths/index", "Viewport")
@js.native
class Viewport protected ()
  extends typings.babylonjs.mathMod.Viewport {
  /**
    * Creates a Viewport object located at (x, y) and sized (width, height)
    * @param x defines viewport left coordinate
    * @param y defines viewport top coordinate
    * @param width defines the viewport width
    * @param height defines the viewport height
    */
  def this(
    /** viewport left coordinate */
  x: Double,
    /** viewport top coordinate */
  y: Double,
    /**viewport width */
  width: Double,
    /** viewport height */
  height: Double
  ) = this()
}


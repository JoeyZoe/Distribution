package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a 2-dimensional point using the Cartesian coordinate system. */
trait Point extends js.Object {
  /** specifies the x-coordinate. */
  var X: Double
  /** specifies the y-coordinate. */
  var Y: Double
}

object Point {
  @scala.inline
  def apply(X: Double, Y: Double): Point = {
    val __obj = js.Dynamic.literal(X = X, Y = Y)
  
    __obj.asInstanceOf[Point]
  }
}


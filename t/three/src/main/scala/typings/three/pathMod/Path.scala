package typings.three.pathMod

import typings.three.curvePathMod.CurvePath
import typings.three.vector2Mod.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/core/Path", "Path")
@js.native
class Path () extends CurvePath[Vector2] {
  def this(points: js.Array[Vector2]) = this()
  var currentPoint: Vector2 = js.native
  def absarc(
    aX: Double,
    aY: Double,
    aRadius: Double,
    aStartAngle: Double,
    aEndAngle: Double,
    aClockwise: Boolean
  ): this.type = js.native
  def absellipse(
    aX: Double,
    aY: Double,
    xRadius: Double,
    yRadius: Double,
    aStartAngle: Double,
    aEndAngle: Double,
    aClockwise: Boolean,
    aRotation: Double
  ): this.type = js.native
  def arc(
    aX: Double,
    aY: Double,
    aRadius: Double,
    aStartAngle: Double,
    aEndAngle: Double,
    aClockwise: Boolean
  ): this.type = js.native
  def bezierCurveTo(aCP1x: Double, aCP1y: Double, aCP2x: Double, aCP2y: Double, aX: Double, aY: Double): this.type = js.native
  def ellipse(
    aX: Double,
    aY: Double,
    xRadius: Double,
    yRadius: Double,
    aStartAngle: Double,
    aEndAngle: Double,
    aClockwise: Boolean,
    aRotation: Double
  ): this.type = js.native
  /**
  	 * @deprecated Use {@link Path#setFromPoints .setFromPoints()} instead.
  	 */
  def fromPoints(vectors: js.Array[Vector2]): this.type = js.native
  def lineTo(x: Double, y: Double): this.type = js.native
  def moveTo(x: Double, y: Double): this.type = js.native
  def quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): this.type = js.native
  def setFromPoints(vectors: js.Array[Vector2]): this.type = js.native
  def splineThru(pts: js.Array[Vector2]): this.type = js.native
}


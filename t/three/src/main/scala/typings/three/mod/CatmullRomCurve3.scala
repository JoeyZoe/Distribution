package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "CatmullRomCurve3")
@js.native
class CatmullRomCurve3 ()
  extends typings.three.curvesMod.CatmullRomCurve3 {
  def this(points: js.Array[typings.three.vector3Mod.Vector3]) = this()
  def this(points: js.Array[typings.three.vector3Mod.Vector3], closed: Boolean) = this()
  def this(points: js.Array[typings.three.vector3Mod.Vector3], closed: Boolean, curveType: String) = this()
  def this(
    points: js.Array[typings.three.vector3Mod.Vector3],
    closed: Boolean,
    curveType: String,
    tension: Double
  ) = this()
}


package typings.pixiJs.PIXI

import typings.std.Float32Array
import typings.std.Uint16Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Standard 2D geometry used in PixiJS.
  *
  * Geometry can be defined without passing in a style or data if required.
  *
  * ```js
  * const geometry = new PIXI.Geometry();
  *
  * geometry.addAttribute('positions', [0, 0, 100, 0, 100, 100, 0, 100], 2);
  * geometry.addAttribute('uvs', [0,0,1,0,1,1,0,1], 2);
  * geometry.addIndex([0,1,2,1,3,2]);
  *
  * ```
  * @class
  * @memberof PIXI
  * @extends PIXI.Geometry
  */
@JSGlobal("PIXI.MeshGeometry")
@js.native
class MeshGeometry protected () extends Geometry {
  def this(vertices: js.Array[Double], uvs: js.Array[Double], index: js.Array[Double]) = this()
  def this(vertices: js.Array[Double], uvs: js.Array[Double], index: Uint16Array) = this()
  def this(vertices: js.Array[Double], uvs: Float32Array, index: js.Array[Double]) = this()
  def this(vertices: js.Array[Double], uvs: Float32Array, index: Uint16Array) = this()
  def this(vertices: Float32Array, uvs: js.Array[Double], index: js.Array[Double]) = this()
  def this(vertices: Float32Array, uvs: js.Array[Double], index: Uint16Array) = this()
  def this(vertices: Float32Array, uvs: Float32Array, index: js.Array[Double]) = this()
  def this(vertices: Float32Array, uvs: Float32Array, index: Uint16Array) = this()
}


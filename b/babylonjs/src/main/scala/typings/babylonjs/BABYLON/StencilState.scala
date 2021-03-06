package typings.babylonjs.BABYLON

import typings.babylonjs.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.StencilState")
@js.native
class StencilState () extends js.Object {
  var _isStencilFuncDirty: js.Any = js.native
  var _isStencilMaskDirty: js.Any = js.native
  var _isStencilOpDirty: js.Any = js.native
  var _isStencilTestDirty: js.Any = js.native
  var _stencilFunc: js.Any = js.native
  var _stencilFuncMask: js.Any = js.native
  var _stencilFuncRef: js.Any = js.native
  var _stencilMask: js.Any = js.native
  var _stencilOpDepthFail: js.Any = js.native
  var _stencilOpStencilDepthPass: js.Any = js.native
  var _stencilOpStencilFail: js.Any = js.native
  var _stencilTest: js.Any = js.native
  @JSName("apply")
  def apply(gl: WebGLRenderingContext): Unit = js.native
  def isDirty(): Boolean = js.native
  def reset(): Unit = js.native
  def stencilFunc(): Double = js.native
  def stencilFunc(value: Double): js.Any = js.native
  def stencilFuncMask(): Double = js.native
  def stencilFuncMask(value: Double): js.Any = js.native
  def stencilFuncRef(): Double = js.native
  def stencilFuncRef(value: Double): js.Any = js.native
  def stencilMask(): Double = js.native
  def stencilMask(value: Double): js.Any = js.native
  def stencilOpDepthFail(): Double = js.native
  def stencilOpDepthFail(value: Double): js.Any = js.native
  def stencilOpStencilDepthPass(): Double = js.native
  def stencilOpStencilDepthPass(value: Double): js.Any = js.native
  def stencilOpStencilFail(): Double = js.native
  def stencilOpStencilFail(value: Double): js.Any = js.native
  def stencilTest(): Boolean = js.native
  def stencilTest(value: Boolean): js.Any = js.native
}

/* static members */
@JSGlobal("BABYLON.StencilState")
@js.native
object StencilState extends js.Object {
  /** Passed to depthFunction or stencilFunction to specify depth or stencil tests will always pass. i.e. Pixels will be drawn in the order they are drawn */
  val ALWAYS: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be kept */
  val KEEP: Double = js.native
  /** Passed to stencilOperation to specify that stencil value must be replaced */
  val REPLACE: Double = js.native
}


package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.TonemapPostProcess")
@js.native
class TonemapPostProcess protected () extends PostProcess {
  /**
    * Creates a new TonemapPostProcess
    * @param name defines the name of the postprocess
    * @param _operator defines the operator to use
    * @param exposureAdjustment defines the required exposure adjustement
    * @param camera defines the camera to use (can be null)
    * @param samplingMode defines the required sampling mode (BABYLON.Texture.BILINEAR_SAMPLINGMODE by default)
    * @param engine defines the hosting engine (can be ignore if camera is set)
    * @param textureFormat defines the texture format to use (BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT by default)
    */
  def this(
    name: String,
    _operator: TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: Camera
  ) = this()
  def this(
    name: String,
    _operator: TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    _operator: TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: Camera,
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    _operator: TonemappingOperator,
    /** Defines the required exposure adjustement */
  exposureAdjustment: Double,
    camera: Camera,
    samplingMode: Double,
    engine: Engine,
    textureFormat: Double
  ) = this()
  var _operator: js.Any = js.native
  /** Defines the required exposure adjustement */
  var exposureAdjustment: Double = js.native
}


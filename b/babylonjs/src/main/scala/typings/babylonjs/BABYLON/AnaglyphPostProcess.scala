package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.AnaglyphPostProcess")
@js.native
class AnaglyphPostProcess protected () extends PostProcess {
  /**
    * Creates a new AnaglyphPostProcess
    * @param name defines postprocess name
    * @param options defines creation options or target ratio scale
    * @param rigCameras defines cameras using this postprocess
    * @param samplingMode defines required sampling mode (BABYLON.Texture.NEAREST_SAMPLINGMODE by default)
    * @param engine defines hosting engine
    * @param reusable defines if the postprocess will be reused multiple times per frame
    */
  def this(name: String, options: Double, rigCameras: js.Array[Camera]) = this()
  def this(name: String, options: PostProcessOptions, rigCameras: js.Array[Camera]) = this()
  def this(name: String, options: Double, rigCameras: js.Array[Camera], samplingMode: Double) = this()
  def this(name: String, options: PostProcessOptions, rigCameras: js.Array[Camera], samplingMode: Double) = this()
  def this(name: String, options: Double, rigCameras: js.Array[Camera], samplingMode: Double, engine: Engine) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    rigCameras: js.Array[Camera],
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    options: Double,
    rigCameras: js.Array[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    rigCameras: js.Array[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  var _passedProcess: js.Any = js.native
}


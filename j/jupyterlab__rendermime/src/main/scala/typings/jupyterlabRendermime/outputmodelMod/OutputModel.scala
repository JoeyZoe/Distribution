package typings.jupyterlabRendermime.outputmodelMod

import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/outputmodel", "OutputModel")
@js.native
class OutputModel protected () extends IOutputModel {
  /**
    * Construct a new output model.
    */
  def this(options: IOptions) = this()
  var _changed: js.Any = js.native
  var _data: js.Any = js.native
  var _metadata: js.Any = js.native
  var _raw: js.Any = js.native
  var _rawData: js.Any = js.native
  var _rawMetadata: js.Any = js.native
  /**
    * Update an observable JSON object using a readonly JSON object.
    */
  var _updateObservable: js.Any = js.native
  /**
    * A signal emitted when the output model changes.
    */
  /* CompleteClass */
  override val changed: ISignal[this.type, Unit] = js.native
  /**
    * The data associated with the model.
    */
  /* CompleteClass */
  override val data: ReadonlyPartialJSONObject = js.native
  /**
    * The execution count of the model.
    */
  /* CompleteClass */
  override val executionCount: ExecutionCount = js.native
  /**
    * The metadata associated with the model.
    *
    * Among others, it can include an attribute named `fragment`
    * that stores a URI fragment identifier for the MIME resource.
    */
  /* CompleteClass */
  override val metadata: ReadonlyPartialJSONObject = js.native
  /**
    * Whether the data in the model is trusted.
    */
  /* CompleteClass */
  override val trusted: Boolean = js.native
  /**
    * The output type.
    */
  /* CompleteClass */
  override val `type`: String = js.native
  /**
    * A signal emitted when the output model changes.
    */
  @JSName("changed")
  def changed_MOutputModel(): ISignal[this.type, Unit] = js.native
  /**
    * The data associated with the model.
    */
  @JSName("data")
  def data_MOutputModel(): ReadonlyPartialJSONObject = js.native
  /**
    * Dispose of the resources used by the output model.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * The metadata associated with the model.
    */
  @JSName("metadata")
  def metadata_MOutputModel(): ReadonlyPartialJSONObject = js.native
  /**
    * Set the data associated with the model.
    *
    * #### Notes
    * Calling this function may trigger an asynchronous operation
    * that could cause the renderer to be rendered with a new model
    * containing the new data.
    */
  /* CompleteClass */
  override def setData(options: ISetDataOptions): Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  /* CompleteClass */
  override def toJSON(): IOutput = js.native
}

@JSImport("@jupyterlab/rendermime/lib/outputmodel", "OutputModel")
@js.native
object OutputModel extends js.Object {
  /**
    * Get the data for an output.
    *
    * @params output - A kernel output message payload.
    *
    * @returns - The data for the payload.
    */
  def getData(output: IOutput): PartialJSONObject = js.native
  /**
    * Get the metadata from an output message.
    *
    * @params output - A kernel output message payload.
    *
    * @returns - The metadata for the payload.
    */
  def getMetadata(output: IOutput): PartialJSONObject = js.native
}


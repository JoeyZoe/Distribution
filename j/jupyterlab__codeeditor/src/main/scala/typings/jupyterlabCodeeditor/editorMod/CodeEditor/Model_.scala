package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.jupyterlabObservables.observablestringMod.IObservableString
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of the editor model.
  */
@JSImport("@jupyterlab/codeeditor/lib/editor", "CodeEditor.Model")
@js.native
/**
  * Construct a new Model.
  */
class Model_ () extends IModel {
  def this(options: typings.jupyterlabCodeeditor.editorMod.CodeEditor.Model.IOptions) = this()
  var _isDisposed: js.Any = js.native
  var _mimeTypeChanged: js.Any = js.native
  var _onMimeTypeChanged: js.Any = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * A mime type of the model.
    *
    * #### Notes
    * It is never `null`, the default mime type is `text/plain`.
    */
  /* CompleteClass */
  override var mimeType: String = js.native
  /**
    * A signal emitted when a property changes.
    */
  /* CompleteClass */
  override var mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String, String]] = js.native
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    */
  /* CompleteClass */
  override val modelDB: IModelDB = js.native
  /**
    * The currently selected code.
    */
  /* CompleteClass */
  override val selections: IObservableMap[js.Array[ITextSelection]] = js.native
  /**
    * The text stored in the model.
    */
  /* CompleteClass */
  override val value: IObservableString = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Whether the model is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MModel_(): Boolean = js.native
  /**
    * A signal emitted when a mimetype changes.
    */
  @JSName("mimeTypeChanged")
  def mimeTypeChanged_MModel_(): ISignal[this.type, IChangedArgs[String, String, String]] = js.native
  /**
    * A mime type of the model.
    */
  @JSName("mimeType")
  def mimeType_MModel_(): String = js.native
  @JSName("mimeType")
  def mimeType_MModel_(newValue: String): js.Any = js.native
  /**
    * Get the selections for the model.
    */
  @JSName("selections")
  def selections_MModel_(): IObservableMap[js.Array[ITextSelection]] = js.native
  /**
    * Get the value of the model.
    */
  @JSName("value")
  def value_MModel_(): IObservableString = js.native
}


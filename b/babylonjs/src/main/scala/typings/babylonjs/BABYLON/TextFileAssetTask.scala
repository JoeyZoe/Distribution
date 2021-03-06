package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.TextFileAssetTask")
@js.native
class TextFileAssetTask protected () extends AbstractAssetTask {
  /**
    * Creates a new TextFileAssetTask object
    * @param name defines the name of the task
    * @param url defines the location of the file to load
    */
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the location of the file to load
    */
  url: String
  ) = this()
  /**
    * Gets the loaded text string
    */
  var text: String = js.native
  /**
    * Defines the location of the file to load
    */
  var url: String = js.native
  /**
    * Callback called when the task is successful
    */
  def onError(task: TextFileAssetTask): Unit = js.native
  def onError(task: TextFileAssetTask, message: String): Unit = js.native
  def onError(task: TextFileAssetTask, message: String, exception: js.Any): Unit = js.native
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: TextFileAssetTask): Unit = js.native
}


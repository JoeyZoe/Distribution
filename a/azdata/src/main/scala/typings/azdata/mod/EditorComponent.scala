package typings.azdata.mod

import typings.vscode.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorComponent extends Component {
  /**
  		 * The content inside the text editor
  		 */
  var content: String = js.native
  /**
  		 * The editor Uri which will be used as a reference for VSCode Language Service.
  		 * Currently this is auto-generated by the framework but can be queried after
  		 * view initialization is completed
  		 */
  val editorUri: String = js.native
  /**
  		 * Toggle for whether the editor should be automatically resized or not
  		 */
  var isAutoResizable: Boolean = js.native
  /**
  		 * The languge mode for this text editor. The language mode is SQL by default.
  		 */
  var languageMode: String = js.native
  /**
  		 * Minimum height for editor component
  		 */
  var minimumHeight: Double = js.native
  /**
  		 * An event called when the editor content is updated
  		 */
  def onContentChanged(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onContentChanged(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onContentChanged(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
  		 * An event called when the editor is created
  		 */
  def onEditorCreated(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onEditorCreated(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onEditorCreated(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
}


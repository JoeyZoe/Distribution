package typings.azdata.mod.nb

import typings.vscode.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "nb.registerNotebookProvider")
@js.native
object registerNotebookProvider extends js.Object {
  def apply(provider: NotebookProvider): Disposable = js.native
}


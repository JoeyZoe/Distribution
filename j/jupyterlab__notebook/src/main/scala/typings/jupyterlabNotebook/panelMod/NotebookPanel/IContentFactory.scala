package typings.jupyterlabNotebook.panelMod.NotebookPanel

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabNotebook.widgetMod.Notebook
import typings.jupyterlabNotebook.widgetMod.Notebook.IOptions
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A content factory interface for NotebookPanel.
  */
trait IContentFactory
  extends typings.jupyterlabNotebook.widgetMod.StaticNotebook.IContentFactory {
  /**
    * Create a new content area for the panel.
    */
  def createNotebook(options: IOptions): Notebook
}

/**
  * The notebook renderer token.
  */
@JSImport("@jupyterlab/notebook/lib/panel", "NotebookPanel.IContentFactory")
@js.native
object IContentFactory extends TopLevel[Token[IContentFactory]]


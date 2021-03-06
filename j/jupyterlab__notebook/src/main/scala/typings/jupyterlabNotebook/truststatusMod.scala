package typings.jupyterlabNotebook

import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabApputils.vdomMod.VDomModel
import typings.jupyterlabNotebook.mod.Notebook
import typings.jupyterlabNotebook.truststatusMod.NotebookTrustStatus.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/truststatus", JSImport.Namespace)
@js.native
object truststatusMod extends js.Object {
  @js.native
  /**
    * Construct a new status item.
    */
  class NotebookTrustStatus () extends VDomRenderer[Model]
  
  @js.native
  object NotebookTrustStatus extends js.Object {
    /**
      * A VDomModel for the NotebookTrust status item.
      */
    @js.native
    class Model () extends VDomModel {
      var _activeCellTrusted: js.Any = js.native
      /**
        * Given a notebook model, figure out how many of the cells are trusted.
        */
      var _deriveCellTrustState: js.Any = js.native
      /**
        * Get the current state of the model.
        */
      var _getAllState: js.Any = js.native
      var _notebook: js.Any = js.native
      /**
        * When the active cell changes, update the trust state.
        */
      var _onActiveCellChanged: js.Any = js.native
      /**
        * When the notebook model changes, update the trust state.
        */
      var _onModelChanged: js.Any = js.native
      var _totalCells: js.Any = js.native
      /**
        * Trigger a change in the renderer.
        */
      var _triggerChange: js.Any = js.native
      var _trustedCells: js.Any = js.native
      /**
        * Whether the active cell is trusted.
        */
      def activeCellTrusted(): Boolean = js.native
      def notebook(): js.Any = js.native
      def notebook(model: Notebook): js.Any = js.native
      /**
        * The current notebook for the model.
        */
      @JSName("notebook")
      def notebook_Union(): Notebook | Null = js.native
      /**
        * The total number of cells in the current notebook.
        */
      def totalCells(): Double = js.native
      /**
        * The number of trusted cells in the current notebook.
        */
      def trustedCells(): Double = js.native
    }
    
  }
  
}


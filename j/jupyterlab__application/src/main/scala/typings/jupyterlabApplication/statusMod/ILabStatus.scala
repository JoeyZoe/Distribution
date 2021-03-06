package typings.jupyterlabApplication.statusMod

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd
import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabStatus extends js.Object {
  /**
    * A signal for when application changes its busy status.
    */
  val busySignal: ISignal[JupyterFrontEnd[IShell], Boolean]
  /**
    * A signal for when application changes its dirty status.
    */
  val dirtySignal: ISignal[JupyterFrontEnd[IShell], Boolean]
  /**
    * Whether the application is busy.
    */
  val isBusy: Boolean
  /**
    * Whether the application is dirty.
    */
  val isDirty: Boolean
  /**
    * Set the application state to busy.
    *
    * @returns A disposable used to clear the busy state for the caller.
    */
  def setBusy(): IDisposable
  /**
    * Set the application state to dirty.
    *
    * @returns A disposable used to clear the dirty state for the caller.
    */
  def setDirty(): IDisposable
}

@JSImport("@jupyterlab/application/lib/status", "ILabStatus")
@js.native
object ILabStatus extends TopLevel[Token[ILabStatus]]


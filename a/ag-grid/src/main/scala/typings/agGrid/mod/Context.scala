package typings.agGrid.mod

import typings.agGrid.contextMod.ContextParams
import typings.agGrid.iLoggerMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "Context")
@js.native
class Context protected ()
  extends typings.agGrid.contextMod.Context {
  def this(params: ContextParams, logger: ILogger) = this()
}


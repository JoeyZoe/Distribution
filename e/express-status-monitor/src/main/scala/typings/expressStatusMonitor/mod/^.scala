package typings.expressStatusMonitor.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-status-monitor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(config: ExpressStatusMonitorConfig): RequestHandler[ParamsDictionary] = js.native
}


package typings.pollyjsNodeServer.mod

import typings.express.mod.Express
import typings.pollyjsNodeServer.PartialConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/node-server", "registerExpressAPI")
@js.native
object registerExpressAPI extends js.Object {
  def apply(app: Express, config: PartialConfig): Unit = js.native
}


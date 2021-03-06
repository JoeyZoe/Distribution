package typings.reactDevUtils

import typings.express.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/noopServiceWorkerMiddleware", JSImport.Namespace)
@js.native
object noopServiceWorkerMiddlewareMod extends js.Object {
  /**
    * Returns Express middleware that serves a `/service-worker.js` at `servedPath`
    * that resets any previously set service worker configuration.
    * Useful for development.
    */
  def apply(servedPath: String): Handler = js.native
}


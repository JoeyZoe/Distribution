package typings.next.apiUtilsMod

import typings.next.utilsMod.NextApiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/next-server/server/api-utils", "parseBody")
@js.native
object parseBody extends js.Object {
  def apply(req: NextApiRequest, limit: String): js.Promise[_] = js.native
  def apply(req: NextApiRequest, limit: Double): js.Promise[_] = js.native
}


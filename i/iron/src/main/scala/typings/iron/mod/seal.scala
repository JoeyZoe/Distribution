package typings.iron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iron", "seal")
@js.native
object seal extends js.Object {
  def apply(obj: js.Object, password: String, options: SealOptions): js.Promise[String] = js.native
}


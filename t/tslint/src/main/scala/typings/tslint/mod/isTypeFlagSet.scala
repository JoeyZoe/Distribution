package typings.tslint.mod

import typings.typescript.mod.Type
import typings.typescript.mod.TypeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "isTypeFlagSet")
@js.native
object isTypeFlagSet extends js.Object {
  def apply(`type`: Type, flagToCheck: TypeFlags): Boolean = js.native
}


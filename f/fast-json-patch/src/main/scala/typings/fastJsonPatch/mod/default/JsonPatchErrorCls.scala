package typings.fastJsonPatch.mod.default

import typings.fastJsonPatch.moduleHelpersMod.JsonPatchErrorName
import typings.fastJsonPatch.moduleHelpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch", "JsonPatchError")
@js.native
class JsonPatchErrorCls protected () extends PatchError {
  def this(message: String, name: JsonPatchErrorName) = this()
  def this(message: String, name: JsonPatchErrorName, index: Double) = this()
  def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any) = this()
  def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any, tree: js.Any) = this()
}


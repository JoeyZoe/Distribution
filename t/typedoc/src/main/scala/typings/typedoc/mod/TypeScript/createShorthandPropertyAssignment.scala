package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.ShorthandPropertyAssignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createShorthandPropertyAssignment")
@js.native
object createShorthandPropertyAssignment extends js.Object {
  def apply(name: String): ShorthandPropertyAssignment = js.native
  def apply(name: String, objectAssignmentInitializer: Expression): ShorthandPropertyAssignment = js.native
  def apply(name: Identifier): ShorthandPropertyAssignment = js.native
  def apply(name: Identifier, objectAssignmentInitializer: Expression): ShorthandPropertyAssignment = js.native
}


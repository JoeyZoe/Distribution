package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Identifier
import typings.typescript.mod.ThisTypeNode
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypePredicateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createTypePredicateNode")
@js.native
object createTypePredicateNode extends js.Object {
  def apply(parameterName: String, `type`: TypeNode): TypePredicateNode = js.native
  def apply(parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def apply(parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
}


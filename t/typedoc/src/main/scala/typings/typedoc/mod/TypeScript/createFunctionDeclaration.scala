package typings.typedoc.mod.TypeScript

import typings.typescript.mod.AsteriskToken
import typings.typescript.mod.Block
import typings.typescript.mod.Decorator
import typings.typescript.mod.FunctionDeclaration
import typings.typescript.mod.Identifier
import typings.typescript.mod.Modifier
import typings.typescript.mod.ParameterDeclaration
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createFunctionDeclaration")
@js.native
object createFunctionDeclaration extends js.Object {
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration]
  ): FunctionDeclaration = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionDeclaration = js.native
  def apply(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionDeclaration = js.native
}


package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLocMembers
import typings.astTypes.kindsMod.TSCallSignatureDeclarationKind
import typings.astTypes.kindsMod.TSConstructSignatureDeclarationKind
import typings.astTypes.kindsMod.TSIndexSignatureKind
import typings.astTypes.kindsMod.TSMethodSignatureKind
import typings.astTypes.kindsMod.TSPropertySignatureKind
import typings.astTypes.namedTypesMod.namedTypes.TSTypeLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeLiteralBuilder extends js.Object {
  def apply(
    members: js.Array[
      TSCallSignatureDeclarationKind | TSConstructSignatureDeclarationKind | TSIndexSignatureKind | TSMethodSignatureKind | TSPropertySignatureKind
    ]
  ): TSTypeLiteral = js.native
  def from(params: AnonCommentsLocMembers): TSTypeLiteral = js.native
}


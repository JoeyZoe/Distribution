package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait ExpressionStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var expression: ExpressionKind
  var `type`: typings.astTypes.astTypesStrings.ExpressionStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ExpressionStatement")
@js.native
object ExpressionStatement extends TopLevel[Type[ExpressionStatement]]


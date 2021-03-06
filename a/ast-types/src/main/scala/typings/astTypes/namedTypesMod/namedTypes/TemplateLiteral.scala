package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.TemplateElementKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait TemplateLiteral
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var expressions: js.Array[ExpressionKind]
  var quasis: js.Array[TemplateElementKind]
  var `type`: typings.astTypes.astTypesStrings.TemplateLiteral
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TemplateLiteral")
@js.native
object TemplateLiteral extends TopLevel[Type[TemplateLiteral]]


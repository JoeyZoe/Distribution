package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Pattern[P]} */ trait PrivateName
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PatternKind
     with PrintableKind {
  var id: IdentifierKind
  var `type`: typings.astTypes.astTypesStrings.PrivateName
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.PrivateName")
@js.native
object PrivateName extends TopLevel[Type[PrivateName]]


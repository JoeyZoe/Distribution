package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAlias_
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier_
  var right: FlowTypeAnnotation
  var typeParameters: TypeParameterDeclaration_
  @JSName("type")
  var type_TypeAlias_ : TypeAlias
}

object TypeAlias_ {
  @scala.inline
  def apply(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    `type`: TypeAlias,
    typeParameters: TypeParameterDeclaration_,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TypeAlias_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAlias_]
  }
}


package typings.astTypes.nodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait JSXClosingFragment extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.JSXClosingFragment
}

object JSXClosingFragment {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.JSXClosingFragment): JSXClosingFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXClosingFragment]
  }
}


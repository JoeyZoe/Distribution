package typings.graphqlTools

import typings.graphql.astMod.DefinitionNode
import typings.graphql.astMod.Location
import typings.graphqlTools.graphqlToolsStrings.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefinitions extends js.Object {
  var definitions: js.Array[DefinitionNode]
  var kind: Document
  var loc: js.UndefOr[Location] = js.undefined
}

object AnonDefinitions {
  @scala.inline
  def apply(definitions: js.Array[DefinitionNode], kind: Document, loc: Location = null): AnonDefinitions = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefinitions]
  }
}


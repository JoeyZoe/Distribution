package typings.nodal.mod

import typings.nodal.TypeofModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "RelationshipGraph")
@js.native
class RelationshipGraph () extends js.Object {
  var edges: js.Array[RelationshipEdge] = js.native
  var nodes: js.Array[RelationshipNode] = js.native
  def of(mModel: TypeofModel): RelationshipNode = js.native
}


package typings.yaml.mod.ast

import typings.yaml.yamlStrings.FLOW_SEQ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowSeq
  extends SeqBase
     with SeqNode {
  @JSName("cstNode")
  var cstNode_FlowSeq: js.UndefOr[typings.yaml.mod.cst.FlowSeq] = js.undefined
  @JSName("items")
  var items_FlowSeq: js.Array[AstNode | Pair]
  @JSName("type")
  var type_FlowSeq: FLOW_SEQ
}

object FlowSeq {
  @scala.inline
  def apply(
    items: js.Array[AstNode | Pair],
    toJSON: () => js.Any,
    `type`: FLOW_SEQ,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typings.yaml.mod.cst.FlowSeq = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null
  ): FlowSeq = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSeq]
  }
}


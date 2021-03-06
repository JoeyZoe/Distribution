package typings.yaml.mod.ast

import typings.yaml.yamlStrings.BIN
import typings.yaml.yamlStrings.HEX
import typings.yaml.yamlStrings.OCT
import typings.yaml.yamlStrings.PLAIN
import typings.yaml.yamlStrings.TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlainValue
  extends Scalar
     with ScalarNode {
  @JSName("cstNode")
  var cstNode_PlainValue: js.UndefOr[typings.yaml.mod.cst.PlainValue] = js.undefined
  @JSName("type")
  var type_PlainValue: PLAIN
}

object PlainValue {
  @scala.inline
  def apply(
    toJSON: () => js.Any,
    `type`: PLAIN,
    comment: String = null,
    commentBefore: String = null,
    cstNode: typings.yaml.mod.cst.PlainValue = null,
    format: BIN | HEX | OCT | TIME = null,
    range: js.Tuple2[Double, Double] = null,
    spaceBefore: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    value: Boolean | Double | String = null
  ): PlainValue = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (commentBefore != null) __obj.updateDynamic("commentBefore")(commentBefore.asInstanceOf[js.Any])
    if (cstNode != null) __obj.updateDynamic("cstNode")(cstNode.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBefore)) __obj.updateDynamic("spaceBefore")(spaceBefore.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlainValue]
  }
}


package typings.astTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgumentCommentsLocArray extends js.Object {
  var argument: PatternKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonArgumentCommentsLocArray {
  @scala.inline
  def apply(argument: PatternKind, comments: js.Array[CommentKind] = null, loc: SourceLocationKind = null): AnonArgumentCommentsLocArray = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgumentCommentsLocArray]
  }
}


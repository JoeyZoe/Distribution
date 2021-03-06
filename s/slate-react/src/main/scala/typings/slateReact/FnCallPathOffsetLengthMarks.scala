package typings.slateReact

import typings.immutable.Immutable.List
import typings.immutable.Immutable.Set_
import typings.slate.mod.Editor
import typings.slate.mod.Mark
import typings.slate.mod.MarkJSON
import typings.slate.mod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathOffsetLengthMarks extends js.Object {
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    marks: js.Array[String | MarkProperties | MarkJSON | Mark]
  ): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    marks: Set_[String | MarkProperties | MarkJSON | Mark]
  ): Editor = js.native
}


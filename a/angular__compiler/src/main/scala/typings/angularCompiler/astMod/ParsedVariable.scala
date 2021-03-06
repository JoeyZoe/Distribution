package typings.angularCompiler.astMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "ParsedVariable")
@js.native
class ParsedVariable protected () extends js.Object {
  def this(name: String, value: String, sourceSpan: ParseSourceSpan, keySpan: ParseSourceSpan) = this()
  def this(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    keySpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan
  ) = this()
  val keySpan: ParseSourceSpan = js.native
  val name: String = js.native
  val sourceSpan: ParseSourceSpan = js.native
  val value: String = js.native
  val valueSpan: js.UndefOr[ParseSourceSpan] = js.native
}


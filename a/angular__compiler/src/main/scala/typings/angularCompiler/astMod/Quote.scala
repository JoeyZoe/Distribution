package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "Quote")
@js.native
class Quote protected () extends AST {
  def this(
    span: ParseSpan,
    sourceSpan: AbsoluteSourceSpan,
    prefix: String,
    uninterpretedExpression: String,
    location: js.Any
  ) = this()
  var location: js.Any = js.native
  var prefix: String = js.native
  var uninterpretedExpression: String = js.native
}


package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "WrappedNodeExpr")
@js.native
class WrappedNodeExpr[T] protected ()
  extends typings.angularCompiler.publicApiMod.WrappedNodeExpr[T] {
  def this(node: T) = this()
  def this(node: T, `type`: typings.angularCompiler.outputAstMod.Type) = this()
  def this(node: T, `type`: Null, sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(
    node: T,
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}


package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "Statement")
@js.native
abstract class Statement ()
  extends typings.angularCompiler.srcCompilerMod.Statement {
  def this(modifiers: js.Array[typings.angularCompiler.outputAstMod.StmtModifier]) = this()
  def this(
    modifiers: js.Array[typings.angularCompiler.outputAstMod.StmtModifier],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(modifiers: Null, sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
}


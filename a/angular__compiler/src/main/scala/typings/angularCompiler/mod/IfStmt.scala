package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "IfStmt")
@js.native
class IfStmt protected ()
  extends typings.angularCompiler.publicApiMod.IfStmt {
  def this(
    condition: typings.angularCompiler.outputAstMod.Expression,
    trueCase: js.Array[typings.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    condition: typings.angularCompiler.outputAstMod.Expression,
    trueCase: js.Array[typings.angularCompiler.outputAstMod.Statement],
    falseCase: js.Array[typings.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    condition: typings.angularCompiler.outputAstMod.Expression,
    trueCase: js.Array[typings.angularCompiler.outputAstMod.Statement],
    falseCase: js.Array[typings.angularCompiler.outputAstMod.Statement],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}


package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "TryCatchStmt")
@js.native
class TryCatchStmt protected ()
  extends typings.angularCompiler.outputAstMod.TryCatchStmt {
  def this(
    bodyStmts: js.Array[typings.angularCompiler.outputAstMod.Statement],
    catchStmts: js.Array[typings.angularCompiler.outputAstMod.Statement]
  ) = this()
  def this(
    bodyStmts: js.Array[typings.angularCompiler.outputAstMod.Statement],
    catchStmts: js.Array[typings.angularCompiler.outputAstMod.Statement],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}


package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ReadVarExpr")
@js.native
class ReadVarExpr protected ()
  extends typings.angularCompiler.outputAstMod.ReadVarExpr {
  def this(name: String) = this()
  def this(name: typings.angularCompiler.outputAstMod.BuiltinVar) = this()
  def this(name: String, `type`: typings.angularCompiler.outputAstMod.Type) = this()
  def this(
    name: typings.angularCompiler.outputAstMod.BuiltinVar,
    `type`: typings.angularCompiler.outputAstMod.Type
  ) = this()
  def this(name: String, `type`: Null, sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(
    name: String,
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: typings.angularCompiler.outputAstMod.BuiltinVar,
    `type`: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: typings.angularCompiler.outputAstMod.BuiltinVar,
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}


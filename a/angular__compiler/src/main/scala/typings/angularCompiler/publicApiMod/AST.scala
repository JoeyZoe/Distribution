package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "AST")
@js.native
class AST protected ()
  extends typings.angularCompiler.srcCompilerMod.AST {
  def this(
    span: typings.angularCompiler.astMod.ParseSpan,
    /**
    * Absolute location of the expression AST in a source code file.
    */
  sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan
  ) = this()
}


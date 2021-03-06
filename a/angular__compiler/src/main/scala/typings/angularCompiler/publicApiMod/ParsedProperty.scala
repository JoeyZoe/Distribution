package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "ParsedProperty")
@js.native
class ParsedProperty protected ()
  extends typings.angularCompiler.srcCompilerMod.ParsedProperty {
  def this(
    name: String,
    expression: typings.angularCompiler.astMod.ASTWithSource,
    `type`: typings.angularCompiler.astMod.ParsedPropertyType,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    expression: typings.angularCompiler.astMod.ASTWithSource,
    `type`: typings.angularCompiler.astMod.ParsedPropertyType,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan,
    valueSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}


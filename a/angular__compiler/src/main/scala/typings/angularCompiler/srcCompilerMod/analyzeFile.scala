package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.compilerMod.NgAnalyzeModulesHost
import typings.angularCompiler.compilerMod.NgAnalyzedFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "analyzeFile")
@js.native
object analyzeFile extends js.Object {
  def apply(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    metadataResolver: typings.angularCompiler.metadataResolverMod.CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFile = js.native
}


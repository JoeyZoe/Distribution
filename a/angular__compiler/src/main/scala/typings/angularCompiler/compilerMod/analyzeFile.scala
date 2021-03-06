package typings.angularCompiler.compilerMod

import typings.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/compiler", "analyzeFile")
@js.native
object analyzeFile extends js.Object {
  def apply(
    host: NgAnalyzeModulesHost,
    staticSymbolResolver: StaticSymbolResolver,
    metadataResolver: CompileMetadataResolver,
    fileName: String
  ): NgAnalyzedFile = js.native
}


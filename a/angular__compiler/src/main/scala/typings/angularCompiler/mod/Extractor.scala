package typings.angularCompiler.mod

import typings.angularCompiler.AnonExtractor
import typings.angularCompiler.extractorMod.ExtractorHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "Extractor")
@js.native
class Extractor protected ()
  extends typings.angularCompiler.publicApiMod.Extractor {
  def this(
    host: ExtractorHost,
    staticSymbolResolver: typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver,
    messageBundle: typings.angularCompiler.messageBundleMod.MessageBundle,
    metadataResolver: typings.angularCompiler.metadataResolverMod.CompileMetadataResolver
  ) = this()
}

/* static members */
@JSImport("@angular/compiler", "Extractor")
@js.native
object Extractor extends js.Object {
  def create(host: ExtractorHost): AnonExtractor = js.native
  def create(host: ExtractorHost, locale: String): AnonExtractor = js.native
}


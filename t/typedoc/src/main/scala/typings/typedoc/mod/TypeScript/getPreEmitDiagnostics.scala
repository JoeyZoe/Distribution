package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CancellationToken
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getPreEmitDiagnostics")
@js.native
object getPreEmitDiagnostics extends js.Object {
  def apply(program: Program): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: SourceFile): js.Array[Diagnostic] = js.native
  def apply(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
}


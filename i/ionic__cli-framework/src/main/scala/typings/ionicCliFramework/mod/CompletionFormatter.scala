package typings.ionicCliFramework.mod

import typings.ionicCliFramework.completionMod.CompletionFormatterDeps
import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "CompletionFormatter")
@js.native
abstract class CompletionFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
  extends typings.ionicCliFramework.libMod.CompletionFormatter[C, N, M, I, O] {
  def this(hasNamespace: CompletionFormatterDeps[C, N, M, I, O]) = this()
}


package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.t2ApiMod.DirectiveMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "R3TargetBinder")
@js.native
class R3TargetBinder[DirectiveT /* <: DirectiveMeta */] protected ()
  extends typings.angularCompiler.t2BinderMod.R3TargetBinder[DirectiveT] {
  def this(directiveMatcher: typings.angularCompiler.selectorMod.SelectorMatcher[DirectiveT]) = this()
}


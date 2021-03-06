package typings.grammarkdown.mod

import typings.grammarkdown.nodesMod.ProseFragment
import typings.grammarkdown.tokensMod.SyntaxKind.GreaterThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Prose")
@js.native
class Prose protected ()
  extends typings.grammarkdown.nodesMod.Prose {
  def this(greaterThanToken: typings.grammarkdown.nodesMod.Token[GreaterThanToken]) = this()
  def this(
    greaterThanToken: typings.grammarkdown.nodesMod.Token[GreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
}


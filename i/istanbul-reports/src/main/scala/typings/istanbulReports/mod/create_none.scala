package typings.istanbulReports.mod

import typings.istanbulLibReport.mod.Node
import typings.istanbulLibReport.mod.Visitor
import typings.istanbulReports.istanbulReportsStrings.none
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-reports", "create")
@js.native
object create_none extends js.Object {
  def apply(name: none): Visitor[Node] = js.native
  def apply(name: none, options: Partial[RootedOptions]): Visitor[Node] = js.native
}


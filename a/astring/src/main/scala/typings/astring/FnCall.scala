package typings.astring

import typings.astring.mod.Options
import typings.estree.mod.Node
import typings.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(node: Node): String = js.native
  def apply(node: Node, options: OptionsoutputStream): Stream = js.native
  def apply(node: Node, options: Options): String = js.native
}


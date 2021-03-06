package typings.fastGlob

import typings.node.streamMod.Readable
import typings.nodelibFsWalk.settingsMod.Options
import typings.nodelibFsWalk.settingsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(directory: String): Readable = js.native
  def apply(directory: String, optionsOrSettings: Options): Readable = js.native
  def apply(directory: String, optionsOrSettings: default): Readable = js.native
}


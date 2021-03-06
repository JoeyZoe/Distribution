package typings.fsExtraPromiseEs6.mod

import typings.fsExtraPromiseEs6.AnonEncoding
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "createWriteStream")
@js.native
object createWriteStream extends js.Object {
  def apply(path: String): WriteStream = js.native
  def apply(path: String, options: AnonEncoding): WriteStream = js.native
  def apply(path: Buffer): WriteStream = js.native
  def apply(path: Buffer, options: AnonEncoding): WriteStream = js.native
}


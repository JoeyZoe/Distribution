package typings.listStream.mod

import typings.node.streamMod.DuplexOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamMethod extends js.Object {
  def apply(): ListStream = js.native
  def apply(callback: js.Function2[/* err */ Error, /* data */ js.Array[_], Unit]): ListStream = js.native
  def apply(options: DuplexOptions): ListStream = js.native
  def apply(options: DuplexOptions, callback: js.Function2[/* err */ Error, /* data */ js.Array[_], Unit]): ListStream = js.native
}


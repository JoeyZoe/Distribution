package typings.easyXHeaders.streamMod

import typings.easyXHeaders.AnonEnd
import typings.easyXHeaders.NodeJS.WritableStream
import typings.easyXHeaders.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends EventEmitter {
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
}


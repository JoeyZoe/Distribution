package typings.readdirp.mod

import typings.node.AnonEnd
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Readable
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaddirpStream
  extends Readable
     with AsyncIterable[EntryInfo] {
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
}


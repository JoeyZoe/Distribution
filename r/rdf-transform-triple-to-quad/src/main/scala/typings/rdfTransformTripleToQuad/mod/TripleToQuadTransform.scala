package typings.rdfTransformTripleToQuad.mod

import typings.node.AnonEnd
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.Transform
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TripleToQuadTransform[Q /* <: BaseQuad */]
  extends Transform
     with Stream[Q] {
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
  /**
    * This method pulls a quad out of the internal buffer and returns it.
    * If there is no quad available, then it will return null.
    *
    * @return A quad from the internal buffer, or null if none is available.
    */
  /* InferMemberOverrides */
  override def read(): Q with (String | Buffer) = js.native
}


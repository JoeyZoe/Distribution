package typings.childProcessPromise.mod

import typings.childProcessPromise.ReadonlyOptionsExecOption
import typings.childProcessPromise.ReadonlyOptionsencodingBu_
import typings.childProcessPromise.ReadonlyOptionsencodingbu
import typings.childProcessPromise.ReadonlyOptionsencodingst
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child-process-promise", "exec")
@js.native
object exec extends js.Object {
  def apply(command: String): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(command: String, options: ReadonlyOptionsExecOption): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(command: String, options: ReadonlyOptionsencodingBu_): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(command: String, options: ReadonlyOptionsencodingbu): ChildProcessPromise[PromiseResult[Buffer]] = js.native
  def apply(command: String, options: ReadonlyOptionsencodingst): ChildProcessPromise[PromiseResult[String | Buffer]] = js.native
}


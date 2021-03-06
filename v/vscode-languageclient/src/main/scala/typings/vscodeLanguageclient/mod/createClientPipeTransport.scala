package typings.vscodeLanguageclient.mod

import typings.node.BufferEncoding
import typings.vscodeJsonrpc.pipeSupportMod.PipeTransport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "createClientPipeTransport")
@js.native
object createClientPipeTransport extends js.Object {
  def apply(pipeName: String): js.Promise[PipeTransport] = js.native
  def apply(pipeName: String, encoding: BufferEncoding): js.Promise[PipeTransport] = js.native
}


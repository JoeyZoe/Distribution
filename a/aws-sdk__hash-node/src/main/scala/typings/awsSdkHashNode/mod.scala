package typings.awsSdkHashNode

import typings.awsSdkHashNode.awsSdkHashNodeStrings.ascii
import typings.awsSdkHashNode.awsSdkHashNodeStrings.latin1
import typings.awsSdkHashNode.awsSdkHashNodeStrings.utf8
import typings.awsSdkTypes.cryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/hash-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Hash protected ()
    extends typings.awsSdkTypes.cryptoMod.Hash {
    def this(algorithmIdentifier: String) = this()
    def this(algorithmIdentifier: String, secret: SourceData) = this()
    val hash: js.Any = js.native
    @JSName("update")
    def update_ascii(toHash: SourceData, encoding: ascii): Unit = js.native
    @JSName("update")
    def update_latin1(toHash: SourceData, encoding: latin1): Unit = js.native
    @JSName("update")
    def update_utf8(toHash: SourceData, encoding: utf8): Unit = js.native
  }
  
}


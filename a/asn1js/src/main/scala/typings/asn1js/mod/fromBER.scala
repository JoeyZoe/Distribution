package typings.asn1js.mod

import typings.asn1js.AnonOffset
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "fromBER")
@js.native
object fromBER extends js.Object {
  /**
    * Major function for decoding ASN.1 BER array into internal library structuries
    * 
    * @param {ArrayBuffer} inputBuffer ASN.1 BER encoded array of bytes
    * @returns {{ offset: number; result: LocalBaseBlock }}
    */
  def apply(inputBuffer: ArrayBuffer): AnonOffset = js.native
}


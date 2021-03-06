package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.DERInteger
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIssuer extends js.Object {
  var issuer: StringParam
  var serial: DERInteger | IntegerParam | BigIntegerParam | HexParam | Double
}

object AnonIssuer {
  @scala.inline
  def apply(issuer: StringParam, serial: DERInteger | IntegerParam | BigIntegerParam | HexParam | Double): AnonIssuer = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIssuer]
  }
}


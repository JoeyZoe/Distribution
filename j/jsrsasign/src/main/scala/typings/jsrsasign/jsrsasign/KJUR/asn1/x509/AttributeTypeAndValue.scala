package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import typings.jsrsasign.jsrsasign.KJUR.asn1.DERIA5String
import typings.jsrsasign.jsrsasign.KJUR.asn1.DERPrintableString
import typings.jsrsasign.jsrsasign.KJUR.asn1.DERTeletexString
import typings.jsrsasign.jsrsasign.KJUR.asn1.DERUTF8String
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typings.jsrsasign.jsrsasignStrings.ia5
import typings.jsrsasign.jsrsasignStrings.prn
import typings.jsrsasign.jsrsasignStrings.tel
import typings.jsrsasign.jsrsasignStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AttributeTypeAndValue ASN.1 structure class
  * @param params associative array of parameters (ex. {'str': 'C=US'})
  * @see KJUR.asn1.x509.X500Name
  * @see KJUR.asn1.x509.RDN
  * @see KJUR.asn1.x509.AttributeTypeAndValue
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.AttributeTypeAndValue")
@js.native
class AttributeTypeAndValue protected () extends ASN1Object {
  def this(params: StringParam) = this()
  @JSName("getValueObj")
  def getValueObj_ia5(dsType: ia5, valueStr: String): DERIA5String = js.native
  @JSName("getValueObj")
  def getValueObj_prn(dsType: prn, valueStr: String): DERPrintableString = js.native
  @JSName("getValueObj")
  def getValueObj_tel(dsType: tel, valueStr: String): DERTeletexString = js.native
  @JSName("getValueObj")
  def getValueObj_utf8(dsType: utf8, valueStr: String): DERUTF8String = js.native
  def setByAttrTypeAndValueStr(shortAttrType: String, valueStr: String): Unit = js.native
  def setByString(attrTypeAndValueStr: String): Unit = js.native
}


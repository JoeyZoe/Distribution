package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.Signature")
@js.native
class Signature protected () extends js.Object {
  val Application: js.Any = js.native
  var AttachCertificate: Boolean = js.native
  val CanSetup: Boolean = js.native
  val Creator: Double = js.native
  val Details: SignatureInfo = js.native
  val ExpireDate: VarDate = js.native
  val IsCertificateExpired: Boolean = js.native
  val IsCertificateRevoked: Boolean = js.native
  val IsSignatureLine: Boolean = js.native
  val IsSigned: Boolean = js.native
  val IsValid: Boolean = js.native
  val Issuer: String = js.native
  @JSName("Office.Signature_typekey")
  var OfficeDotSignature_typekey: Signature = js.native
  val Parent: js.Any = js.native
  val Setup: SignatureSetup = js.native
  val SignDate: VarDate = js.native
  val SignatureLineShape: Shape = js.native
  val Signer: String = js.native
  val SortHint: Double = js.native
  def Delete(): Unit = js.native
  def ShowDetails(): Unit = js.native
  def Sign(): Unit = js.native
  def Sign(varSigImg: js.Any): Unit = js.native
  def Sign(varSigImg: js.Any, varDelSuggSigner: js.Any): Unit = js.native
  def Sign(varSigImg: js.Any, varDelSuggSigner: js.Any, varDelSuggSignerLine2: js.Any): Unit = js.native
  def Sign(
    varSigImg: js.Any,
    varDelSuggSigner: js.Any,
    varDelSuggSignerLine2: js.Any,
    varDelSuggSignerEmail: js.Any
  ): Unit = js.native
}


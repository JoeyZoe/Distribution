package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceQuotaRequest extends js.Object {
  /**
    * Identifies the service quota you want to select.
    */
  var QuotaCode: typings.awsSdk.servicequotasMod.QuotaCode = js.native
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: typings.awsSdk.servicequotasMod.ServiceCode = js.native
}

object GetServiceQuotaRequest {
  @scala.inline
  def apply(QuotaCode: QuotaCode, ServiceCode: ServiceCode): GetServiceQuotaRequest = {
    val __obj = js.Dynamic.literal(QuotaCode = QuotaCode.asInstanceOf[js.Any], ServiceCode = ServiceCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetServiceQuotaRequest]
  }
}


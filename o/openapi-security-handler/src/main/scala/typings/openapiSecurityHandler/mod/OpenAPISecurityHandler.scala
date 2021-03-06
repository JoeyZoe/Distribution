package typings.openapiSecurityHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPISecurityHandler extends IOpenAPISecurityHandler {
  var operationSecurity: js.Any
  var securitySets: js.Any
  def handle(request: js.Any): js.Promise[Unit]
}

object OpenAPISecurityHandler {
  @scala.inline
  def apply(handle: js.Any => js.Promise[Unit], operationSecurity: js.Any, securitySets: js.Any): OpenAPISecurityHandler = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle), operationSecurity = operationSecurity.asInstanceOf[js.Any], securitySets = securitySets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenAPISecurityHandler]
  }
}


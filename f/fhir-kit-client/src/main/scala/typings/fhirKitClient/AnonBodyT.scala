package typings.fhirKitClient

import typings.fhirKitClient.mod.CustomResource
import typings.fhirKitClient.mod.CustomResourceType
import typings.request.mod.Headers
import typings.request.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyT[T /* <: CustomResource */] extends js.Object {
  var body: T
  var headers: js.UndefOr[Headers] = js.undefined
  var options: js.UndefOr[Options] = js.undefined
  var resourceType: CustomResourceType
}

object AnonBodyT {
  @scala.inline
  def apply[T /* <: CustomResource */](body: T, resourceType: CustomResourceType, headers: Headers = null, options: Options = null): AnonBodyT[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyT[T]]
  }
}


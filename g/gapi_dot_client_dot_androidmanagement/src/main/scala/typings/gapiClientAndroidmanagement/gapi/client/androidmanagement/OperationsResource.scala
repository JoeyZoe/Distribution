package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAndroidmanagement.AnonAlt
import typings.gapiClientAndroidmanagement.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If
    * the server doesn't support this method, it returns google.rpc.Code.UNIMPLEMENTED. Clients can use Operations.GetOperation or other methods to check
    * whether the cancellation succeeded or whether the operation completed despite cancellation. On successful cancellation, the operation is not deleted;
    * instead, it becomes an operation with an Operation.error value with a google.rpc.Status.code of 1, corresponding to Code.CANCELLED.
    */
  def cancel(request: AnonAlt): Request_[js.Object]
  /**
    * Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the
    * operation. If the server doesn't support this method, it returns google.rpc.Code.UNIMPLEMENTED.
    */
  def delete(request: AnonAlt): Request_[js.Object]
  /**
    * Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: AnonAlt): Request_[Operation]
  /**
    * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns UNIMPLEMENTED.NOTE: the name
    * binding allows API services to override the binding to use different resource name schemes, such as users/&#42;/operations. To override the binding, API
    * services can add a binding such as "/v1/{name=users/&#42;}/operations" to their service configuration. For backwards compatibility, the default name
    * includes the operations collection id, however overriding users must ensure the name binding is the parent resource, without the operations collection
    * id.
    */
  def list(request: AnonBearertoken): Request_[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: AnonAlt => Request_[js.Object],
    delete: AnonAlt => Request_[js.Object],
    get: AnonAlt => Request_[Operation],
    list: AnonBearertoken => Request_[ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}


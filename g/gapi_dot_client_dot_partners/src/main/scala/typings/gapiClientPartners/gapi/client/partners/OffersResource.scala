package typings.gapiClientPartners.gapi.client.partners

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPartners.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffersResource extends js.Object {
  var history: HistoryResource
  /** Lists the Offers available for the current user */
  def list(request: AnonFields): Request_[ListOffersResponse]
}

object OffersResource {
  @scala.inline
  def apply(history: HistoryResource, list: AnonFields => Request_[ListOffersResponse]): OffersResource = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OffersResource]
  }
}


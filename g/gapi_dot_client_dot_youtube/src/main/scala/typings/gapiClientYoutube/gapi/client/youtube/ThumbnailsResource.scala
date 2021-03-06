package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonVideoId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailsResource extends js.Object {
  /** Uploads a custom video thumbnail to YouTube and sets it for a video. */
  def set(request: AnonVideoId): Request_[ThumbnailSetResponse]
}

object ThumbnailsResource {
  @scala.inline
  def apply(set: AnonVideoId => Request_[ThumbnailSetResponse]): ThumbnailsResource = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[ThumbnailsResource]
  }
}


package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutube.AnonHl
import typings.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel
import typings.gapiClientYoutube.AnonPart
import typings.gapiClientYoutube.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionsResource extends js.Object {
  /** Deletes a channelSection. */
  def delete(request: AnonPrettyPrint): Request_[Unit]
  /** Adds a channelSection for the authenticated user's channel. */
  def insert(request: AnonOnBehalfOfContentOwnerChannel): Request_[ChannelSection]
  /** Returns channelSection resources that match the API request criteria. */
  def list(request: AnonHl): Request_[ChannelSectionListResponse]
  /** Update a channelSection. */
  def update(request: AnonPart): Request_[ChannelSection]
}

object ChannelSectionsResource {
  @scala.inline
  def apply(
    delete: AnonPrettyPrint => Request_[Unit],
    insert: AnonOnBehalfOfContentOwnerChannel => Request_[ChannelSection],
    list: AnonHl => Request_[ChannelSectionListResponse],
    update: AnonPart => Request_[ChannelSection]
  ): ChannelSectionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ChannelSectionsResource]
  }
}


package typings.evernote.mod.NoteStore

import typings.evernote.AnonCurrentTime
import typings.evernote.mod.Types.MessageEventID
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.SyncState")
@js.native
class SyncState () extends js.Object {
  def this(args: AnonCurrentTime) = this()
  var currentTime: js.UndefOr[Timestamp] = js.native
  var fullSyncBefore: js.UndefOr[Timestamp] = js.native
  var updateCount: js.UndefOr[Double] = js.native
  var uploaded: js.UndefOr[Double] = js.native
  var userLastUpdated: js.UndefOr[Timestamp] = js.native
  var userMaxMessageEventId: js.UndefOr[MessageEventID] = js.native
}


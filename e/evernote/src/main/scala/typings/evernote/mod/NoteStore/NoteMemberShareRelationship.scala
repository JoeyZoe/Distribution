package typings.evernote.mod.NoteStore

import typings.evernote.AnonPrivilege
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "NoteStore.NoteMemberShareRelationship")
@js.native
class NoteMemberShareRelationship () extends js.Object {
  def this(args: AnonPrivilege) = this()
  var displayName: js.UndefOr[String] = js.native
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.native
  var recipientUserId: js.UndefOr[UserID] = js.native
  var restrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.native
  var sharerUserId: js.UndefOr[UserID] = js.native
}


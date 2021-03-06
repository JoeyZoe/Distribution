package typings.evernote.mod.Errors

import typings.evernote.mod.Types.Contact
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Errors.EDAMInvalidContactsException")
@js.native
class EDAMInvalidContactsException () extends Error {
  var contacts: js.Array[Contact] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var parameter: String = js.native
  var reasons: js.Array[EDAMInvalidContactReason] = js.native
}


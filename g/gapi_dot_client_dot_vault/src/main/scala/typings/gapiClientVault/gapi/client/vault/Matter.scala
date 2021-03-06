package typings.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matter extends js.Object {
  /** The description of the matter. */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The matter ID which is generated by the server.
    * Should be blank when creating a new matter.
    */
  var matterId: js.UndefOr[String] = js.undefined
  /**
    * List of users and access to the matter. Currently there is no programmer
    * defined limit on the number of permissions a matter can have.
    */
  var matterPermissions: js.UndefOr[js.Array[MatterPermission]] = js.undefined
  /** The name of the matter. */
  var name: js.UndefOr[String] = js.undefined
  /** The state of the matter. */
  var state: js.UndefOr[String] = js.undefined
}

object Matter {
  @scala.inline
  def apply(
    description: String = null,
    matterId: String = null,
    matterPermissions: js.Array[MatterPermission] = null,
    name: String = null,
    state: String = null
  ): Matter = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (matterId != null) __obj.updateDynamic("matterId")(matterId.asInstanceOf[js.Any])
    if (matterPermissions != null) __obj.updateDynamic("matterPermissions")(matterPermissions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matter]
  }
}


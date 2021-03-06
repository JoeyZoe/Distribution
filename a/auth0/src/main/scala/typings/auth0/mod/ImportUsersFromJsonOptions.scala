package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportUsersFromJsonOptions
  extends BaseImportUsersOptions
     with ImportUsersOptions {
  var users_json: String
}

object ImportUsersFromJsonOptions {
  @scala.inline
  def apply(
    connection_id: String,
    users_json: String,
    external_id: String = null,
    send_completion_email: js.UndefOr[Boolean] = js.undefined,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): ImportUsersFromJsonOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any], users_json = users_json.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (!js.isUndefined(send_completion_email)) __obj.updateDynamic("send_completion_email")(send_completion_email.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportUsersFromJsonOptions]
  }
}


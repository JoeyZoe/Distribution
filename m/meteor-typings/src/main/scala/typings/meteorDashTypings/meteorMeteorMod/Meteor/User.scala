package typings.meteorDashTypings.meteorMeteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var _id: js.UndefOr[String] = js.undefined
  var createdAt: js.UndefOr[Double] = js.undefined
  var emails: js.UndefOr[js.Array[UserEmail]] = js.undefined
  var profile: js.UndefOr[js.Any] = js.undefined
  var services: js.UndefOr[js.Any] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object User {
  @scala.inline
  def apply(
    _id: String = null,
    createdAt: Int | Double = null,
    emails: js.Array[UserEmail] = null,
    profile: js.Any = null,
    services: js.Any = null,
    username: String = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

@JSImport("meteor/meteor", "Meteor.user")
@js.native
object user extends js.Object {
  def apply(): User = js.native
}


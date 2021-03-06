package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.openidClient.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionResponse
  extends /* key */ StringDictionary[js.Any] {
  var active: Boolean
  var aud: js.UndefOr[String | js.Array[String]] = js.undefined
  var client_id: js.UndefOr[String] = js.undefined
  var cnf: js.UndefOr[AnonKey] = js.undefined
  var exp: js.UndefOr[Double] = js.undefined
  var iat: js.UndefOr[Double] = js.undefined
  var iss: js.UndefOr[String] = js.undefined
  var jti: js.UndefOr[String] = js.undefined
  var scope: String
  var sid: js.UndefOr[String] = js.undefined
  var token_type: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object IntrospectionResponse {
  @scala.inline
  def apply(
    active: Boolean,
    scope: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    aud: String | js.Array[String] = null,
    client_id: String = null,
    cnf: AnonKey = null,
    exp: Int | Double = null,
    iat: Int | Double = null,
    iss: String = null,
    jti: String = null,
    sid: String = null,
    token_type: String = null,
    username: String = null
  ): IntrospectionResponse = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (aud != null) __obj.updateDynamic("aud")(aud.asInstanceOf[js.Any])
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (cnf != null) __obj.updateDynamic("cnf")(cnf.asInstanceOf[js.Any])
    if (exp != null) __obj.updateDynamic("exp")(exp.asInstanceOf[js.Any])
    if (iat != null) __obj.updateDynamic("iat")(iat.asInstanceOf[js.Any])
    if (iss != null) __obj.updateDynamic("iss")(iss.asInstanceOf[js.Any])
    if (jti != null) __obj.updateDynamic("jti")(jti.asInstanceOf[js.Any])
    if (sid != null) __obj.updateDynamic("sid")(sid.asInstanceOf[js.Any])
    if (token_type != null) __obj.updateDynamic("token_type")(token_type.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionResponse]
  }
}


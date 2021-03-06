package typings.oktaOktaVue.mod.OktaVuePlugin

import typings.oktaOktaVue.AnonAutoRenew
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OktaVueOptions extends OktaAuthJsOptions {
  var clientId: String
  var issuer: String
  var redirectUri: String
}

object OktaVueOptions {
  @scala.inline
  def apply(
    clientId: String,
    issuer: String,
    redirectUri: String,
    authorizeUrl: String = null,
    ignoreSignature: js.UndefOr[Boolean] = js.undefined,
    maxClockSkew: Int | Double = null,
    nonce: String = null,
    pkce: js.UndefOr[Boolean] = js.undefined,
    postLogoutRedirectUri: String = null,
    responseMode: String = null,
    responseType: String | js.Array[String] = null,
    scopes: js.Array[String] = null,
    sessionToken: String = null,
    state: String = null,
    tokenManager: AnonAutoRenew = null,
    tokenUrl: String = null,
    userinfoUrl: String = null
  ): OktaVueOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
    if (authorizeUrl != null) __obj.updateDynamic("authorizeUrl")(authorizeUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSignature)) __obj.updateDynamic("ignoreSignature")(ignoreSignature.asInstanceOf[js.Any])
    if (maxClockSkew != null) __obj.updateDynamic("maxClockSkew")(maxClockSkew.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (!js.isUndefined(pkce)) __obj.updateDynamic("pkce")(pkce.asInstanceOf[js.Any])
    if (postLogoutRedirectUri != null) __obj.updateDynamic("postLogoutRedirectUri")(postLogoutRedirectUri.asInstanceOf[js.Any])
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tokenManager != null) __obj.updateDynamic("tokenManager")(tokenManager.asInstanceOf[js.Any])
    if (tokenUrl != null) __obj.updateDynamic("tokenUrl")(tokenUrl.asInstanceOf[js.Any])
    if (userinfoUrl != null) __obj.updateDynamic("userinfoUrl")(userinfoUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OktaVueOptions]
  }
}


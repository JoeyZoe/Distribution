package typings.reactTwitterAuth.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.reactTwitterAuth.reactTwitterAuthStrings.`same-origin`
import typings.reactTwitterAuth.reactTwitterAuthStrings.include
import typings.reactTwitterAuth.reactTwitterAuthStrings.omit
import typings.std.HeadersInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterLoginProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var credentials: js.UndefOr[omit | `same-origin` | include] = js.undefined
  var customHeaders: js.UndefOr[HeadersInit] = js.undefined
  var dialogHeight: js.UndefOr[Double] = js.undefined
  var dialogWidth: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var forceLogin: js.UndefOr[Boolean] = js.undefined
  var loginUrl: String
  var requestTokenUrl: String
  var showIcon: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  def onFailure(msg: String): Unit
  def onSuccess(response: String): Unit
}

object TwitterLoginProps {
  @scala.inline
  def apply(
    loginUrl: String,
    onFailure: String => Unit,
    onSuccess: String => Unit,
    requestTokenUrl: String,
    children: ReactNode = null,
    credentials: omit | `same-origin` | include = null,
    customHeaders: HeadersInit = null,
    dialogHeight: Int | Double = null,
    dialogWidth: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    forceLogin: js.UndefOr[Boolean] = js.undefined,
    showIcon: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tag: ReactType[_] = null,
    text: String = null
  ): TwitterLoginProps = {
    val __obj = js.Dynamic.literal(loginUrl = loginUrl.asInstanceOf[js.Any], onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess), requestTokenUrl = requestTokenUrl.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (dialogHeight != null) __obj.updateDynamic("dialogHeight")(dialogHeight.asInstanceOf[js.Any])
    if (dialogWidth != null) __obj.updateDynamic("dialogWidth")(dialogWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(forceLogin)) __obj.updateDynamic("forceLogin")(forceLogin.asInstanceOf[js.Any])
    if (!js.isUndefined(showIcon)) __obj.updateDynamic("showIcon")(showIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterLoginProps]
  }
}


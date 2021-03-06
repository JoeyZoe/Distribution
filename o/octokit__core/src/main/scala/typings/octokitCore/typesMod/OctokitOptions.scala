package typings.octokitCore.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OctokitOptions
  extends /* option */ StringDictionary[js.Any] {
  var auth: js.UndefOr[js.Any] = js.undefined
  var authStrategy: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestRequestOptions */ js.Any
  ] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object OctokitOptions {
  @scala.inline
  def apply(
    StringDictionary: /* option */ StringDictionary[js.Any] = null,
    auth: js.Any = null,
    authStrategy: js.Any = null,
    request: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestRequestOptions */ js.Any = null,
    timeZone: String = null
  ): OctokitOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (authStrategy != null) __obj.updateDynamic("authStrategy")(authStrategy.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[OctokitOptions]
  }
}


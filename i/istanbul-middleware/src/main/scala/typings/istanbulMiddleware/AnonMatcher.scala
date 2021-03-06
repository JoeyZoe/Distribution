package typings.istanbulMiddleware

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.istanbulMiddleware.mod.ClientMatcher
import typings.istanbulMiddleware.mod.PathTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatcher extends js.Object {
  var matcher: js.UndefOr[ClientMatcher] = js.undefined
  var pathTransformer: js.UndefOr[PathTransformer] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object AnonMatcher {
  @scala.inline
  def apply(
    matcher: /* req */ Request_[ParamsDictionary] => Boolean = null,
    pathTransformer: /* req */ Request_[ParamsDictionary] => String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): AnonMatcher = {
    val __obj = js.Dynamic.literal()
    if (matcher != null) __obj.updateDynamic("matcher")(js.Any.fromFunction1(matcher))
    if (pathTransformer != null) __obj.updateDynamic("pathTransformer")(js.Any.fromFunction1(pathTransformer))
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatcher]
  }
}


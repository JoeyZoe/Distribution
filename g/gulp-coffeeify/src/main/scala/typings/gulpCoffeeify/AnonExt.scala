package typings.gulpCoffeeify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExt extends js.Object {
  var ext: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[js.Function1[/* data */ String, String]] = js.undefined
}

object AnonExt {
  @scala.inline
  def apply(ext: String = null, transform: /* data */ String => String = null): AnonExt = {
    val __obj = js.Dynamic.literal()
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[AnonExt]
  }
}


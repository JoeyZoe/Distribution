package typings.mz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[String | Double] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: String = null, flag: String = null, mode: String | Double = null): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Encoding]
  }
}


package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenMerchantCardList_
  extends BaseOptions[js.Any, js.Any] {
  var partnerId: String
}

object OpenMerchantCardList_ {
  @scala.inline
  def apply(
    partnerId: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): OpenMerchantCardList_ = {
    val __obj = js.Dynamic.literal(partnerId = partnerId.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenMerchantCardList_]
  }
}


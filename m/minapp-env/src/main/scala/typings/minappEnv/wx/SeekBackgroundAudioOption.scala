package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeekBackgroundAudioOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SeekBackgroundAudioCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SeekBackgroundAudioFailCallback] = js.undefined
  /** 音乐位置，单位：秒 */
  var position: Double
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SeekBackgroundAudioSuccessCallback] = js.undefined
}

object SeekBackgroundAudioOption {
  @scala.inline
  def apply(
    position: Double,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    success: /* res */ GeneralCallbackResult => Unit = null
  ): SeekBackgroundAudioOption = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SeekBackgroundAudioOption]
  }
}


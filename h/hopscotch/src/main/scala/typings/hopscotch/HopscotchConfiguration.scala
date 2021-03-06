package typings.hopscotch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HopscotchConfiguration extends js.Object {
  var arrowWidth: js.UndefOr[Double] = js.undefined
  var bubbleWidth: js.UndefOr[Double] = js.undefined
  var buddleHeight: js.UndefOr[Double] = js.undefined
  var i18n: js.UndefOr[AnonCloseTooltip] = js.undefined
  var nextOnTargetClick: js.UndefOr[Boolean] = js.undefined
  var onClose: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var onEnd: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var onError: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var onNext: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var onPrev: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var onShow: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var onStart: js.UndefOr[CallbackNameNamesOrDefinition] = js.undefined
  var scrollDuration: js.UndefOr[Double] = js.undefined
  var scrollTopMargin: js.UndefOr[Double] = js.undefined
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  var showNextButton: js.UndefOr[Boolean] = js.undefined
  var showPrevButton: js.UndefOr[Boolean] = js.undefined
  var skipIfNoElement: js.UndefOr[Boolean] = js.undefined
  var smoothScroll: js.UndefOr[Boolean] = js.undefined
}

object HopscotchConfiguration {
  @scala.inline
  def apply(
    arrowWidth: Int | Double = null,
    bubbleWidth: Int | Double = null,
    buddleHeight: Int | Double = null,
    i18n: AnonCloseTooltip = null,
    nextOnTargetClick: js.UndefOr[Boolean] = js.undefined,
    onClose: CallbackNameNamesOrDefinition = null,
    onEnd: CallbackNameNamesOrDefinition = null,
    onError: CallbackNameNamesOrDefinition = null,
    onNext: CallbackNameNamesOrDefinition = null,
    onPrev: CallbackNameNamesOrDefinition = null,
    onShow: CallbackNameNamesOrDefinition = null,
    onStart: CallbackNameNamesOrDefinition = null,
    scrollDuration: Int | Double = null,
    scrollTopMargin: Int | Double = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showNextButton: js.UndefOr[Boolean] = js.undefined,
    showPrevButton: js.UndefOr[Boolean] = js.undefined,
    skipIfNoElement: js.UndefOr[Boolean] = js.undefined,
    smoothScroll: js.UndefOr[Boolean] = js.undefined
  ): HopscotchConfiguration = {
    val __obj = js.Dynamic.literal()
    if (arrowWidth != null) __obj.updateDynamic("arrowWidth")(arrowWidth.asInstanceOf[js.Any])
    if (bubbleWidth != null) __obj.updateDynamic("bubbleWidth")(bubbleWidth.asInstanceOf[js.Any])
    if (buddleHeight != null) __obj.updateDynamic("buddleHeight")(buddleHeight.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (!js.isUndefined(nextOnTargetClick)) __obj.updateDynamic("nextOnTargetClick")(nextOnTargetClick.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onEnd != null) __obj.updateDynamic("onEnd")(onEnd.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onNext != null) __obj.updateDynamic("onNext")(onNext.asInstanceOf[js.Any])
    if (onPrev != null) __obj.updateDynamic("onPrev")(onPrev.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (onStart != null) __obj.updateDynamic("onStart")(onStart.asInstanceOf[js.Any])
    if (scrollDuration != null) __obj.updateDynamic("scrollDuration")(scrollDuration.asInstanceOf[js.Any])
    if (scrollTopMargin != null) __obj.updateDynamic("scrollTopMargin")(scrollTopMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showNextButton)) __obj.updateDynamic("showNextButton")(showNextButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showPrevButton)) __obj.updateDynamic("showPrevButton")(showPrevButton.asInstanceOf[js.Any])
    if (!js.isUndefined(skipIfNoElement)) __obj.updateDynamic("skipIfNoElement")(skipIfNoElement.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothScroll)) __obj.updateDynamic("smoothScroll")(smoothScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[HopscotchConfiguration]
  }
}


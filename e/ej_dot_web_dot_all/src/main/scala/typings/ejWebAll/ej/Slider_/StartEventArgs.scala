package typings.ejWebAll.ej.Slider_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns slider id
    */
  var id: js.UndefOr[String] = js.undefined
  /** returns the slider model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns current handle number or index
    */
  var sliderIndex: js.UndefOr[Double] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the slider value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object StartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    model: Model = null,
    sliderIndex: Int | Double = null,
    `type`: String = null,
    value: Int | Double = null
  ): StartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (sliderIndex != null) __obj.updateDynamic("sliderIndex")(sliderIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartEventArgs]
  }
}


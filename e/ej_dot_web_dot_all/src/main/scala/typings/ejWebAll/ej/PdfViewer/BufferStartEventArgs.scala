package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferStartEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Specifies the state of the buffering
    */
  var isBuffering: js.UndefOr[Boolean] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BufferStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    isBuffering: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    `type`: String = null
  ): BufferStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (!js.isUndefined(isBuffering)) __obj.updateDynamic("isBuffering")(isBuffering.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferStartEventArgs]
  }
}


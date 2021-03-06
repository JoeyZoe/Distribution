package typings.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineEditValidationEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the current node element id
    */
  var id: js.UndefOr[js.Any] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the new entered text for the node
    */
  var newText: js.UndefOr[String] = js.undefined
  /** returns the old node text
    */
  var oldText: js.UndefOr[String] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object InlineEditValidationEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    id: js.Any = null,
    model: Model = null,
    newText: String = null,
    oldText: String = null,
    `type`: String = null
  ): InlineEditValidationEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (newText != null) __obj.updateDynamic("newText")(newText.asInstanceOf[js.Any])
    if (oldText != null) __obj.updateDynamic("oldText")(oldText.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineEditValidationEventArgs]
  }
}


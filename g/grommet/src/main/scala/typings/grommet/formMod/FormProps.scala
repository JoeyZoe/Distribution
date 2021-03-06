package typings.grommet.formMod

import typings.grommet.AnonInvalid
import typings.grommet.grommetStrings.blur
import typings.grommet.grommetStrings.submit
import typings.react.mod.ChangeEvent
import typings.react.mod.FormEvent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps extends js.Object {
  var errors: js.UndefOr[js.Object] = js.undefined
  var infos: js.UndefOr[js.Object] = js.undefined
  var messages: js.UndefOr[AnonInvalid] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[Element], Unit]] = js.undefined
  var onReset: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event_], _]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* event */ FormEvent[Element], Unit]] = js.undefined
  var validate: js.UndefOr[blur | submit] = js.undefined
  var value: js.UndefOr[js.Object] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    errors: js.Object = null,
    infos: js.Object = null,
    messages: AnonInvalid = null,
    onChange: /* event */ ChangeEvent[Element] => Unit = null,
    onReset: /* event */ SyntheticEvent[Element, Event_] => _ = null,
    onSubmit: /* event */ FormEvent[Element] => Unit = null,
    validate: blur | submit = null,
    value: js.Object = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (infos != null) __obj.updateDynamic("infos")(infos.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProps]
  }
}


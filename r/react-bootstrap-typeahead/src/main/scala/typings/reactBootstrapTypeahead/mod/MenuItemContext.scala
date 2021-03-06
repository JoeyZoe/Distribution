package typings.reactBootstrapTypeahead.mod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadContext<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.MenuItemContextKeys> */
trait MenuItemContext[T /* <: TypeaheadModel */] extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.undefined
  var isOnlyResult: js.UndefOr[Boolean] = js.undefined
  var onActiveItemChange: js.UndefOr[js.Function1[/* options */ T, Unit]] = js.undefined
  var onInitialItemChange: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.undefined
  var onMenuItemClick: js.UndefOr[js.Function2[/* option */ T, /* e */ Event_, Unit]] = js.undefined
}

object MenuItemContext {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    activeIndex: Int | Double = null,
    isOnlyResult: js.UndefOr[Boolean] = js.undefined,
    onActiveItemChange: /* options */ T => Unit = null,
    onInitialItemChange: /* option */ T => Unit = null,
    onMenuItemClick: (/* option */ T, /* e */ Event_) => Unit = null
  ): MenuItemContext[T] = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(isOnlyResult)) __obj.updateDynamic("isOnlyResult")(isOnlyResult.asInstanceOf[js.Any])
    if (onActiveItemChange != null) __obj.updateDynamic("onActiveItemChange")(js.Any.fromFunction1(onActiveItemChange))
    if (onInitialItemChange != null) __obj.updateDynamic("onInitialItemChange")(js.Any.fromFunction1(onInitialItemChange))
    if (onMenuItemClick != null) __obj.updateDynamic("onMenuItemClick")(js.Any.fromFunction2(onMenuItemClick))
    __obj.asInstanceOf[MenuItemContext[T]]
  }
}


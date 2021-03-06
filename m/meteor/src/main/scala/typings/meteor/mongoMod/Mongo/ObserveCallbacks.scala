package typings.meteor.mongoMod.Mongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveCallbacks[T] extends js.Object {
  var added: js.UndefOr[js.Function1[/* document */ T, Unit]] = js.undefined
  var addedAt: js.UndefOr[
    js.Function3[/* document */ T, /* atIndex */ Double, /* before */ T | Null, Unit]
  ] = js.undefined
  var changed: js.UndefOr[js.Function2[/* newDocument */ T, /* oldDocument */ T, Unit]] = js.undefined
  var changedAt: js.UndefOr[
    js.Function3[/* newDocument */ T, /* oldDocument */ T, /* indexAt */ Double, Unit]
  ] = js.undefined
  var movedTo: js.UndefOr[
    js.Function4[
      /* document */ T, 
      /* fromIndex */ Double, 
      /* toIndex */ Double, 
      /* before */ T | Null, 
      Unit
    ]
  ] = js.undefined
  var removed: js.UndefOr[js.Function1[/* oldDocument */ T, Unit]] = js.undefined
  var removedAt: js.UndefOr[js.Function2[/* oldDocument */ T, /* atIndex */ Double, Unit]] = js.undefined
}

object ObserveCallbacks {
  @scala.inline
  def apply[T](
    added: /* document */ T => Unit = null,
    addedAt: (/* document */ T, /* atIndex */ Double, /* before */ T | Null) => Unit = null,
    changed: (/* newDocument */ T, /* oldDocument */ T) => Unit = null,
    changedAt: (/* newDocument */ T, /* oldDocument */ T, /* indexAt */ Double) => Unit = null,
    movedTo: (/* document */ T, /* fromIndex */ Double, /* toIndex */ Double, /* before */ T | Null) => Unit = null,
    removed: /* oldDocument */ T => Unit = null,
    removedAt: (/* oldDocument */ T, /* atIndex */ Double) => Unit = null
  ): ObserveCallbacks[T] = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(js.Any.fromFunction1(added))
    if (addedAt != null) __obj.updateDynamic("addedAt")(js.Any.fromFunction3(addedAt))
    if (changed != null) __obj.updateDynamic("changed")(js.Any.fromFunction2(changed))
    if (changedAt != null) __obj.updateDynamic("changedAt")(js.Any.fromFunction3(changedAt))
    if (movedTo != null) __obj.updateDynamic("movedTo")(js.Any.fromFunction4(movedTo))
    if (removed != null) __obj.updateDynamic("removed")(js.Any.fromFunction1(removed))
    if (removedAt != null) __obj.updateDynamic("removedAt")(js.Any.fromFunction2(removedAt))
    __obj.asInstanceOf[ObserveCallbacks[T]]
  }
}


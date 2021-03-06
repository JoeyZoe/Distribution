package typings.baseui

import typings.dateFns.AnonDateTime
import typings.dateFns.AnonDay
import typings.dateFns.AnonFirstWeekContainsDateWeekStartsOn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<date-fns.Locale> */
trait PartialLocale extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var formatDistance: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var formatLong: js.UndefOr[AnonDateTime] = js.undefined
  var formatRelative: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var localize: js.UndefOr[AnonDay] = js.undefined
  var `match`: js.UndefOr[AnonDay] = js.undefined
  var options: js.UndefOr[AnonFirstWeekContainsDateWeekStartsOn] = js.undefined
}

object PartialLocale {
  @scala.inline
  def apply(
    code: String = null,
    formatDistance: /* repeated */ js.Any => _ = null,
    formatLong: AnonDateTime = null,
    formatRelative: /* repeated */ js.Any => _ = null,
    localize: AnonDay = null,
    `match`: AnonDay = null,
    options: AnonFirstWeekContainsDateWeekStartsOn = null
  ): PartialLocale = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (formatDistance != null) __obj.updateDynamic("formatDistance")(js.Any.fromFunction1(formatDistance))
    if (formatLong != null) __obj.updateDynamic("formatLong")(formatLong.asInstanceOf[js.Any])
    if (formatRelative != null) __obj.updateDynamic("formatRelative")(js.Any.fromFunction1(formatRelative))
    if (localize != null) __obj.updateDynamic("localize")(localize.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLocale]
  }
}


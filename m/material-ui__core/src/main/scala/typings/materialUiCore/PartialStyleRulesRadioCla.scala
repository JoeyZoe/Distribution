package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Radio.RadioClassKey>> */
@js.native
trait PartialStyleRulesRadioCla extends js.Object {
  var checked: js.UndefOr[CSSProperties] = js.native
  var colorPrimary: js.UndefOr[CSSProperties] = js.native
  var colorSecondary: js.UndefOr[CSSProperties] = js.native
  var disabled: js.UndefOr[CSSProperties] = js.native
  var input: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesRadioCla {
  @scala.inline
  def apply(
    checked: CSSProperties = null,
    colorPrimary: CSSProperties = null,
    colorSecondary: CSSProperties = null,
    disabled: CSSProperties = null,
    input: CSSProperties = null,
    root: CSSProperties = null
  ): PartialStyleRulesRadioCla = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (colorPrimary != null) __obj.updateDynamic("colorPrimary")(colorPrimary.asInstanceOf[js.Any])
    if (colorSecondary != null) __obj.updateDynamic("colorSecondary")(colorSecondary.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesRadioCla]
  }
}


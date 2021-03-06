package typings.materialUiCore

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Tabs.TabsClassKey>> */
@js.native
trait PartialStyleRulesTabsClas extends js.Object {
  var centered: js.UndefOr[CSSProperties] = js.native
  var fixed: js.UndefOr[CSSProperties] = js.native
  var flexContainer: js.UndefOr[CSSProperties] = js.native
  var indicator: js.UndefOr[CSSProperties] = js.native
  var root: js.UndefOr[CSSProperties] = js.native
  var scrollButtons: js.UndefOr[CSSProperties] = js.native
  var scrollButtonsAuto: js.UndefOr[CSSProperties] = js.native
  var scrollable: js.UndefOr[CSSProperties] = js.native
  var scroller: js.UndefOr[CSSProperties] = js.native
}

object PartialStyleRulesTabsClas {
  @scala.inline
  def apply(
    centered: CSSProperties = null,
    fixed: CSSProperties = null,
    flexContainer: CSSProperties = null,
    indicator: CSSProperties = null,
    root: CSSProperties = null,
    scrollButtons: CSSProperties = null,
    scrollButtonsAuto: CSSProperties = null,
    scrollable: CSSProperties = null,
    scroller: CSSProperties = null
  ): PartialStyleRulesTabsClas = {
    val __obj = js.Dynamic.literal()
    if (centered != null) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (flexContainer != null) __obj.updateDynamic("flexContainer")(flexContainer.asInstanceOf[js.Any])
    if (indicator != null) __obj.updateDynamic("indicator")(indicator.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (scrollButtons != null) __obj.updateDynamic("scrollButtons")(scrollButtons.asInstanceOf[js.Any])
    if (scrollButtonsAuto != null) __obj.updateDynamic("scrollButtonsAuto")(scrollButtonsAuto.asInstanceOf[js.Any])
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (scroller != null) __obj.updateDynamic("scroller")(scroller.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStyleRulesTabsClas]
  }
}


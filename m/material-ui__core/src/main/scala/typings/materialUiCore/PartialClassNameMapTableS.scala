package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/TableSortLabel/TableSortLabel.TableSortLabelClassKey>> */
@js.native
trait PartialClassNameMapTableS extends js.Object {
  var active: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var iconDirectionAsc: js.UndefOr[String] = js.native
  var iconDirectionDesc: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapTableS {
  @scala.inline
  def apply(
    active: String = null,
    icon: String = null,
    iconDirectionAsc: String = null,
    iconDirectionDesc: String = null,
    root: String = null
  ): PartialClassNameMapTableS = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconDirectionAsc != null) __obj.updateDynamic("iconDirectionAsc")(iconDirectionAsc.asInstanceOf[js.Any])
    if (iconDirectionDesc != null) __obj.updateDynamic("iconDirectionDesc")(iconDirectionDesc.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapTableS]
  }
}


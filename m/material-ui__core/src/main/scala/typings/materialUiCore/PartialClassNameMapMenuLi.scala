package typings.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/MenuList/MenuList.MenuListClassKey>> */
@js.native
trait PartialClassNameMapMenuLi extends js.Object {
  var dense: js.UndefOr[String] = js.native
  var padding: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var subheader: js.UndefOr[String] = js.native
}

object PartialClassNameMapMenuLi {
  @scala.inline
  def apply(dense: String = null, padding: String = null, root: String = null, subheader: String = null): PartialClassNameMapMenuLi = {
    val __obj = js.Dynamic.literal()
    if (dense != null) __obj.updateDynamic("dense")(dense.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (subheader != null) __obj.updateDynamic("subheader")(subheader.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClassNameMapMenuLi]
  }
}


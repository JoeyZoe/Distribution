package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeListRowObject extends js.Object {
  /** @name dxTreeListRowObject.isEditing */
  var isEditing: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeListRowObject.isExpanded */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeListRowObject.isNewRow */
  var isNewRow: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeListRowObject.isSelected */
  var isSelected: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeListRowObject.key */
  var key: js.UndefOr[js.Any] = js.undefined
  /** @name dxTreeListRowObject.level */
  var level: js.UndefOr[Double] = js.undefined
  /** @name dxTreeListRowObject.node */
  var node: js.UndefOr[dxTreeListNode] = js.undefined
  /** @name dxTreeListRowObject.rowIndex */
  var rowIndex: js.UndefOr[Double] = js.undefined
  /** @name dxTreeListRowObject.rowType */
  var rowType: js.UndefOr[String] = js.undefined
  /** @name dxTreeListRowObject.values */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object dxTreeListRowObject {
  @scala.inline
  def apply(
    isEditing: js.UndefOr[Boolean] = js.undefined,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    isNewRow: js.UndefOr[Boolean] = js.undefined,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    key: js.Any = null,
    level: Int | Double = null,
    node: dxTreeListNode = null,
    rowIndex: Int | Double = null,
    rowType: String = null,
    values: js.Array[_] = null
  ): dxTreeListRowObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewRow)) __obj.updateDynamic("isNewRow")(isNewRow.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowType != null) __obj.updateDynamic("rowType")(rowType.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListRowObject]
  }
}


package typings.sequelizeCursorPagination.mod.SequelizeCursorPagination

import typings.sequelize.AnonExclude
import typings.sequelize.mod.FindOptionsAttributesArray
import typings.sequelize.mod.IncludeOptions
import typings.sequelize.mod.Model
import typings.sequelize.mod.WhereOptions
import typings.sequelize.mod.and
import typings.sequelize.mod.col
import typings.sequelize.mod.fn
import typings.sequelize.mod.or
import typings.sequelize.mod.where
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginateInstOptions[T] extends BasicPaginateOptions[T] {
  var raw: js.UndefOr[Boolean] = js.undefined
}

object PaginateInstOptions {
  @scala.inline
  def apply[T](
    after: String = null,
    attributes: FindOptionsAttributesArray | AnonExclude = null,
    before: String = null,
    desc: js.UndefOr[Boolean] = js.undefined,
    include: js.Array[(Model[_, _, _]) | IncludeOptions] = null,
    limit: Int | Double = null,
    paginationField: String = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    subQuery: js.UndefOr[Boolean] = js.undefined,
    where: WhereOptions[T] | where | fn | (js.Array[col | and | or | String]) = null
  ): PaginateInstOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (!js.isUndefined(desc)) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (paginationField != null) __obj.updateDynamic("paginationField")(paginationField.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (!js.isUndefined(subQuery)) __obj.updateDynamic("subQuery")(subQuery.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateInstOptions[T]]
  }
}


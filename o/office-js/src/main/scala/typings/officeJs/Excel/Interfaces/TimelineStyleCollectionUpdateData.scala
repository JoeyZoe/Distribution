package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TimelineStyleCollection object, for use in `timelineStyleCollection.set({ ... })`. */
trait TimelineStyleCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[TimelineStyleData]] = js.undefined
}

object TimelineStyleCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[TimelineStyleData] = null): TimelineStyleCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineStyleCollectionUpdateData]
  }
}


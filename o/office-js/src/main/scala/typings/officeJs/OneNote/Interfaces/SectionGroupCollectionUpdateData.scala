package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the SectionGroupCollection object, for use in "sectionGroupCollection.set({ ... })". */
trait SectionGroupCollectionUpdateData extends js.Object {
  var items: js.UndefOr[js.Array[SectionGroupData]] = js.undefined
}

object SectionGroupCollectionUpdateData {
  @scala.inline
  def apply(items: js.Array[SectionGroupData] = null): SectionGroupCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionGroupCollectionUpdateData]
  }
}


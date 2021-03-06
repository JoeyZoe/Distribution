package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferOptions extends js.Object {
  var autoPrint: js.UndefOr[Boolean] = js.undefined
  var bufferPages: js.UndefOr[Boolean] = js.undefined
  var fontLayoutCache: js.UndefOr[Boolean] = js.undefined
  var progressCallback: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.undefined
  var tableLayouts: js.UndefOr[TableLayout] = js.undefined
}

object BufferOptions {
  @scala.inline
  def apply(
    autoPrint: js.UndefOr[Boolean] = js.undefined,
    bufferPages: js.UndefOr[Boolean] = js.undefined,
    fontLayoutCache: js.UndefOr[Boolean] = js.undefined,
    progressCallback: /* progress */ Double => Unit = null,
    tableLayouts: TableLayout = null
  ): BufferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPrint)) __obj.updateDynamic("autoPrint")(autoPrint.asInstanceOf[js.Any])
    if (!js.isUndefined(bufferPages)) __obj.updateDynamic("bufferPages")(bufferPages.asInstanceOf[js.Any])
    if (!js.isUndefined(fontLayoutCache)) __obj.updateDynamic("fontLayoutCache")(fontLayoutCache.asInstanceOf[js.Any])
    if (progressCallback != null) __obj.updateDynamic("progressCallback")(js.Any.fromFunction1(progressCallback))
    if (tableLayouts != null) __obj.updateDynamic("tableLayouts")(tableLayouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferOptions]
  }
}


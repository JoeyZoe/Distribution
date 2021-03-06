package typings.reactMapGl.mod

import typings.mapboxGl.mod.AnyLayout
import typings.mapboxGl.mod.BackgroundPaint
import typings.mapboxGl.mod.CirclePaint
import typings.mapboxGl.mod.FillExtrusionPaint
import typings.mapboxGl.mod.FillPaint
import typings.mapboxGl.mod.HeatmapPaint
import typings.mapboxGl.mod.HillshadePaint
import typings.mapboxGl.mod.LinePaint
import typings.mapboxGl.mod.RasterPaint
import typings.mapboxGl.mod.SymbolPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerProps extends js.Object {
  var beforeId: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[js.Array[_]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[AnyLayout] = js.undefined
  var maxzoom: js.UndefOr[Double] = js.undefined
  var minzoom: js.UndefOr[Double] = js.undefined
  var paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint
  var source: js.UndefOr[String] = js.undefined
  var `type`: String
}

object LayerProps {
  @scala.inline
  def apply(
    paint: BackgroundPaint | FillPaint | FillExtrusionPaint | LinePaint | SymbolPaint | RasterPaint | CirclePaint | HeatmapPaint | HillshadePaint,
    `type`: String,
    beforeId: String = null,
    filter: js.Array[_] = null,
    id: String = null,
    layout: AnyLayout = null,
    maxzoom: Int | Double = null,
    minzoom: Int | Double = null,
    source: String = null
  ): LayerProps = {
    val __obj = js.Dynamic.literal(paint = paint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (beforeId != null) __obj.updateDynamic("beforeId")(beforeId.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerProps]
  }
}


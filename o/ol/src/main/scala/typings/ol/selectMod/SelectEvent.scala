package typings.ol.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Select", "SelectEvent")
@js.native
class SelectEvent protected ()
  extends typings.ol.eventMod.default {
  def this(
    `type`: SelectEventType,
    selected: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
    deselected: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]],
    mapBrowserEvent: typings.ol.mapBrowserEventMod.default
  ) = this()
  var deselected: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
  var mapBrowserEvent: typings.ol.mapBrowserEventMod.default = js.native
  var selected: js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
}


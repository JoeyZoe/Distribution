package typings.leaflet.mod

import typings.geojson.mod.GeoJsonObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "geoJSON")
@js.native
object geoJSON extends js.Object {
  def apply[P](): GeoJSON_[P] = js.native
  def apply[P](geojson: GeoJsonObject): GeoJSON_[P] = js.native
  def apply[P](geojson: GeoJsonObject, options: GeoJSONOptions[P]): GeoJSON_[P] = js.native
}


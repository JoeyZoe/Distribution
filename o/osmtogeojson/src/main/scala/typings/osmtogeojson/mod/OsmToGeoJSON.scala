package typings.osmtogeojson.mod

import typings.osmtogeojson.mod.GeoJSON.GeoJSONObject
import typings.osmtogeojson.mod.OsmJSON.OsmJSONObject
import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OsmToGeoJSON extends js.Object {
  def apply(data: OsmJSONObject): GeoJSONObject = js.native
  def apply(data: OsmJSONObject, options: Options): GeoJSONObject = js.native
  def apply(data: Document_): GeoJSONObject = js.native
  def apply(data: Document_, options: Options): GeoJSONObject = js.native
  def toGeojson(data: OsmJSONObject): GeoJSONObject = js.native
  def toGeojson(data: OsmJSONObject, options: Options): GeoJSONObject = js.native
  def toGeojson(data: Document_): GeoJSONObject = js.native
  def toGeojson(data: Document_, options: Options): GeoJSONObject = js.native
}


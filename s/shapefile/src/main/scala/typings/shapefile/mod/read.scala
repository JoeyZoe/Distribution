package typings.shapefile.mod

import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shapefile", "read")
@js.native
object read extends js.Object {
  def apply(shp: Openable): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = js.native
  def apply(shp: Openable, dbf: Openable): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = js.native
  def apply(shp: Openable, dbf: Openable, options: Options): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = js.native
}


package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import typings.leaflet.leafletMod.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Routing.Control")
@js.native
class Control () extends Itinerary {
  def this(options: RoutingControlOptions) = this()
  def getPlan(): Plan = js.native
  def getRouter(): IRouter = js.native
  def getWaypoints(): js.Array[Waypoint] = js.native
  def on(`type`: String, fn: js.Function1[/* event */ js.Any, Unit]): this.type = js.native
  def on(`type`: String, fn: js.Function1[/* event */ js.Any, Unit], context: js.Any): this.type = js.native
  def route(): Unit = js.native
  def setWaypoints(waypoints: js.Array[LatLng | Waypoint]): this.type = js.native
  def spliceWaypoints(index: Double, waypointsToRemove: Double, wayPoints: Waypoint*): js.Array[Waypoint] = js.native
}

@JSImport("leaflet", "Routing.control")
@js.native
object control extends js.Object {
  def apply(): Control = js.native
  def apply(options: RoutingControlOptions): Control = js.native
}


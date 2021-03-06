package typings.yandexMaps.mod.behavior

import typings.yandexMaps.mod.IBehavior
import typings.yandexMaps.mod.IControlParent
import typings.yandexMaps.mod.IEventManager
import typings.yandexMaps.mod.router.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "behavior.RouteEditor")
@js.native
class RouteEditor () extends IBehavior {
  /* CompleteClass */
  override var events: IEventManager = js.native
  def getRoute(): Route = js.native
  def getState(): String = js.native
  def setParent(parent: IControlParent): this.type = js.native
  def setState(): Unit = js.native
  def setState(state: String): Unit = js.native
}


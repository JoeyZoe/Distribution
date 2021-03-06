package typings.meteorDashTypings.Blaze

import org.scalablytyped.runtime.TopLevel
import typings.meteorDashTypings.Meteor.SubscriptionHandle
import typings.meteorDashTypings.Tracker.Computation
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateInstance extends js.Object {
  var data: js.Object
  var firstNode: js.Object
  var lastNode: js.Object
  var view: js.Object
  @JSName("$")
  def $(selector: String): js.Any
  def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation
  def find(selector: String): HTMLElement
  def findAll(selector: String): js.Array[HTMLElement]
  def subscribe(name: String, args: js.Any*): SubscriptionHandle
  def subscriptionsReady(): Boolean
}

@JSGlobal("Blaze.TemplateInstance")
@js.native
object TemplateInstance extends TopLevel[TemplateInstanceStatic]


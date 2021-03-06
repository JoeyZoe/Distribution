package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Must be implemented by dispatch objects which want to get notifications about control events.
  * @since OOo 2.0.3
  */
trait XControlNotificationListener extends XInterface {
  /**
    * notifies that a control event has happened
    * @param Event contains the event information
    */
  def controlEvent(Event: ControlEvent): Unit
}

object XControlNotificationListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    controlEvent: ControlEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XControlNotificationListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), controlEvent = js.Any.fromFunction1(controlEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XControlNotificationListener]
  }
}


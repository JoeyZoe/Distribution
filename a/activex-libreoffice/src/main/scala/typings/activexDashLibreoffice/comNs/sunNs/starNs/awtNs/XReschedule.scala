package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link XReschedule} interface can be used to give control to the main thread to allow events processing.
  * @deprecated DeprecatedThis interface was only implemented in an intermediate developer release anyway.
  * @since OOo 2.0
  */
trait XReschedule extends XInterface {
  /** Allow the main thread to process some events. */
  def reschedule(): Unit
}

object XReschedule {
  @scala.inline
  def apply(acquire: () => Unit, queryInterface: `type` => js.Any, release: () => Unit, reschedule: () => Unit): XReschedule = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reschedule = js.Any.fromFunction0(reschedule))
  
    __obj.asInstanceOf[XReschedule]
  }
}


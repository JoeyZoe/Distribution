package typings.activexDashLibreoffice.comNs.sunNs.starNs.inspectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements a component which can default-fill the help section of an {@link ObjectInspector} .
  *
  * The component registers a {@link XPropertyControlObserver} at an XObjectInspectoryUI interface. Whenever it then is notified of a {@link
  * XPropertyControl} getting the focus, it will try to deduce the extended help text of this control's window, and set this help text at the object
  * inspector's help section.
  */
trait DefaultHelpProvider extends XInterface {
  /**
    * creates a help provider instance
    * @param InspectorUI provides access to the UI of the {@link ObjectInspector} which should be observed. Must not be `NULL` .
    * @throws com::sun::star::lang::IllegalArgumentException if the given inspector UI is `NULL` .
    */
  def create(InspectorUI: XObjectInspectorUI): Unit
}

object DefaultHelpProvider {
  @scala.inline
  def apply(
    acquire: () => Unit,
    create: XObjectInspectorUI => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): DefaultHelpProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction1(create), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[DefaultHelpProvider]
  }
}


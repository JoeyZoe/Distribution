package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XFastPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XMultiPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XController
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XFrame
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a controller which can be used to browse and modify properties of form controls.
  *
  * The controller can be plugged into an {@link com.sun.star.frame.XFrame} , and will provide a visual component for inspecting control properties. This
  * means it allows to interactively control several aspects of a {@link FormControlModel} or {@link DataAwareControlModel} , such as it's data binding,
  * it's layout, and it's event binding
  *
  * For using a {@link PropertyBrowserController} , you need to instantiate it at a service factory of your choiceattach it to an empty frame of your
  * choiceset the IntrospectedObject property to the control model which you wish to analyze
  *
  * {{program example here, see documentation}}
  * @deprecated Deprecated  Note that nowadays, this service is only a legacy wrapper using the {@link com.sun.star.inspection.ObjectInspector} and the {@link co
  * @see com.sun.star.frame.XController
  */
trait PropertyBrowserController
  extends XController
     with XPropertySet
     with XFastPropertySet
     with XMultiPropertySet {
  /**
    * controls the actually visible page.
    *
    * The aspects of a {@link DataAwareControlModel} which can be browsed and modified using this controller can be separated into 3 groups: common aspects,
    * data-awareness related aspects, and bound events. ;  The appearance of the visual component created by the controller is that 3 tab pages, one for
    * each group, are displayed (of course if the control does not support any aspects of a given group, the group is omitted). ;  With this property, it
    * can be controller which page is currently active.
    *
    * Valid values are (this list may be extended in the future): GenericDataEvents
    */
  var CurrentPage: String
  /**
    * contains the object to inspect.
    *
    * Changing this property from outside causes the controller to update its view with the data of the new object
    */
  var IntrospectedObject: XPropertySet
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override val PropertySetInfo: XPropertySetInfo
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo
}

object PropertyBrowserController {
  @scala.inline
  def apply(
    CurrentPage: String,
    Frame: XFrame,
    IntrospectedObject: XPropertySet,
    Model: XModel,
    PropertySetInfo: XPropertySetInfo,
    ViewData: js.Any,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attachFrame: XFrame => Unit,
    attachModel: XModel => Boolean,
    dispose: () => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getFastPropertyValue: Double => js.Any,
    getFrame: () => XFrame,
    getModel: () => XModel,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[_],
    getViewData: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    restoreViewData: js.Any => Unit,
    setFastPropertyValue: (Double, js.Any) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[_]) => Unit,
    suspend: Boolean => Boolean
  ): PropertyBrowserController = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage, Frame = Frame, IntrospectedObject = IntrospectedObject, Model = Model, PropertySetInfo = PropertySetInfo, ViewData = ViewData, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getViewData = js.Any.fromFunction0(getViewData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), restoreViewData = js.Any.fromFunction1(restoreViewData), setFastPropertyValue = js.Any.fromFunction2(setFastPropertyValue), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[PropertyBrowserController]
  }
}


package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a "deep" filter detection
  *
  * A "deep" filter detection means looking into the document stream to detect the format of it. Services of type {@link ExtendedTypeDetection} must
  * support this interface to be called from generic load mechanism of the office for that.
  * @see DetectService
  * @see TypeDetection
  * @see FilterFactory
  */
trait XExtendedFilterDetection extends XInterface {
  /**
    * controls agreement of a "flat" {@link TypeDetection} with given URL or arguments
    *
    * Registered services in configuration, which support this interface for different mime types, will be called automatically to look into the document
    * stream and decide which format it represent. Add the collected information about detected documents in given {@link MediaDescriptor}**Descriptor** .
    * The decision must be returned as any valid type name (which specifies the detected format) or an empty value for unknown formats.
    * @param Descriptor represent a {@link MediaDescriptor} which can be used to get/set information about the detected document
    * @returns an internal type name if format was detected successfully ;  or an empty value for an unknown document format.
    */
  def detect(Descriptor: js.Array[SeqEquiv[PropertyValue]]): String
}

object XExtendedFilterDetection {
  @scala.inline
  def apply(
    acquire: () => Unit,
    detect: js.Array[SeqEquiv[PropertyValue]] => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XExtendedFilterDetection = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), detect = js.Any.fromFunction1(detect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XExtendedFilterDetection]
  }
}


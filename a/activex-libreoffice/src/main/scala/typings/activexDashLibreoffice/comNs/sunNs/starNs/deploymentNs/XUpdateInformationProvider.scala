package typings.activexDashLibreoffice.comNs.sunNs.starNs.deploymentNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs.XInteractionHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.XElement
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects implementing this interface provide access to the xml root of one or more update information files for a given set of URLs.
  * @since OOo 2.2
  */
trait XUpdateInformationProvider extends js.Object {
  /** interrupts a getUpdateInformation call and let's it return immediately. */
  def cancel(): Unit
  /**
    * get update information for a specific extension or all available information from a repository.
    * @param repositories a repository and its mirrors.
    * @param extensionId the unique identifier of an extension. If it is not empty and the update document is an atom feed, only items whose "term" attribute
    */
  def getUpdateInformation(repositories: SeqEquiv[String], extensionId: String): SafeArray[XElement]
  /**
    * get update information for a specific extension or all available information from a repository.
    * @param repositories a repository and its mirrors.
    * @param extensionId the unique identifier of an extension. If it is not empty and the update document is an atom feed, only items whose "term" attribute
    * @returns an enumeration of {@link UpdateInformationEntry} .
    */
  def getUpdateInformationEnumeration(repositories: SeqEquiv[String], extensionId: String): XEnumeration
  /**
    * Sets an interaction handler to be used for further operations.
    *
    * A default interaction handler is available as service {@link com.sun.star.task.InteractionHandler} . The documentation of this service also contains
    * further information about the interaction handler concept.
    * @param handler The interaction handler to be set
    * @see com.sun.star.task.InteractionHandler
    */
  def setInteractionHandler(handler: XInteractionHandler): Unit
}

object XUpdateInformationProvider {
  @scala.inline
  def apply(
    cancel: () => Unit,
    getUpdateInformation: (SeqEquiv[String], String) => SafeArray[XElement],
    getUpdateInformationEnumeration: (SeqEquiv[String], String) => XEnumeration,
    setInteractionHandler: XInteractionHandler => Unit
  ): XUpdateInformationProvider = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), getUpdateInformation = js.Any.fromFunction2(getUpdateInformation), getUpdateInformationEnumeration = js.Any.fromFunction2(getUpdateInformationEnumeration), setInteractionHandler = js.Any.fromFunction1(setInteractionHandler))
  
    __obj.asInstanceOf[XUpdateInformationProvider]
  }
}


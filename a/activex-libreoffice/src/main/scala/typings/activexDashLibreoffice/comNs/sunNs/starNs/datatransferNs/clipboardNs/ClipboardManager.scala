package typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.clipboardNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The clipboard manager is a one-instance service that holds a list of all known clipboard instances.
  * @see XClipboardManager
  */
trait ClipboardManager
  extends XClipboardManager
     with XComponent

object ClipboardManager {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addClipboard: XClipboard => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getClipboard: String => XClipboard,
    listClipboardNames: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeClipboard: String => Unit,
    removeEventListener: XEventListener => Unit
  ): ClipboardManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addClipboard = js.Any.fromFunction1(addClipboard), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getClipboard = js.Any.fromFunction1(getClipboard), listClipboardNames = js.Any.fromFunction0(listClipboardNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeClipboard = js.Any.fromFunction1(removeClipboard), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[ClipboardManager]
  }
}


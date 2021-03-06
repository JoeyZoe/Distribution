package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.XTransferable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provide access to a {@link com.sun.star.datatransfer.XTransferable} implementation from the object. */
trait XTransferableSupplier extends XInterface {
  /**
    * allows to get access to {@link com.sun.star.datatransfer.XTransferable} implementation.
    * @returns {@link com.sun.star.datatransfer.XTransferable} implementation
    */
  val Transferable: XTransferable
  /**
    * allows to get access to {@link com.sun.star.datatransfer.XTransferable} implementation.
    * @returns {@link com.sun.star.datatransfer.XTransferable} implementation
    */
  def getTransferable(): XTransferable
}

object XTransferableSupplier {
  @scala.inline
  def apply(
    Transferable: XTransferable,
    acquire: () => Unit,
    getTransferable: () => XTransferable,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTransferableSupplier = {
    val __obj = js.Dynamic.literal(Transferable = Transferable, acquire = js.Any.fromFunction0(acquire), getTransferable = js.Any.fromFunction0(getTransferable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTransferableSupplier]
  }
}


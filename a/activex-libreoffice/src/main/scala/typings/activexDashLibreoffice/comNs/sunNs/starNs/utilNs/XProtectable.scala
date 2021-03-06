package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to protect objects from modifications. */
trait XProtectable extends XInterface {
  /** @returns the current state of protection. */
  def isProtected(): Boolean
  /**
    * activates the protection.
    * @param aPassword a string to specify new password.
    */
  def protect(aPassword: String): Unit
  /**
    * removes the protection.
    * @param aPassword a string to match with the current password.
    * @throws com::sun::star::lang::IllegalArgumentException if invalid password is specified.
    */
  def unprotect(aPassword: String): Unit
}

object XProtectable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    isProtected: () => Boolean,
    protect: String => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    unprotect: String => Unit
  ): XProtectable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isProtected = js.Any.fromFunction0(isProtected), protect = js.Any.fromFunction1(protect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unprotect = js.Any.fromFunction1(unprotect))
  
    __obj.asInstanceOf[XProtectable]
  }
}


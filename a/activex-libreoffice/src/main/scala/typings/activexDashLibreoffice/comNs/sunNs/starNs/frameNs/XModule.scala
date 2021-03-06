package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * can be used to overrule identification of office modules.
  *
  * Normally an office module will be identified by its service name in combination with a set of configuration data. But sometimes whole existing office
  * modules will be used as black box components to implement a different office module on top of it. Patching a service name is not possible. So this
  * optional interface can be used to overwrite identification of a module.
  * @see XModuleManager
  * @since OOo 2.3
  */
trait XModule extends XInterface {
  /** @returns the module identifier. */
  var Identifier: String
  /** @returns the module identifier. */
  def getIdentifier(): String
  /** @param Identifier a new "name" for this module. */
  def setIdentifier(Identifier: String): Unit
}

object XModule {
  @scala.inline
  def apply(
    Identifier: String,
    acquire: () => Unit,
    getIdentifier: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setIdentifier: String => Unit
  ): XModule = {
    val __obj = js.Dynamic.literal(Identifier = Identifier, acquire = js.Any.fromFunction0(acquire), getIdentifier = js.Any.fromFunction0(getIdentifier), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setIdentifier = js.Any.fromFunction1(setIdentifier))
  
    __obj.asInstanceOf[XModule]
  }
}


package typings.samchon.mod.protocol

import typings.std.Uint8Array
import typings.sxml.mod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon", "protocol.Invoke")
@js.native
/**
  * Default Constructor.
  */
class Invoke ()
  extends typings.samchon.protocolMod.Invoke {
  /**
    * Copy Constructor.
    *
    * @param invoke
    */
  def this(invoke: typings.samchon.invokeMod.Invoke) = this()
  def this(listener: String) = this()
  /**
    * Construct from listener and parametric values.
    *
    * @param listener
    * @param parameters
    */
  def this(listener: String, parameters: (Boolean | Double | String | XML | Uint8Array)*) = this()
}


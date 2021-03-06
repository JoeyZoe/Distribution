package typings.openpgp.mod

import typings.openpgp.AnonErr
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "wkd")
@js.native
object wkd extends js.Object {
  @js.native
  /**
    * Initialize the WKD client
    */
  class WKD () extends js.Object {
    /**
      * Search for a public key using Web Key Directory protocol.
      * @param options.email User's email.
      * @param options.rawBytes Returns Uint8Array instead of parsed key.
      * @returns The public key.
      */
    def lookup(): js.Promise[Uint8Array | AnonErr] = js.native
  }
  
}


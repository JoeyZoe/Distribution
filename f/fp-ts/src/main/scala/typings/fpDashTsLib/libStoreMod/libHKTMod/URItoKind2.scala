package typings
package fpDashTsLib.libStoreMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind2[L, A] extends js.Object {
  var Store: fpDashTsLib.libStoreMod.Store[L, A]
}

object URItoKind2 {
  @scala.inline
  def apply[L, A](Store: fpDashTsLib.libStoreMod.Store[L, A]): URItoKind2[L, A] = {
    val __obj = js.Dynamic.literal(Store = Store)
  
    __obj.asInstanceOf[URItoKind2[L, A]]
  }
}


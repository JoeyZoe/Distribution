package typings.otplibCore.utilsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Strategy extends js.Object

@JSImport("@otplib/core/utils", "Strategy")
@js.native
object Strategy extends js.Object {
  @js.native
  sealed trait HOTP extends Strategy
  
  @js.native
  sealed trait TOTP extends Strategy
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Strategy with String] = js.native
  /* "hotp" */ @js.native
  object HOTP extends TopLevel[HOTP with String]
  
  /* "totp" */ @js.native
  object TOTP extends TopLevel[TOTP with String]
  
}


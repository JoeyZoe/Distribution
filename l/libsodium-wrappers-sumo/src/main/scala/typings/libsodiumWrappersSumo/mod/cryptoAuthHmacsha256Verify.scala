package typings.libsodiumWrappersSumo.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256_verify")
@js.native
object cryptoAuthHmacsha256Verify extends js.Object {
  def apply(tag: Uint8Array, message: String, key: Uint8Array): Boolean = js.native
  def apply(tag: Uint8Array, message: Uint8Array, key: Uint8Array): Boolean = js.native
}


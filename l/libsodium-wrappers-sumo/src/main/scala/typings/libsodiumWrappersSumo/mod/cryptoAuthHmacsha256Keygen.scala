package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_auth_hmacsha256_keygen")
@js.native
object cryptoAuthHmacsha256Keygen extends js.Object {
  def apply(): Uint8Array = js.native
  def apply(outputFormat: StringOutputFormat): String = js.native
  def apply(outputFormat: Uint8ArrayOutputFormat): Uint8Array = js.native
}


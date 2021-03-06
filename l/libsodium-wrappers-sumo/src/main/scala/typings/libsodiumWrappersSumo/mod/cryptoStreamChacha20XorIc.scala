package typings.libsodiumWrappersSumo.mod

import typings.libsodiumWrappers.mod.StringOutputFormat
import typings.libsodiumWrappers.mod.Uint8ArrayOutputFormat
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libsodium-wrappers-sumo", "crypto_stream_chacha20_xor_ic")
@js.native
object cryptoStreamChacha20XorIc extends js.Object {
  def apply(input_message: String, nonce: Uint8Array, nonce_increment: Double, key: Uint8Array): Uint8Array = js.native
  def apply(
    input_message: String,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    input_message: String,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
  def apply(input_message: Uint8Array, nonce: Uint8Array, nonce_increment: Double, key: Uint8Array): Uint8Array = js.native
  def apply(
    input_message: Uint8Array,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: StringOutputFormat
  ): String = js.native
  def apply(
    input_message: Uint8Array,
    nonce: Uint8Array,
    nonce_increment: Double,
    key: Uint8Array,
    outputFormat: Uint8ArrayOutputFormat
  ): Uint8Array = js.native
}


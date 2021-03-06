package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.IRole
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.Role")
@js.native
/**
  * Constructs a new Role.
  * @param [properties] Properties to set
  */
class Role ()
  extends typings.sawtoothSdk.protobufMod.Role {
  def this(properties: IRole) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.Role")
@js.native
object Role extends js.Object {
  /**
    * Creates a new Role instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Role instance
    */
  def create(): typings.sawtoothSdk.protobufMod.Role = js.native
  def create(properties: IRole): typings.sawtoothSdk.protobufMod.Role = js.native
  /**
    * Decodes a Role message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Role
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.Role = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.Role = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Role = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.Role = js.native
  /**
    * Decodes a Role message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Role
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.Role = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.Role = js.native
  /**
    * Encodes the specified Role message. Does not implicitly {@link Role.verify|verify} messages.
    * @param message Role message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRole): Writer = js.native
  def encode(message: IRole, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Role message, length delimited. Does not implicitly {@link Role.verify|verify} messages.
    * @param message Role message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRole): Writer = js.native
  def encodeDelimited(message: IRole, writer: Writer): Writer = js.native
  /**
    * Creates a Role message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Role
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.Role = js.native
  /**
    * Creates a plain object from a Role message. Also converts values to other types if specified.
    * @param message Role
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.Role): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.Role, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Role message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}


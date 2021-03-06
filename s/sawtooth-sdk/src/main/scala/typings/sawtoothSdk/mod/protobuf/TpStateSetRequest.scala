package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITpStateSetRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest")
@js.native
/**
  * Constructs a new TpStateSetRequest.
  * @param [properties] Properties to set
  */
class TpStateSetRequest ()
  extends typings.sawtoothSdk.protobufMod.TpStateSetRequest {
  def this(properties: ITpStateSetRequest) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.TpStateSetRequest")
@js.native
object TpStateSetRequest extends js.Object {
  /**
    * Creates a new TpStateSetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateSetRequest instance
    */
  def create(): typings.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  def create(properties: ITpStateSetRequest): typings.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  /**
    * Decodes a TpStateSetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateSetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  /**
    * Decodes a TpStateSetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateSetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  /**
    * Encodes the specified TpStateSetRequest message. Does not implicitly {@link TpStateSetRequest.verify|verify} messages.
    * @param message TpStateSetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpStateSetRequest): Writer = js.native
  def encode(message: ITpStateSetRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TpStateSetRequest message, length delimited. Does not implicitly {@link TpStateSetRequest.verify|verify} messages.
    * @param message TpStateSetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpStateSetRequest): Writer = js.native
  def encodeDelimited(message: ITpStateSetRequest, writer: Writer): Writer = js.native
  /**
    * Creates a TpStateSetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateSetRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TpStateSetRequest = js.native
  /**
    * Creates a plain object from a TpStateSetRequest message. Also converts values to other types if specified.
    * @param message TpStateSetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.TpStateSetRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpStateSetRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TpStateSetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}


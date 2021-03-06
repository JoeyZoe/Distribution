package typings.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ITpEventAddRequest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "protobuf.TpEventAddRequest")
@js.native
/**
  * Constructs a new TpEventAddRequest.
  * @param [properties] Properties to set
  */
class TpEventAddRequest ()
  extends typings.sawtoothSdk.protobufMod.TpEventAddRequest {
  def this(properties: ITpEventAddRequest) = this()
}

/* static members */
@JSImport("sawtooth-sdk", "protobuf.TpEventAddRequest")
@js.native
object TpEventAddRequest extends js.Object {
  /**
    * Creates a new TpEventAddRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpEventAddRequest instance
    */
  def create(): typings.sawtoothSdk.protobufMod.TpEventAddRequest = js.native
  def create(properties: ITpEventAddRequest): typings.sawtoothSdk.protobufMod.TpEventAddRequest = js.native
  /**
    * Decodes a TpEventAddRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpEventAddRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.sawtoothSdk.protobufMod.TpEventAddRequest = js.native
  def decode(reader: Reader, length: Double): typings.sawtoothSdk.protobufMod.TpEventAddRequest = js.native
  def decode(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpEventAddRequest = js.native
  def decode(reader: Uint8Array, length: Double): typings.sawtoothSdk.protobufMod.TpEventAddRequest = js.native
  /**
    * Decodes a TpEventAddRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpEventAddRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.sawtoothSdk.protobufMod.TpEventAddRequest = js.native
  def decodeDelimited(reader: Uint8Array): typings.sawtoothSdk.protobufMod.TpEventAddRequest = js.native
  /**
    * Encodes the specified TpEventAddRequest message. Does not implicitly {@link TpEventAddRequest.verify|verify} messages.
    * @param message TpEventAddRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITpEventAddRequest): Writer = js.native
  def encode(message: ITpEventAddRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TpEventAddRequest message, length delimited. Does not implicitly {@link TpEventAddRequest.verify|verify} messages.
    * @param message TpEventAddRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITpEventAddRequest): Writer = js.native
  def encodeDelimited(message: ITpEventAddRequest, writer: Writer): Writer = js.native
  /**
    * Creates a TpEventAddRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpEventAddRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.sawtoothSdk.protobufMod.TpEventAddRequest = js.native
  /**
    * Creates a plain object from a TpEventAddRequest message. Also converts values to other types if specified.
    * @param message TpEventAddRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.sawtoothSdk.protobufMod.TpEventAddRequest): StringDictionary[js.Any] = js.native
  def toObject(message: typings.sawtoothSdk.protobufMod.TpEventAddRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TpEventAddRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}


package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetResponse")
@js.native
/**
  * Constructs a new ClientBlockGetResponse.
  * @param [properties] Properties to set
  */
class ClientBlockGetResponse () extends IClientBlockGetResponse {
  def this(properties: IClientBlockGetResponse) = this()
  /** ClientBlockGetResponse status. */
  @JSName("status")
  var status_ClientBlockGetResponse: Status = js.native
  /**
    * Converts this ClientBlockGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetResponse")
@js.native
object ClientBlockGetResponse extends js.Object {
  @js.native
  sealed trait Status extends js.Object
  
  /**
    * Creates a new ClientBlockGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetResponse instance
    */
  def create(): ClientBlockGetResponse = js.native
  def create(properties: IClientBlockGetResponse): ClientBlockGetResponse = js.native
  /**
    * Decodes a ClientBlockGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ClientBlockGetResponse = js.native
  def decode(reader: Reader, length: Double): ClientBlockGetResponse = js.native
  def decode(reader: Uint8Array): ClientBlockGetResponse = js.native
  def decode(reader: Uint8Array, length: Double): ClientBlockGetResponse = js.native
  /**
    * Decodes a ClientBlockGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ClientBlockGetResponse = js.native
  def decodeDelimited(reader: Uint8Array): ClientBlockGetResponse = js.native
  /**
    * Encodes the specified ClientBlockGetResponse message. Does not implicitly {@link ClientBlockGetResponse.verify|verify} messages.
    * @param message ClientBlockGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientBlockGetResponse): Writer = js.native
  def encode(message: IClientBlockGetResponse, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientBlockGetResponse message, length delimited. Does not implicitly {@link ClientBlockGetResponse.verify|verify} messages.
    * @param message ClientBlockGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientBlockGetResponse): Writer = js.native
  def encodeDelimited(message: IClientBlockGetResponse, writer: Writer): Writer = js.native
  /**
    * Creates a ClientBlockGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): ClientBlockGetResponse = js.native
  /**
    * Creates a plain object from a ClientBlockGetResponse message. Also converts values to other types if specified.
    * @param message ClientBlockGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ClientBlockGetResponse): StringDictionary[js.Any] = js.native
  def toObject(message: ClientBlockGetResponse, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientBlockGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    @js.native
    sealed trait INTERNAL_ERROR extends Status
    
    @js.native
    sealed trait INVALID_ID extends Status
    
    @js.native
    sealed trait NO_RESOURCE extends Status
    
    @js.native
    sealed trait OK extends Status
    
    @js.native
    sealed trait STATUS_UNSET extends Status
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    /* 2 */ @js.native
    object INTERNAL_ERROR extends TopLevel[INTERNAL_ERROR with Double]
    
    /* 8 */ @js.native
    object INVALID_ID extends TopLevel[INVALID_ID with Double]
    
    /* 5 */ @js.native
    object NO_RESOURCE extends TopLevel[NO_RESOURCE with Double]
    
    /* 1 */ @js.native
    object OK extends TopLevel[OK with Double]
    
    /* 0 */ @js.native
    object STATUS_UNSET extends TopLevel[STATUS_UNSET with Double]
    
  }
  
}


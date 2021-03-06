package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterAVSDeviceRequest extends js.Object {
  /**
    * The device type ID for your AVS device generated by Amazon when the OEM creates a new product on Amazon's Developer Console.
    */
  var AmazonId: typings.awsSdk.alexaforbusinessMod.AmazonId = js.native
  /**
    * The client ID of the OEM used for code-based linking authorization on an AVS device.
    */
  var ClientId: typings.awsSdk.alexaforbusinessMod.ClientId = js.native
  /**
    * The key generated by the OEM that uniquely identifies a specified instance of your AVS device.
    */
  var DeviceSerialNumber: DeviceSerialNumberForAVS = js.native
  /**
    * The product ID used to identify your AVS device during authorization.
    */
  var ProductId: typings.awsSdk.alexaforbusinessMod.ProductId = js.native
  /**
    * The code that is obtained after your AVS device has made a POST request to LWA as a part of the Device Authorization Request component of the OAuth code-based linking specification.
    */
  var UserCode: typings.awsSdk.alexaforbusinessMod.UserCode = js.native
}

object RegisterAVSDeviceRequest {
  @scala.inline
  def apply(
    AmazonId: AmazonId,
    ClientId: ClientId,
    DeviceSerialNumber: DeviceSerialNumberForAVS,
    ProductId: ProductId,
    UserCode: UserCode
  ): RegisterAVSDeviceRequest = {
    val __obj = js.Dynamic.literal(AmazonId = AmazonId.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], DeviceSerialNumber = DeviceSerialNumber.asInstanceOf[js.Any], ProductId = ProductId.asInstanceOf[js.Any], UserCode = UserCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegisterAVSDeviceRequest]
  }
}


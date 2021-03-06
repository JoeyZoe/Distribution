package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpPermission extends js.Object {
  /**
    * A starting value for a range of allowed port numbers.
    */
  var FromPort: PortNumber = js.native
  /**
    * A range of allowed IP addresses. This value must be expressed in CIDR notation. Example: "000.000.000.000/[subnet mask]" or optionally the shortened version "0.0.0.0/[subnet mask]".
    */
  var IpRange: NonBlankString = js.native
  /**
    * The network communication protocol used by the fleet.
    */
  var Protocol: IpProtocol = js.native
  /**
    * An ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than FromPort.
    */
  var ToPort: PortNumber = js.native
}

object IpPermission {
  @scala.inline
  def apply(FromPort: PortNumber, IpRange: NonBlankString, Protocol: IpProtocol, ToPort: PortNumber): IpPermission = {
    val __obj = js.Dynamic.literal(FromPort = FromPort.asInstanceOf[js.Any], IpRange = IpRange.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], ToPort = ToPort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IpPermission]
  }
}


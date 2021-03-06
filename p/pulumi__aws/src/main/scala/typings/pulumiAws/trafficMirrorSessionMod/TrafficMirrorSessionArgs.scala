package typings.pulumiAws.trafficMirrorSessionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorSessionArgs extends js.Object {
  /**
    * A description of the traffic mirror session.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
    */
  val networkInterfaceId: Input[String] = js.native
  /**
    * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
    */
  val packetLength: js.UndefOr[Input[Double]] = js.native
  /**
    * - The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
    */
  val sessionNumber: Input[Double] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * ID of the traffic mirror filter to be used
    */
  val trafficMirrorFilterId: Input[String] = js.native
  /**
    * ID of the traffic mirror target to be used
    */
  val trafficMirrorTargetId: Input[String] = js.native
  /**
    * - The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
    */
  val virtualNetworkId: js.UndefOr[Input[Double]] = js.native
}

object TrafficMirrorSessionArgs {
  @scala.inline
  def apply(
    networkInterfaceId: Input[String],
    sessionNumber: Input[Double],
    trafficMirrorFilterId: Input[String],
    trafficMirrorTargetId: Input[String],
    description: Input[String] = null,
    packetLength: Input[Double] = null,
    tags: Input[StringDictionary[_]] = null,
    virtualNetworkId: Input[Double] = null
  ): TrafficMirrorSessionArgs = {
    val __obj = js.Dynamic.literal(networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], sessionNumber = sessionNumber.asInstanceOf[js.Any], trafficMirrorFilterId = trafficMirrorFilterId.asInstanceOf[js.Any], trafficMirrorTargetId = trafficMirrorTargetId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (packetLength != null) __obj.updateDynamic("packetLength")(packetLength.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (virtualNetworkId != null) __obj.updateDynamic("virtualNetworkId")(virtualNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorSessionArgs]
  }
}


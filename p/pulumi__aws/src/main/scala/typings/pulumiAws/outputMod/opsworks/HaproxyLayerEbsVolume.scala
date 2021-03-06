package typings.pulumiAws.outputMod.opsworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HaproxyLayerEbsVolume extends js.Object {
  var encrypted: js.UndefOr[Boolean] = js.native
  /**
    * For PIOPS volumes, the IOPS per disk.
    */
  var iops: js.UndefOr[Double] = js.native
  /**
    * The path to mount the EBS volume on the layer's instances.
    */
  var mountPoint: String = js.native
  /**
    * The number of disks to use for the EBS volume.
    */
  var numberOfDisks: Double = js.native
  /**
    * The RAID level to use for the volume.
    */
  var raidLevel: js.UndefOr[String] = js.native
  /**
    * The size of the volume in gigabytes.
    */
  var size: Double = js.native
  /**
    * The type of volume to create. This may be `standard` (the default), `io1` or `gp2`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object HaproxyLayerEbsVolume {
  @scala.inline
  def apply(
    mountPoint: String,
    numberOfDisks: Double,
    size: Double,
    encrypted: js.UndefOr[Boolean] = js.undefined,
    iops: Int | Double = null,
    raidLevel: String = null,
    `type`: String = null
  ): HaproxyLayerEbsVolume = {
    val __obj = js.Dynamic.literal(mountPoint = mountPoint.asInstanceOf[js.Any], numberOfDisks = numberOfDisks.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (raidLevel != null) __obj.updateDynamic("raidLevel")(raidLevel.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HaproxyLayerEbsVolume]
  }
}


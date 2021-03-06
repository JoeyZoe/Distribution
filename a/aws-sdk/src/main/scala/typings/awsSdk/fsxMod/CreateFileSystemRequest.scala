package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFileSystemRequest extends js.Object {
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.native
  /**
    * The type of Amazon FSx file system to create, either WINDOWS or LUSTRE.
    */
  var FileSystemType: typings.awsSdk.fsxMod.FileSystemType = js.native
  var KmsKeyId: js.UndefOr[typings.awsSdk.fsxMod.KmsKeyId] = js.native
  var LustreConfiguration: js.UndefOr[CreateFileSystemLustreConfiguration] = js.native
  /**
    * A list of IDs specifying the security groups to apply to all network interfaces created for file system access. This list isn't returned in later requests to describe the file system.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.fsxMod.SecurityGroupIds] = js.native
  /**
    * Sets the storage capacity of the file system that you're creating. For Lustre file systems:   For SCRATCH_2 and PERSISTENT_1 deployment types, valid values are 1.2, 2.4, and increments of 2.4 TiB.   For SCRATCH_1 deployment type, valid values are 1.2, 2.4, and increments of 3.6 TiB.   For Windows file systems:   If StorageType=SSD, valid values are 32 GiB - 65,536 GiB (64 TiB).   If StorageType=HDD, valid values are 2000 GiB - 65,536 GiB (64 TiB).  
    */
  var StorageCapacity: typings.awsSdk.fsxMod.StorageCapacity = js.native
  /**
    * Sets the storage type for the Amazon FSx for Windows file system you're creating. Valid values are SSD and HDD.   Set to SSD to use solid state drive storage. SSD is supported on all Windows deployment types.   Set to HDD to use hard disk drive storage. HDD is supported on SINGLE_AZ_2 and MULTI_AZ_1 Windows file system deployment types.     Default value is SSD. For more information, see  Storage Type Options in the Amazon FSx for Windows User Guide. 
    */
  var StorageType: js.UndefOr[typings.awsSdk.fsxMod.StorageType] = js.native
  /**
    * Specifies the IDs of the subnets that the file system will be accessible from. For Windows MULTI_AZ_1 file system deployment types, provide exactly two subnet IDs, one for the preferred file server and one for the standby file server. You specify one of these subnets as the preferred subnet using the WindowsConfiguration &gt; PreferredSubnetID property. For Windows SINGLE_AZ_1 and SINGLE_AZ_2 file system deployment types and Lustre file systems, provide exactly one subnet ID. The file server is launched in that subnet's Availability Zone.
    */
  var SubnetIds: typings.awsSdk.fsxMod.SubnetIds = js.native
  /**
    * The tags to apply to the file system being created. The key value of the Name tag appears in the console as the file system name.
    */
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.native
  /**
    * The Microsoft Windows configuration for the file system being created. 
    */
  var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.native
}

object CreateFileSystemRequest {
  @scala.inline
  def apply(
    FileSystemType: FileSystemType,
    StorageCapacity: StorageCapacity,
    SubnetIds: SubnetIds,
    ClientRequestToken: ClientRequestToken = null,
    KmsKeyId: KmsKeyId = null,
    LustreConfiguration: CreateFileSystemLustreConfiguration = null,
    SecurityGroupIds: SecurityGroupIds = null,
    StorageType: StorageType = null,
    Tags: Tags = null,
    WindowsConfiguration: CreateFileSystemWindowsConfiguration = null
  ): CreateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemType = FileSystemType.asInstanceOf[js.Any], StorageCapacity = StorageCapacity.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (LustreConfiguration != null) __obj.updateDynamic("LustreConfiguration")(LustreConfiguration.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (WindowsConfiguration != null) __obj.updateDynamic("WindowsConfiguration")(WindowsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemRequest]
  }
}


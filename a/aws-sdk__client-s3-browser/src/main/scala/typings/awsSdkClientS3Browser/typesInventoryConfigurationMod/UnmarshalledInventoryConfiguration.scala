package typings.awsSdkClientS3Browser.typesInventoryConfigurationMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.All
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Current
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ETag
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.EncryptionStatus
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.IsMultipartUploaded
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.LastModifiedDate
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.ReplicationStatus
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Size
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.StorageClass
import typings.awsSdkClientS3Browser.typesInventoryDestinationMod.UnmarshalledInventoryDestination
import typings.awsSdkClientS3Browser.typesInventoryFilterMod.UnmarshalledInventoryFilter
import typings.awsSdkClientS3Browser.typesInventoryScheduleMod.UnmarshalledInventorySchedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledInventoryConfiguration extends InventoryConfiguration {
  /**
    * <p>Contains information about where to publish the inventory results.</p>
    */
  @JSName("Destination")
  var Destination_UnmarshalledInventoryConfiguration: UnmarshalledInventoryDestination
  /**
    * <p>Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.</p>
    */
  @JSName("Filter")
  var Filter_UnmarshalledInventoryConfiguration: js.UndefOr[UnmarshalledInventoryFilter] = js.undefined
  /**
    * <p>Contains the optional fields that are included in the inventory results.</p>
    */
  @JSName("OptionalFields")
  var OptionalFields_UnmarshalledInventoryConfiguration: js.UndefOr[
    js.Array[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ]
  ] = js.undefined
  /**
    * <p>Specifies the schedule for generating inventory results.</p>
    */
  @JSName("Schedule")
  var Schedule_UnmarshalledInventoryConfiguration: UnmarshalledInventorySchedule
}

object UnmarshalledInventoryConfiguration {
  @scala.inline
  def apply(
    Destination: UnmarshalledInventoryDestination,
    Id: String,
    IncludedObjectVersions: All | Current | String,
    IsEnabled: Boolean,
    Schedule: UnmarshalledInventorySchedule,
    Filter: UnmarshalledInventoryFilter = null,
    OptionalFields: js.Array[
      Size | LastModifiedDate | StorageClass | ETag | IsMultipartUploaded | ReplicationStatus | EncryptionStatus | String
    ] = null
  ): UnmarshalledInventoryConfiguration = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any], IsEnabled = IsEnabled.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
    if (Filter != null) __obj.updateDynamic("Filter")(Filter.asInstanceOf[js.Any])
    if (OptionalFields != null) __obj.updateDynamic("OptionalFields")(OptionalFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledInventoryConfiguration]
  }
}


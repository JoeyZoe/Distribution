package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowTasksRequest extends js.Object {
  /**
    * Optional filters used to narrow down the scope of the returned tasks. The supported filter keys are WindowTaskId, TaskArn, Priority, and TaskType.
    */
  var Filters: js.UndefOr[MaintenanceWindowFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaintenanceWindowMaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The ID of the maintenance window whose tasks should be retrieved.
    */
  var WindowId: MaintenanceWindowId = js.native
}

object DescribeMaintenanceWindowTasksRequest {
  @scala.inline
  def apply(
    WindowId: MaintenanceWindowId,
    Filters: MaintenanceWindowFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): DescribeMaintenanceWindowTasksRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowTasksRequest]
  }
}


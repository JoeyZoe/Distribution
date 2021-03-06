package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SetAddonsRequest sets the addons associated with the cluster.
  */
@js.native
trait SchemaSetAddonsConfigRequest extends js.Object {
  /**
    * The desired configurations for the various addons available to run in the
    * cluster.
    */
  var addonsConfig: js.UndefOr[SchemaAddonsConfig] = js.native
  /**
    * Deprecated. The name of the cluster to upgrade. This field has been
    * deprecated and replaced by the name field.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * The name (project, location, cluster) of the cluster to set addons.
    * Specified in the format &#39;projects/x/locations/x/clusters/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840). This field has
    * been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaSetAddonsConfigRequest {
  @scala.inline
  def apply(
    addonsConfig: SchemaAddonsConfig = null,
    clusterId: String = null,
    name: String = null,
    projectId: String = null,
    zone: String = null
  ): SchemaSetAddonsConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (addonsConfig != null) __obj.updateDynamic("addonsConfig")(addonsConfig.asInstanceOf[js.Any])
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSetAddonsConfigRequest]
  }
}


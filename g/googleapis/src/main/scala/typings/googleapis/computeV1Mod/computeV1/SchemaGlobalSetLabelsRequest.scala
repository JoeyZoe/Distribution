package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGlobalSetLabelsRequest extends js.Object {
  /**
    * The fingerprint of the previous set of labels for this resource, used to
    * detect conflicts. The fingerprint is initially generated by Compute
    * Engine and changes after every request to modify or update labels. You
    * must always provide an up-to-date fingerprint hash when updating or
    * changing labels, otherwise the request will fail with error 412
    * conditionNotMet. Make a get() request to the resource to get the latest
    * fingerprint.
    */
  var labelFingerprint: js.UndefOr[String] = js.native
  /**
    * A list of labels to apply for this resource. Each label key &amp; value
    * must comply with RFC1035. Specifically, the name must be 1-63 characters
    * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which
    * means the first character must be a lowercase letter, and all following
    * characters must be a dash, lowercase letter, or digit, except the last
    * character, which cannot be a dash. For example,
    * &quot;webserver-frontend&quot;: &quot;images&quot;. A label value can
    * also be empty (e.g. &quot;my-label&quot;: &quot;&quot;).
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaGlobalSetLabelsRequest {
  @scala.inline
  def apply(labelFingerprint: String = null, labels: StringDictionary[String] = null): SchemaGlobalSetLabelsRequest = {
    val __obj = js.Dynamic.literal()
    if (labelFingerprint != null) __obj.updateDynamic("labelFingerprint")(labelFingerprint.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGlobalSetLabelsRequest]
  }
}


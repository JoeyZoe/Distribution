package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Meta information related to the job searcher or entity
  * conducting the job search. This information is used to improve the
  * performance of the service.
  */
@js.native
trait SchemaRequestMetadata extends js.Object {
  /**
    * Optional.  The type of device used by the job seeker at the time of the
    * call to the service.
    */
  var deviceInfo: js.UndefOr[SchemaDeviceInfo] = js.native
  /**
    * Required.  The client-defined scope or source of the service call, which
    * typically is the domain on which the service has been implemented and is
    * currently being run.  For example, if the service is being run by client
    * &lt;em&gt;Foo, Inc.&lt;/em&gt;, on job board www.foo.com and career site
    * www.bar.com, then this field is set to &quot;foo.com&quot; for use on the
    * job board, and &quot;bar.com&quot; for use on the career site.  If this
    * field isn&#39;t available for some reason, send &quot;UNKNOWN&quot;. Any
    * improvements to the model for a particular tenant site rely on this field
    * being set correctly to a domain.  The maximum number of allowed
    * characters is 255.
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * Required.  A unique session identification string. A session is defined
    * as the duration of an end user&#39;s interaction with the service over a
    * certain period. Obfuscate this field for privacy concerns before
    * providing it to the service.  If this field is not available for some
    * reason, send &quot;UNKNOWN&quot;. Note that any improvements to the model
    * for a particular tenant site, rely on this field being set correctly to
    * some unique session_id.  The maximum number of allowed characters is 255.
    */
  var sessionId: js.UndefOr[String] = js.native
  /**
    * Required.  A unique user identification string, as determined by the
    * client. To have the strongest positive impact on search quality make sure
    * the client-level is unique. Obfuscate this field for privacy concerns
    * before providing it to the service.  If this field is not available for
    * some reason, send &quot;UNKNOWN&quot;. Note that any improvements to the
    * model for a particular tenant site, rely on this field being set
    * correctly to a unique user_id.  The maximum number of allowed characters
    * is 255.
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaRequestMetadata {
  @scala.inline
  def apply(
    deviceInfo: SchemaDeviceInfo = null,
    domain: String = null,
    sessionId: String = null,
    userId: String = null
  ): SchemaRequestMetadata = {
    val __obj = js.Dynamic.literal()
    if (deviceInfo != null) __obj.updateDynamic("deviceInfo")(deviceInfo.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRequestMetadata]
  }
}


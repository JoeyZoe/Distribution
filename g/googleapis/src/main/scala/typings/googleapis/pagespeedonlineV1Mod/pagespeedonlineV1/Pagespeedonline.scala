package typings.googleapis.pagespeedonlineV1Mod.pagespeedonlineV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PageSpeed Insights API
  *
  * Analyzes the performance of a web page and provides tailored suggestions to
  * make that page faster.
  *
  * @example
  * const {google} = require('googleapis');
  * const pagespeedonline = google.pagespeedonline('v1');
  *
  * @namespace pagespeedonline
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Pagespeedonline
  */
@JSImport("googleapis/build/src/apis/pagespeedonline/v1", "pagespeedonline_v1.Pagespeedonline")
@js.native
class Pagespeedonline protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var pagespeedapi: ResourcePagespeedapi = js.native
}


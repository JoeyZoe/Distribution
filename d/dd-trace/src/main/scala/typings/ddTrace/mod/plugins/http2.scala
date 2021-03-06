package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [http2](https://nodejs.org/api/http2.html) module.
  *
  * By default any option set at the root will apply to both clients and
  * servers. To configure only one or the other, use the `client` and `server`
  * options.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.ddTrace.mod.Analyzable because Already inherited
- typings.ddTrace.mod.plugins.Integration because Already inherited
- typings.ddTrace.mod.plugins.Http_ because Already inherited
- typings.ddTrace.mod.plugins.Http2Server because var conflicts: analytics, blacklist, enabled, headers, service, validateStatus, whitelist. Inlined  */ trait http2 extends Http2Client {
  /**
    * Configuration for HTTP clients.
    */
  var client: js.UndefOr[Http2Client] = js.undefined
  /**
    * Configuration for HTTP servers.
    */
  var server: js.UndefOr[Http2Server] = js.undefined
}

object http2 {
  @scala.inline
  def apply(
    analytics: Boolean | Double | (StringDictionary[Boolean | Double]) = null,
    blacklist: String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])]) = null,
    client: Http2Client = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    headers: js.Array[String] = null,
    server: Http2Server = null,
    service: String = null,
    splitByDomain: js.UndefOr[Boolean] = js.undefined,
    validateStatus: /* code */ Double => Boolean = null,
    whitelist: String | RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | RegExp | (js.Function1[/* url */ String, Boolean])]) = null
  ): http2 = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (!js.isUndefined(splitByDomain)) __obj.updateDynamic("splitByDomain")(splitByDomain.asInstanceOf[js.Any])
    if (validateStatus != null) __obj.updateDynamic("validateStatus")(js.Any.fromFunction1(validateStatus))
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[http2]
  }
}


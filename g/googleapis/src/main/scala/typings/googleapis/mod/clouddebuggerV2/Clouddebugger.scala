package typings.googleapis.mod.clouddebuggerV2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stackdriver Debugger API
  *
  * Examines the call stack and variables of a running application without
  * stopping or slowing it down.
  *
  * @example
  * const {google} = require('googleapis');
  * const clouddebugger = google.clouddebugger('v2');
  *
  * @namespace clouddebugger
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Clouddebugger
  */
@JSImport("googleapis", "clouddebugger_v2.Clouddebugger")
@js.native
class Clouddebugger protected ()
  extends typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2.Clouddebugger {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}


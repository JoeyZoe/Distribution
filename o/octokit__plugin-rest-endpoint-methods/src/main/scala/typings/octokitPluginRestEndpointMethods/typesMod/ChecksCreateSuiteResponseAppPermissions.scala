package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateSuiteResponseAppPermissions extends js.Object {
  var contents: String
  var issues: String
  var metadata: String
  var single_file: String
}

object ChecksCreateSuiteResponseAppPermissions {
  @scala.inline
  def apply(contents: String, issues: String, metadata: String, single_file: String): ChecksCreateSuiteResponseAppPermissions = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], single_file = single_file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksCreateSuiteResponseAppPermissions]
  }
}


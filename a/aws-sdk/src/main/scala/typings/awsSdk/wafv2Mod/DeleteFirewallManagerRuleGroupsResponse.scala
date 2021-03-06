package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFirewallManagerRuleGroupsResponse extends js.Object {
  /**
    * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var NextWebACLLockToken: js.UndefOr[LockToken] = js.native
}

object DeleteFirewallManagerRuleGroupsResponse {
  @scala.inline
  def apply(NextWebACLLockToken: LockToken = null): DeleteFirewallManagerRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextWebACLLockToken != null) __obj.updateDynamic("NextWebACLLockToken")(NextWebACLLockToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFirewallManagerRuleGroupsResponse]
  }
}


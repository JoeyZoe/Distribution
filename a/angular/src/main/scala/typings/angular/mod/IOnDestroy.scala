package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the $onDestroy lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
trait IOnDestroy extends js.Object {
  /**
    * Called on a controller when its containing scope is destroyed. Use this hook for releasing external resources,
    * watches and event handlers.
    */
  @JSName("$onDestroy")
  def $onDestroy(): Unit
}

object IOnDestroy {
  @scala.inline
  def apply($onDestroy: () => Unit): IOnDestroy = {
    val __obj = js.Dynamic.literal($onDestroy = js.Any.fromFunction0($onDestroy))
  
    __obj.asInstanceOf[IOnDestroy]
  }
}


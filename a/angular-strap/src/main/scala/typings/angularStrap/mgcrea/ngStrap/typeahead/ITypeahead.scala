package typings.angularStrap.mgcrea.ngStrap.typeahead

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypeahead extends js.Object {
  @JSName("$promise")
  var $promise: IPromise[Unit]
  def hide(): Unit
  def show(): Unit
  def toggle(): Unit
}

object ITypeahead {
  @scala.inline
  def apply($promise: IPromise[Unit], hide: () => Unit, show: () => Unit, toggle: () => Unit): ITypeahead = {
    val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[ITypeahead]
  }
}


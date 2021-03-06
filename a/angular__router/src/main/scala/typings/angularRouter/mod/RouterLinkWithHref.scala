package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.mod.LocationStrategy
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.SimpleChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "RouterLinkWithHref")
@js.native
class RouterLinkWithHref protected ()
  extends OnChanges
     with OnDestroy {
  def this(router: Router, route: ActivatedRoute, locationStrategy: LocationStrategy) = this()
  var commands: js.Any = js.native
  var fragment: String = js.native
  var href: String = js.native
  var locationStrategy: js.Any = js.native
  var preserve: js.Any = js.native
  var preserveFragment: Boolean = js.native
  var queryParams: StringDictionary[js.Any] = js.native
  var queryParamsHandling: QueryParamsHandling = js.native
  var replaceUrl: Boolean = js.native
  var route: js.Any = js.native
  var router: js.Any = js.native
  var skipLocationChange: Boolean = js.native
  var state: js.UndefOr[StringDictionary[js.Any]] = js.native
  var subscription: js.Any = js.native
  var target: String = js.native
  var updateTargetUrlAndHref: js.Any = js.native
  def ngOnChanges(changes: js.Object): js.Any = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  def onClick(button: Double, ctrlKey: Boolean, metaKey: Boolean, shiftKey: Boolean): Boolean = js.native
  def preserveQueryParams(value: Boolean): js.Any = js.native
  def routerLink(commands: String): js.Any = js.native
  def routerLink(commands: js.Array[_]): js.Any = js.native
  def urlTree(): UrlTree = js.native
}


package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.NgZone
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/directives/proxies", "IonChip")
@js.native
class IonChip protected ()
  extends typings.ionicCore.componentsMod.Components.IonChip {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  /**
    * Display an outline style button.
    */
  /* CompleteClass */
  override var outline: Boolean = js.native
  var z: NgZone = js.native
}


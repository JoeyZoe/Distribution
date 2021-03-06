package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Loader plugin for handling Texture resources.
  * @class
  * @memberof PIXI
  * @implements PIXI.ILoaderPlugin
  */
@JSGlobal("PIXI.TextureLoader")
@js.native
class TextureLoader () extends ILoaderPlugin

/* static members */
@JSGlobal("PIXI.TextureLoader")
@js.native
object TextureLoader extends js.Object {
  /**
    * Called after a resource is loaded.
    * @see PIXI.Loader.loaderMiddleware
    * @param {PIXI.LoaderResource} resource
    * @param {function} next
    */
  def use(resource: LoaderResource, next: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}


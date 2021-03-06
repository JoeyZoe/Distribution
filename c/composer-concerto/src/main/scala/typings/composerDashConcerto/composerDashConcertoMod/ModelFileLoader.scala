package typings.composerDashConcerto.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelFileLoader extends js.Object {
  /**
    * Returns true if this ModelLoader can process the URL
    */
  def accepts(url: String): Boolean
  /**
    * Load a ModelFile from a URL and return it
    */
  def load(url: String, options: js.Any): js.Promise[ModelFile]
}

object ModelFileLoader {
  @scala.inline
  def apply(accepts: String => Boolean, load: (String, js.Any) => js.Promise[ModelFile]): ModelFileLoader = {
    val __obj = js.Dynamic.literal(accepts = js.Any.fromFunction1(accepts), load = js.Any.fromFunction2(load))
  
    __obj.asInstanceOf[ModelFileLoader]
  }
}


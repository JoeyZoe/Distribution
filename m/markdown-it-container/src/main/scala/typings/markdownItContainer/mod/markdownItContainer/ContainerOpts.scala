package typings.markdownItContainer.mod.markdownItContainer

import typings.markdownIt.tokenMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerOpts extends js.Object {
  var marker: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[
    js.Function5[
      /* tokens */ js.Array[^], 
      /* index */ Double, 
      /* options */ js.Any, 
      /* env */ js.Any, 
      /* self */ typings.markdownIt.rendererMod.^, 
      Unit
    ]
  ] = js.undefined
  var validate: js.UndefOr[js.Function1[/* params */ String, Boolean]] = js.undefined
}

object ContainerOpts {
  @scala.inline
  def apply(
    marker: String = null,
    render: (/* tokens */ js.Array[^], /* index */ Double, /* options */ js.Any, /* env */ js.Any, /* self */ typings.markdownIt.rendererMod.^) => Unit = null,
    validate: /* params */ String => Boolean = null
  ): ContainerOpts = {
    val __obj = js.Dynamic.literal()
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction5(render))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    __obj.asInstanceOf[ContainerOpts]
  }
}


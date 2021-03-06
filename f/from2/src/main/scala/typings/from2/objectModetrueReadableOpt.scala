package typings.from2

import typings.from2.from2Booleans.`true`
import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  objectMode ? :true} & node.stream.ReadableOptions */
trait objectModetrueReadableOpt extends js.Object {
  var autoDestroy: js.UndefOr[Boolean] = js.undefined
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var objectMode: js.UndefOr[`true` with Boolean] = js.undefined
  var read: js.UndefOr[js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]] = js.undefined
}

object objectModetrueReadableOpt {
  @scala.inline
  def apply(
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    destroy: js.ThisFunction2[
      /* this */ Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    encoding: String = null,
    highWaterMark: Int | Double = null,
    objectMode: js.UndefOr[`true` with Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit] = null
  ): objectModetrueReadableOpt = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[objectModetrueReadableOpt]
  }
}


package typings.leveldown.mod

import org.scalablytyped.runtime.StringDictionary
import typings.abstractLeveldown.mod.AbstractOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelDownPutOptions extends AbstractOptions {
  var sync: js.UndefOr[Boolean] = js.undefined
}

object LevelDownPutOptions {
  @scala.inline
  def apply(StringDictionary: StringDictionary[js.Any] = null, sync: js.UndefOr[Boolean] = js.undefined): LevelDownPutOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelDownPutOptions]
  }
}


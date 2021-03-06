package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the collection of {@link Word.Setting} objects.
  *
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait SettingCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the key of the setting. Read only.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var key: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the value of the setting.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var value: js.UndefOr[Boolean] = js.undefined
}

object SettingCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Boolean] = js.undefined
  ): SettingCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingCollectionLoadOptions]
  }
}


package typings.iobroker.mod._Global_.ioBroker

import typings.iobroker.PartialObjectCommon
import typings.iobroker.iobrokerStrings.adapter
import typings.iobroker.iobrokerStrings.config
import typings.iobroker.iobrokerStrings.enum
import typings.iobroker.iobrokerStrings.group
import typings.iobroker.iobrokerStrings.host
import typings.iobroker.iobrokerStrings.info
import typings.iobroker.iobrokerStrings.instance
import typings.iobroker.iobrokerStrings.meta
import typings.iobroker.iobrokerStrings.script
import typings.iobroker.iobrokerStrings.user
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Pick<iobroker.iobroker._Global_.ioBroker.OtherObject, '_id' | 'native' | 'enums' | 'type' | 'acl'>> */
trait PartialOtherObject extends PartialObject {
  var _id: js.UndefOr[String] = js.undefined
  var acl: js.UndefOr[ObjectACL] = js.undefined
  var common: js.UndefOr[PartialObjectCommon] = js.undefined
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  var native: js.UndefOr[Record[String, _]] = js.undefined
  var `type`: js.UndefOr[adapter | config | enum | group | host | info | instance | meta | script | user] = js.undefined
}

object PartialOtherObject {
  @scala.inline
  def apply(
    _id: String = null,
    acl: ObjectACL = null,
    common: PartialObjectCommon = null,
    enums: Record[String, String] = null,
    native: Record[String, _] = null,
    `type`: adapter | config | enum | group | host | info | instance | meta | script | user = null
  ): PartialOtherObject = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOtherObject]
  }
}


package typings.pouchdbFind.PouchDB.Find

import typings.pouchdbFind.pouchdbFindStrings.`null`
import typings.pouchdbFind.pouchdbFindStrings.`object`
import typings.pouchdbFind.pouchdbFindStrings.array
import typings.pouchdbFind.pouchdbFindStrings.boolean
import typings.pouchdbFind.pouchdbFindStrings.number
import typings.pouchdbFind.pouchdbFindStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionOperators extends js.Object {
  /** Matches an array value if it contains all the elements of the argument array. */
  @JSName("$all")
  var $all: js.UndefOr[js.Array[_]] = js.undefined
  @JSName("$elemMatch")
  var $elemMatch: js.UndefOr[ConditionOperators] = js.undefined
  /** Match fields equal to this one. */
  @JSName("$eq")
  var $eq: js.UndefOr[js.Any] = js.undefined
  /** True if the field should exist, false otherwise. */
  @JSName("$exists")
  var $exists: js.UndefOr[Boolean] = js.undefined
  /** Match fields "greater than" this one. */
  @JSName("$gt")
  var $gt: js.UndefOr[js.Any] = js.undefined
  /** Match fields "greater than or equal to" this one. */
  @JSName("$gte")
  var $gte: js.UndefOr[js.Any] = js.undefined
  /** The document field must exist in the list provided. */
  @JSName("$in")
  var $in: js.UndefOr[js.Array[_]] = js.undefined
  /** Match fields "less than" this one. */
  @JSName("$lt")
  var $lt: js.UndefOr[js.Any] = js.undefined
  /** Match fields "less than or equal to" this one. */
  @JSName("$lte")
  var $lte: js.UndefOr[js.Any] = js.undefined
  /**
    * Divisor and Remainder are both positive or negative integers.
    * Non-integer values result in a 404 status.
    * Matches documents where (field % Divisor == Remainder) is true, and only when the document field is an integer.
    * [divisor, remainder]
    */
  @JSName("$mod")
  var $mod: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  /** Match fields not equal to this one. */
  @JSName("$ne")
  var $ne: js.UndefOr[js.Any] = js.undefined
  /** The document field must not exist in the list provided. */
  @JSName("$nin")
  var $nin: js.UndefOr[js.Array[_]] = js.undefined
  /** A regular expression pattern to match against the document field. Only matches when the field is a string value and matches the supplied regular expression. */
  @JSName("$regex")
  var $regex: js.UndefOr[String] = js.undefined
  /** Special condition to match the length of an array field in a document. Non-array fields cannot match this condition. */
  @JSName("$size")
  var $size: js.UndefOr[Double] = js.undefined
  /** One of: "null", "boolean", "number", "string", "array", or "object". */
  @JSName("$type")
  var $type: js.UndefOr[`null` | boolean | number | string | array | `object`] = js.undefined
}

object ConditionOperators {
  @scala.inline
  def apply(
    $all: js.Array[_] = null,
    $elemMatch: ConditionOperators = null,
    $eq: js.Any = null,
    $exists: js.UndefOr[Boolean] = js.undefined,
    $gt: js.Any = null,
    $gte: js.Any = null,
    $in: js.Array[_] = null,
    $lt: js.Any = null,
    $lte: js.Any = null,
    $mod: js.Tuple2[Double, Double] = null,
    $ne: js.Any = null,
    $nin: js.Array[_] = null,
    $regex: String = null,
    $size: Int | Double = null,
    $type: `null` | boolean | number | string | array | `object` = null
  ): ConditionOperators = {
    val __obj = js.Dynamic.literal()
    if ($all != null) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if ($elemMatch != null) __obj.updateDynamic("$elemMatch")($elemMatch.asInstanceOf[js.Any])
    if ($eq != null) __obj.updateDynamic("$eq")($eq.asInstanceOf[js.Any])
    if (!js.isUndefined($exists)) __obj.updateDynamic("$exists")($exists.asInstanceOf[js.Any])
    if ($gt != null) __obj.updateDynamic("$gt")($gt.asInstanceOf[js.Any])
    if ($gte != null) __obj.updateDynamic("$gte")($gte.asInstanceOf[js.Any])
    if ($in != null) __obj.updateDynamic("$in")($in.asInstanceOf[js.Any])
    if ($lt != null) __obj.updateDynamic("$lt")($lt.asInstanceOf[js.Any])
    if ($lte != null) __obj.updateDynamic("$lte")($lte.asInstanceOf[js.Any])
    if ($mod != null) __obj.updateDynamic("$mod")($mod.asInstanceOf[js.Any])
    if ($ne != null) __obj.updateDynamic("$ne")($ne.asInstanceOf[js.Any])
    if ($nin != null) __obj.updateDynamic("$nin")($nin.asInstanceOf[js.Any])
    if ($regex != null) __obj.updateDynamic("$regex")($regex.asInstanceOf[js.Any])
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    if ($type != null) __obj.updateDynamic("$type")($type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionOperators]
  }
}


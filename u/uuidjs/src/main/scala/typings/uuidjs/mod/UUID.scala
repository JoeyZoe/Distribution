package typings.uuidjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Use class-based API */
trait UUID extends js.Object {
  var bitFields: UUIDFields[String]
  var bitString: String
  var hexFields: UUIDFields[String]
  var hexNoDelim: String
  var hexString: String
  var intFields: UUIDFields[Double]
  var urn: String
  var version: Double
  def equals(uuid: UUID): Boolean
}

object UUID {
  @scala.inline
  def apply(
    bitFields: UUIDFields[String],
    bitString: String,
    equals: UUID => Boolean,
    hexFields: UUIDFields[String],
    hexNoDelim: String,
    hexString: String,
    intFields: UUIDFields[Double],
    urn: String,
    version: Double
  ): UUID = {
    val __obj = js.Dynamic.literal(bitFields = bitFields.asInstanceOf[js.Any], bitString = bitString.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), hexFields = hexFields.asInstanceOf[js.Any], hexNoDelim = hexNoDelim.asInstanceOf[js.Any], hexString = hexString.asInstanceOf[js.Any], intFields = intFields.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UUID]
  }
}


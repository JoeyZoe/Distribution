package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/find.html#db-index
trait CreateIndexResponse extends js.Object {
  // Id of the design document the index was created in.
  var id: String
  // Name of the index created.
  var name: String
  // Flag to show whether the index was created or one already exists. Can be “created” or “exists”.
  var result: String
}

object CreateIndexResponse {
  @scala.inline
  def apply(id: String, name: String, result: String): CreateIndexResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateIndexResponse]
  }
}


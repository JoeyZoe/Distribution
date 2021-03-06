package typings.graphqlBinding.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphqlBinding.graphqlBindingStrings.query
  - typings.graphqlBinding.graphqlBindingStrings.mutation
*/
trait QueryOrMutation extends js.Object

object QueryOrMutation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mutation: typings.graphqlBinding.graphqlBindingStrings.mutation = this.cast("mutation")
  @scala.inline
  def query: typings.graphqlBinding.graphqlBindingStrings.query = this.cast("query")
}


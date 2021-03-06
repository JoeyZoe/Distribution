package typings.objection

import org.scalablytyped.runtime.Instantiable0
import typings.objection.mod.ForClassMethod
import typings.objection.mod.Model
import typings.objection.mod.ModelConstructor
import typings.objection.mod.QueryBuilder
import typings.objection.mod.QueryBuilderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofQueryBuilder
  extends Instantiable0[QueryBuilder[Model, js.Object]] {
  @JSName("forClass")
  var forClass_Original: ForClassMethod = js.native
  def forClass[M /* <: Model */](modelClass: ModelConstructor[M]): QueryBuilderType[M] = js.native
}


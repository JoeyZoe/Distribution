package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.reflectionCategoryMod.ReflectionCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/ReflectionGroup", JSImport.Namespace)
@js.native
object reflectionGroupMod extends js.Object {
  @js.native
  class ReflectionGroup protected () extends js.Object {
    def this(title: String, kind: ReflectionKind) = this()
    var allChildrenAreExternal: js.UndefOr[Boolean] = js.native
    var allChildrenAreInherited: js.UndefOr[Boolean] = js.native
    var allChildrenArePrivate: js.UndefOr[Boolean] = js.native
    var allChildrenAreProtectedOrPrivate: js.UndefOr[Boolean] = js.native
    var allChildrenHaveOwnDocument: js.Function = js.native
    var categories: js.UndefOr[js.Array[ReflectionCategory]] = js.native
    var children: js.Array[Reflection] = js.native
    var cssClasses: js.UndefOr[String] = js.native
    var getAllChildrenHaveOwnDocument: js.Any = js.native
    var kind: ReflectionKind = js.native
    var someChildrenAreExported: js.UndefOr[Boolean] = js.native
    var title: String = js.native
  }
  
}


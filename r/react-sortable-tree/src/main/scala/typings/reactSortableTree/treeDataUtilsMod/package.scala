package typings.reactSortableTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeDataUtilsMod {
  type GetNodeKeyFunction = js.Function1[
    /* data */ typings.reactSortableTree.mod.TreeIndex with typings.reactSortableTree.mod.TreeNode, 
    java.lang.String | scala.Double
  ]
}

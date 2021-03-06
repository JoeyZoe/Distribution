package typings.routeNode.routeNodeMod

import typings.pathParser.mod.Path
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("route-node/dist/RouteNode", "RouteNode")
@js.native
class RouteNode () extends Route {
  def this(name: String) = this()
  def this(name: String, path: String) = this()
  def this(name: String, path: String, childRoutes: js.Array[Route]) = this()
  def this(name: String, path: String, childRoutes: js.Array[Route], options: RouteNodeOptions) = this()
  var absolute: Boolean = js.native
  var addRouteNode: js.Any = js.native
  var checkParents: js.Any = js.native
  var children: js.Array[RouteNode] = js.native
  var findAbsoluteChildren: js.Any = js.native
  var findSlashChild: js.Any = js.native
  var getSegmentsByName: js.Any = js.native
  var getSegmentsMatchingPath: js.Any = js.native
  var hasParentsParams: js.Any = js.native
  var name: String = js.native
  var parent: js.UndefOr[RouteNode] = js.native
  var parser: (Path[Record[String, _]]) | Null = js.native
  var path: String = js.native
  def add(route: js.Array[Route]): this.type = js.native
  def add(route: js.Array[Route], cb: Callback): this.type = js.native
  def add(route: js.Array[Route], cb: Callback, sort: Boolean): this.type = js.native
  def add(route: Route): this.type = js.native
  def add(route: Route, cb: Callback): this.type = js.native
  def add(route: Route, cb: Callback, sort: Boolean): this.type = js.native
  def addNode(name: String, path: String): this.type = js.native
  def buildPath(routeName: String): String = js.native
  def buildPath(routeName: String, params: Record[String, _]): String = js.native
  def buildPath(routeName: String, params: Record[String, _], options: BuildOptions): String = js.native
  def buildState(name: String): RouteNodeState | Null = js.native
  def buildState(name: String, params: Record[String, _]): RouteNodeState | Null = js.native
  def getNonAbsoluteChildren(): js.Array[RouteNode] = js.native
  def getParentSegments(): js.Array[RouteNode] = js.native
  def getParentSegments(segments: js.Array[RouteNode]): js.Array[RouteNode] = js.native
  def getPath(routeName: String): String | Null = js.native
  def matchPath(path: String): RouteNodeState | Null = js.native
  def matchPath(path: String, options: MatchOptions): RouteNodeState | Null = js.native
  def setParent(parent: RouteNode): Unit = js.native
  def setPath(): Unit = js.native
  def setPath(path: String): Unit = js.native
  def sortChildren(): Unit = js.native
  def sortDescendants(): Unit = js.native
}


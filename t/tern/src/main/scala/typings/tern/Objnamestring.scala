package typings.tern

import typings.estree.mod.Node
import typings.tern.inferMod.ANull
import typings.tern.inferMod.AVal
import typings.tern.inferMod.Obj
import typings.tern.inferMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tern.tern/lib/infer.Obj & {  name  :string} */
@js.native
trait Objnamestring extends js.Object {
  /** The name of the type, if any. */
  var name: js.UndefOr[String] with String = js.native
  /** The origin file of the type. */
  var origin: String = js.native
  /**
    * The syntax node that defined the type. Only present for object and function types,
    * and even for those it may be missing (if the type was created by a type definition file,
    * or synthesized in some other way).
    */
  var originNode: js.UndefOr[Node] = js.native
  /** The prototype of the object, or null. */
  var proto: (Obj with AnonName) | Null = js.native
  def addType(args: js.Any*): Unit = js.native
  /** Looks up the given property, or defines it if it did not yet exist (in which case it will be associated with the given AST node). */
  def defProp(prop: String): AVal = js.native
  def defProp(prop: String, originNode: Node): AVal = js.native
  def forAllProps(args: js.Any*): Unit = js.native
  /** Call the given function for all properties of the object, including properties that are added in the future. */
  def forAllProps(f: js.Function3[/* prop */ String, /* val */ AVal, /* local */ Boolean, Unit]): Unit = js.native
  def gatherProperties(args: js.Any*): Unit = js.native
  def gatherProperties(f: js.Function1[/* repeated */ js.Any, Unit], depth: Double): Unit = js.native
  def getFunctionType(args: js.Any*): js.UndefOr[ANull] = js.native
  /**
    * Asks the AVal if it contains an Object type. Useful when
    * you aren’t interested in other kinds of types.
    */
  def getObjType(): Obj = js.native
  def getObjType(args: js.Any*): js.UndefOr[ANull | Null] = js.native
  def getProp(args: js.Any*): ANull = js.native
  /** Get an `AVal` that represents the named property of this type. */
  def getProp(prop: String): AVal = js.native
  def getSymbolType(args: js.Any*): js.UndefOr[ANull] = js.native
  def getType(): Type = js.native
  def getType(args: js.Any*): js.UndefOr[ANull | Null] = js.native
  @JSName("getType")
  def getType_Obj(): Obj = js.native
  /** Looks up the AVal associated with the given property, or returns null if it doesn’t exist. */
  def hasProp(prop: String): AVal | Null = js.native
  def hasType(args: js.Any*): Boolean = js.native
  /** Queries whether the AVal _currently_ holds the given type. */
  def hasType(`type`: Type): Boolean = js.native
  def isEmpty(args: js.Any*): Boolean = js.native
  def propHint(args: js.Any*): js.UndefOr[String] = js.native
  def propagate(args: js.Any*): Unit = js.native
  def propagatesTo(): js.Any = js.native
  def toString(args: js.Any*): String = js.native
  /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
  def toString(maxDepth: Double): String = js.native
  def typeHint(args: js.Any*): js.UndefOr[ANull | Null] = js.native
}


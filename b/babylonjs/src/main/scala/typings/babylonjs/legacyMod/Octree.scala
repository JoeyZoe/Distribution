package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "Octree")
@js.native
class Octree[T] protected ()
  extends typings.babylonjs.indexMod.Octree[T] {
  /**
    * Creates a octree
    * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
    * @param creationFunc function to be used to instatiate the octree
    * @param maxBlockCapacity defines the maximum number of meshes you want on your octree's leaves (default: 64)
    * @param maxDepth defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.)
    */
  def this(creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit]) = this()
  def this(
    creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit],
    maxBlockCapacity: Double
  ) = this()
  def this(
    creationFunc: js.Function2[/* entry */ T, /* block */ typings.babylonjs.octreeBlockMod.OctreeBlock[T], Unit],
    maxBlockCapacity: Double,
    /** Defines the maximum depth (sub-levels) for your octree. Default value is 2, which means 8 8 8 = 512 blocks :) (This parameter takes precedence over capacity.) */
  maxDepth: Double
  ) = this()
}

/* static members */
@JSImport("babylonjs/Legacy/legacy", "Octree")
@js.native
object Octree extends js.Object {
  /**
    * Adds a mesh into the octree block if it intersects the block
    */
  def CreationFuncForMeshes(
    entry: typings.babylonjs.abstractMeshMod.AbstractMesh,
    block: typings.babylonjs.octreeBlockMod.OctreeBlock[typings.babylonjs.abstractMeshMod.AbstractMesh]
  ): Unit = js.native
  /**
    * Adds a submesh into the octree block if it intersects the block
    */
  def CreationFuncForSubMeshes(
    entry: typings.babylonjs.subMeshMod.SubMesh,
    block: typings.babylonjs.octreeBlockMod.OctreeBlock[typings.babylonjs.subMeshMod.SubMesh]
  ): Unit = js.native
}


package typings.three.mod

import typings.three.geometryMod.MorphTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "AnimationClip")
@js.native
class AnimationClip ()
  extends typings.three.animationClipMod.AnimationClip {
  def this(name: String) = this()
  def this(name: String, duration: Double) = this()
  def this(name: String, duration: Double, tracks: js.Array[typings.three.keyframeTrackMod.KeyframeTrack]) = this()
}

/* static members */
@JSImport("three", "AnimationClip")
@js.native
object AnimationClip extends js.Object {
  def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[typings.three.animationClipMod.AnimationClip] = js.native
  def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): typings.three.animationClipMod.AnimationClip = js.native
  def findByName(clipArray: js.Array[typings.three.animationClipMod.AnimationClip], name: String): typings.three.animationClipMod.AnimationClip = js.native
  def parse(json: js.Any): typings.three.animationClipMod.AnimationClip = js.native
  def parseAnimation(animation: js.Any, bones: js.Array[typings.three.boneMod.Bone], nodeName: String): typings.three.animationClipMod.AnimationClip = js.native
  def toJSON(): js.Any = js.native
}


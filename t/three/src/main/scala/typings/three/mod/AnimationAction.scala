package typings.three.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "AnimationAction")
@js.native
class AnimationAction protected ()
  extends typings.three.animationActionMod.AnimationAction {
  def this(
    mixer: typings.three.animationMixerMod.AnimationMixer,
    clip: typings.three.animationClipMod.AnimationClip
  ) = this()
  def this(
    mixer: typings.three.animationMixerMod.AnimationMixer,
    clip: typings.three.animationClipMod.AnimationClip,
    localRoot: typings.three.object3DMod.Object3D
  ) = this()
}


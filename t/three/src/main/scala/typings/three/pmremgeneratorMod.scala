package typings.three

import typings.three.cubeTextureMod.CubeTexture
import typings.three.sceneMod.Scene
import typings.three.textureMod.Texture
import typings.three.webGLRenderTargetMod.WebGLRenderTarget
import typings.three.webGLRendererMod.WebGLRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/extras/PMREMGenerator", JSImport.Namespace)
@js.native
object pmremgeneratorMod extends js.Object {
  @js.native
  class PMREMGenerator protected () extends js.Object {
    def this(renderer: WebGLRenderer) = this()
    def compileCubemapShader(): Unit = js.native
    def compileEquirectangularShader(): Unit = js.native
    def dispose(): Unit = js.native
    def fromCubemap(cubemap: CubeTexture): WebGLRenderTarget = js.native
    def fromEquirectangular(equirectangular: Texture): WebGLRenderTarget = js.native
    def fromScene(scene: Scene): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: Double): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: Double, near: Double): WebGLRenderTarget = js.native
    def fromScene(scene: Scene, sigma: Double, near: Double, far: Double): WebGLRenderTarget = js.native
  }
  
}


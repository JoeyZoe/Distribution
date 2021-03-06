package typings.three

import typings.std.WebGLRenderingContext
import typings.three.webGLCapabilitiesMod.WebGLCapabilities
import typings.three.webGLExtensionsMod.WebGLExtensions
import typings.three.webGLInfoMod.WebGLInfo
import typings.three.webGLPropertiesMod.WebGLProperties
import typings.three.webGLStateMod.WebGLState
import typings.three.webGLUtilsMod.WebGLUtils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLTextures", JSImport.Namespace)
@js.native
object webGLTexturesMod extends js.Object {
  @js.native
  class WebGLTextures protected () extends js.Object {
    def this(
      gl: WebGLRenderingContext,
      extensions: WebGLExtensions,
      state: WebGLState,
      properties: WebGLProperties,
      capabilities: WebGLCapabilities,
      utils: WebGLUtils,
      info: WebGLInfo
    ) = this()
    def allocateTextureUnit(): Unit = js.native
    def resetTextureUnits(): Unit = js.native
    def safeSetTexture2D(texture: js.Any, slot: Double): Unit = js.native
    def safeSetTextureCube(texture: js.Any, slot: Double): Unit = js.native
    def setTexture2D(texture: js.Any, slot: Double): Unit = js.native
    def setTexture2DArray(texture: js.Any, slot: Double): Unit = js.native
    def setTexture3D(texture: js.Any, slot: Double): Unit = js.native
    def setTextureCube(texture: js.Any, slot: Double): Unit = js.native
    def setTextureCubeDynamic(texture: js.Any, slot: Double): Unit = js.native
    def setupRenderTarget(renderTarget: js.Any): Unit = js.native
    def updateMultisampleRenderTarget(renderTarget: js.Any): Unit = js.native
    def updateRenderTargetMipmap(renderTarget: js.Any): Unit = js.native
  }
  
}


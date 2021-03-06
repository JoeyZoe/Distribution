package typings.babylonjs.materialsIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/index", "HDRCubeTexture")
@js.native
class HDRCubeTexture protected ()
  extends typings.babylonjs.texturesIndexMod.HDRCubeTexture {
  /**
    * Instantiates an HDRTexture from the following parameters.
    *
    * @param url The location of the HDR raw data (Panorama stored in RGBE format)
    * @param scene The scene the texture will be used in
    * @param size The cubemap desired size (the more it increases the longer the generation will be)
    * @param noMipmap Forces to not generate the mipmap if true
    * @param generateHarmonics Specifies whether you want to extract the polynomial harmonics during the generation process
    * @param gammaSpace Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
    * @param reserved Reserved flag for internal use.
    */
  def this(
    url: String,
    scene: Scene,
    size: Double,
    noMipmap: js.UndefOr[Boolean],
    generateHarmonics: js.UndefOr[Boolean],
    gammaSpace: js.UndefOr[Boolean],
    reserved: js.UndefOr[Boolean],
    onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
    onError: js.UndefOr[
        Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
        ]
      ]
  ) = this()
}

/* static members */
@JSImport("babylonjs/Materials/index", "HDRCubeTexture")
@js.native
object HDRCubeTexture extends js.Object {
  var _facesMapping: js.Any = js.native
  /**
    * Parses a JSON representation of an HDR Texture in order to create the texture
    * @param parsedTexture Define the JSON representation
    * @param scene Define the scene the texture should be created in
    * @param rootUrl Define the root url in case we need to load relative dependencies
    * @returns the newly created texture after parsing
    */
  def Parse(parsedTexture: js.Any, scene: Scene, rootUrl: String): Nullable[typings.babylonjs.hdrCubeTextureMod.HDRCubeTexture] = js.native
}


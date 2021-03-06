package typings.babylonjs.BABYLON

import typings.std.ArrayBuffer
import typings.std.EventTarget
import typings.std.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ShaderProcessor")
@js.native
class ShaderProcessor () extends js.Object

/* static members */
@JSGlobal("BABYLON.ShaderProcessor")
@js.native
object ShaderProcessor extends js.Object {
  var _BuildExpression: js.Any = js.native
  var _BuildSubExpression: js.Any = js.native
  var _EvaluatePreProcessors: js.Any = js.native
  var _ExtractOperation: js.Any = js.native
  var _MoveCursor: js.Any = js.native
  var _MoveCursorWithinIf: js.Any = js.native
  var _PreparePreProcessors: js.Any = js.native
  var _ProcessIncludes: js.Any = js.native
  var _ProcessPrecision: js.Any = js.native
  var _ProcessShaderConversion: js.Any = js.native
  def Process(
    sourceCode: String,
    options: ProcessingOptions,
    callback: js.Function1[/* migratedCode */ String, Unit]
  ): Unit = js.native
  /**
    * Loads a file from a url
    * @param url url to load
    * @param onSuccess callback called when the file successfully loads
    * @param onProgress callback called while file is loading (if the server supports this mode)
    * @param offlineProvider defines the offline provider for caching
    * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
    * @param onError callback called when the file fails to load
    * @returns a file request object
    * @hidden
    */
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit]
  ): IFileRequest = js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit]
  ): IFileRequest = js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider
  ): IFileRequest = js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[/* data */ String | ArrayBuffer, /* responseURL */ js.UndefOr[String], Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent[EventTarget], Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[WebRequest], 
      /* exception */ js.UndefOr[LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
}


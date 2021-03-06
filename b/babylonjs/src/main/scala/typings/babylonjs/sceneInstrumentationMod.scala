package typings.babylonjs

import typings.babylonjs.perfCounterMod.PerfCounter
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Instrumentation/sceneInstrumentation", JSImport.Namespace)
@js.native
object sceneInstrumentationMod extends js.Object {
  @js.native
  class SceneInstrumentation protected () extends IDisposable {
    /**
      * Instantiates a new scene instrumentation.
      * This class can be used to get instrumentation data from a Babylon engine
      * @see http://doc.babylonjs.com/how_to/optimizing_your_scene#sceneinstrumentation
      * @param scene Defines the scene to instrument
      */
    def this(/**
      * Defines the scene to instrument
      */
    scene: Scene) = this()
    var _activeMeshesEvaluationTime: js.Any = js.native
    var _animationsTime: js.Any = js.native
    var _cameraRenderTime: js.Any = js.native
    var _captureActiveMeshesEvaluationTime: js.Any = js.native
    var _captureAnimationsTime: js.Any = js.native
    var _captureCameraRenderTime: js.Any = js.native
    var _captureFrameTime: js.Any = js.native
    var _captureInterFrameTime: js.Any = js.native
    var _captureParticlesRenderTime: js.Any = js.native
    var _capturePhysicsTime: js.Any = js.native
    var _captureRenderTargetsRenderTime: js.Any = js.native
    var _captureRenderTime: js.Any = js.native
    var _captureSpritesRenderTime: js.Any = js.native
    var _frameTime: js.Any = js.native
    var _interFrameTime: js.Any = js.native
    var _onAfterActiveMeshesEvaluationObserver: js.Any = js.native
    var _onAfterAnimationsObserver: js.Any = js.native
    var _onAfterCameraRenderObserver: js.Any = js.native
    var _onAfterDrawPhaseObserver: js.Any = js.native
    var _onAfterParticlesRenderingObserver: js.Any = js.native
    var _onAfterPhysicsObserver: js.Any = js.native
    var _onAfterRenderObserver: js.Any = js.native
    var _onAfterRenderTargetsRenderObserver: js.Any = js.native
    var _onAfterSpritesRenderingObserver: js.Any = js.native
    var _onBeforeActiveMeshesEvaluationObserver: js.Any = js.native
    var _onBeforeAnimationsObserver: js.Any = js.native
    var _onBeforeCameraRenderObserver: js.Any = js.native
    var _onBeforeDrawPhaseObserver: js.Any = js.native
    var _onBeforeParticlesRenderingObserver: js.Any = js.native
    var _onBeforePhysicsObserver: js.Any = js.native
    var _onBeforeRenderTargetsRenderObserver: js.Any = js.native
    var _onBeforeSpritesRenderingObserver: js.Any = js.native
    var _particlesRenderTime: js.Any = js.native
    var _physicsTime: js.Any = js.native
    var _renderTargetsRenderTime: js.Any = js.native
    var _renderTime: js.Any = js.native
    var _spritesRenderTime: js.Any = js.native
    /**
      * Defines the scene to instrument
      */
    var scene: Scene = js.native
    /**
      * Gets the perf counter used for active meshes evaluation time
      */
    def activeMeshesEvaluationTimeCounter(): PerfCounter = js.native
    /**
      * Gets the perf counter used for animations time
      */
    def animationsTimeCounter(): PerfCounter = js.native
    /**
      * Gets the perf counter used for camera render time capture
      */
    def cameraRenderTimeCounter(): PerfCounter = js.native
    /**
      * Gets the active meshes evaluation time capture status
      */
    def captureActiveMeshesEvaluationTime(): Boolean = js.native
    /**
      * Enable or disable the active meshes evaluation time capture
      */
    def captureActiveMeshesEvaluationTime(value: Boolean): js.Any = js.native
    /**
      * Gets the animations time capture status
      */
    def captureAnimationsTime(): Boolean = js.native
    /**
      * Enable or disable the animations time capture
      */
    def captureAnimationsTime(value: Boolean): js.Any = js.native
    /**
      * Gets the camera render time capture status
      */
    def captureCameraRenderTime(): Boolean = js.native
    /**
      * Enable or disable the camera render time capture
      */
    def captureCameraRenderTime(value: Boolean): js.Any = js.native
    /**
      * Gets the frame time capture status
      */
    def captureFrameTime(): Boolean = js.native
    /**
      * Enable or disable the frame time capture
      */
    def captureFrameTime(value: Boolean): js.Any = js.native
    /**
      * Gets the inter-frames time capture status
      */
    def captureInterFrameTime(): Boolean = js.native
    /**
      * Enable or disable the inter-frames time capture
      */
    def captureInterFrameTime(value: Boolean): js.Any = js.native
    /**
      * Gets the particles render time capture status
      */
    def captureParticlesRenderTime(): Boolean = js.native
    /**
      * Enable or disable the particles render time capture
      */
    def captureParticlesRenderTime(value: Boolean): js.Any = js.native
    /**
      * Gets the physics time capture status
      */
    def capturePhysicsTime(): Boolean = js.native
    /**
      * Enable or disable the physics time capture
      */
    def capturePhysicsTime(value: Boolean): js.Any = js.native
    /**
      * Gets the render targets render time capture status
      */
    def captureRenderTargetsRenderTime(): Boolean = js.native
    /**
      * Enable or disable the render targets render time capture
      */
    def captureRenderTargetsRenderTime(value: Boolean): js.Any = js.native
    /**
      * Gets the render time capture status
      */
    def captureRenderTime(): Boolean = js.native
    /**
      * Enable or disable the render time capture
      */
    def captureRenderTime(value: Boolean): js.Any = js.native
    /**
      * Gets the sprites render time capture status
      */
    def captureSpritesRenderTime(): Boolean = js.native
    /**
      * Enable or disable the sprites render time capture
      */
    def captureSpritesRenderTime(value: Boolean): js.Any = js.native
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /**
      * Gets the perf counter used for draw calls
      */
    def drawCallsCounter(): PerfCounter = js.native
    /**
      * Gets the perf counter used for frame time capture
      */
    def frameTimeCounter(): PerfCounter = js.native
    /**
      * Gets the perf counter used for inter-frames time capture
      */
    def interFrameTimeCounter(): PerfCounter = js.native
    /**
      * Gets the perf counter used for particles render time
      */
    def particlesRenderTimeCounter(): PerfCounter = js.native
    /**
      * Gets the perf counter used for physics time
      */
    def physicsTimeCounter(): PerfCounter = js.native
    /**
      * Gets the perf counter used for render targets render time
      */
    def renderTargetsRenderTimeCounter(): PerfCounter = js.native
    /**
      * Gets the perf counter used for render time capture
      */
    def renderTimeCounter(): PerfCounter = js.native
    /**
      * Gets the perf counter used for sprites render time
      */
    def spritesRenderTimeCounter(): PerfCounter = js.native
  }
  
}


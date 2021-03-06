package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.InputBlock")
@js.native
class InputBlock protected () extends NodeMaterialBlock {
  /**
    * Creates a new InputBlock
    * @param name defines the block name
    * @param target defines the target of that block (Vertex by default)
    * @param type defines the type of the input (can be set to NodeMaterialBlockConnectionPointTypes.AutoDetect)
    */
  def this(name: String) = this()
  def this(name: String, target: NodeMaterialBlockTargets) = this()
  def this(name: String, target: NodeMaterialBlockTargets, `type`: NodeMaterialBlockConnectionPointTypes) = this()
  var _animationType: js.Any = js.native
  var _associatedVariableName: js.Any = js.native
  var _emit: js.Any = js.native
  var _emitConstant: js.Any = js.native
  var _emitDefine: js.Any = js.native
  var _mode: js.Any = js.native
  var _storedValue: js.Any = js.native
  /** @hidden */
  var _systemValue: Nullable[NodeMaterialSystemValues] = js.native
  var _type: js.Any = js.native
  var _valueCallback: js.Any = js.native
  /** Gets or sets the group to use to display this block in the Inspector */
  var groupInInspector: String = js.native
  /** Gets or set a value indicating that this input can only get 0 and 1 values */
  var isBoolean: Boolean = js.native
  /** Gets or sets a boolean indicating that the value of this input will not change after a build */
  var isConstant: Boolean = js.native
  /** Gets or sets a value used by the Node Material editor to determine how to configure the current value if it is a matrix */
  var matrixMode: Double = js.native
  /** Gets or set a value used to limit the range of float values */
  var max: Double = js.native
  /** Gets or set a value used to limit the range of float values */
  var min: Double = js.native
  /** Gets an observable raised when the value is changed */
  var onValueChangedObservable: Observable[InputBlock] = js.native
  /** Gets or sets a boolean indicating that this input can be edited in the Inspector (false by default) */
  var visibleInInspector: Boolean = js.native
  /** @hidden */
  def _transmit(effect: Effect, scene: Scene): Unit = js.native
  /** @hidden */
  def _transmitWorld(effect: Effect, world: Matrix, worldView: Matrix, worldViewProjection: Matrix): Unit = js.native
  /**
    * Animate the input if animationType !== None
    * @param scene defines the rendering scene
    */
  def animate(scene: Scene): Unit = js.native
  /** Gets or sets the type of animation applied to the input */
  def animationType(): AnimatedInputBlockTypes = js.native
  def animationType(value: AnimatedInputBlockTypes): js.Any = js.native
  /**
    * Gets or sets the associated variable name in the shader
    */
  def associatedVariableName(): String = js.native
  def associatedVariableName(value: String): js.Any = js.native
  /**
    * Gets or sets a boolean indicating that this connection point is coming from an attribute.
    * In this case the connection point name must be the name of the attribute to use
    * Can only be set on inputs
    */
  def isAttribute(): Boolean = js.native
  def isAttribute(value: Boolean): js.Any = js.native
  /**
    * Gets a boolean indicating that the current connection point is a system value
    */
  def isSystemValue(): Boolean = js.native
  /**
    * Gets a boolean indicating that this connection point not defined yet
    */
  def isUndefined(): Boolean = js.native
  /**
    * Gets or sets a boolean indicating that this connection point is coming from an uniform.
    * In this case the connection point name must be the name of the uniform to use.
    * Can only be set on inputs
    */
  def isUniform(): Boolean = js.native
  def isUniform(value: Boolean): js.Any = js.native
  /**
    * Gets or sets a boolean indicating that this connection point is generating a varying variable.
    * Can only be set on exit points
    */
  def isVarying(): Boolean = js.native
  def isVarying(value: Boolean): js.Any = js.native
  /**
    * Gets the output component
    */
  def output(): NodeMaterialConnectionPoint = js.native
  /**
    * Set the source of this connection point to a vertex attribute
    * @param attributeName defines the attribute name (position, uv, normal, etc...). If not specified it will take the connection point name
    * @returns the current connection point
    */
  def setAsAttribute(): InputBlock = js.native
  def setAsAttribute(attributeName: String): InputBlock = js.native
  /**
    * Set the source of this connection point to a system value
    * @param value define the system value to use (world, view, etc...) or null to switch to manual value
    * @returns the current connection point
    */
  def setAsSystemValue(value: Nullable[NodeMaterialSystemValues]): InputBlock = js.native
  /**
    * Set the input block to its default value (based on its type)
    */
  def setDefaultValue(): Unit = js.native
  /**
    * Gets or sets the current well known value or null if not defined as a system value
    */
  def systemValue(): Nullable[NodeMaterialSystemValues] = js.native
  def systemValue(value: Nullable[NodeMaterialSystemValues]): js.Any = js.native
  /**
    * Gets or sets the connection point type (default is float)
    */
  def `type`(): NodeMaterialBlockConnectionPointTypes = js.native
  /**
    * Gets or sets the value of that point.
    * Please note that this value will be ignored if valueCallback is defined
    */
  def value(): js.Any = js.native
  def value(value: js.Any): js.Any = js.native
  /**
    * Gets or sets a callback used to get the value of that point.
    * Please note that setting this value will force the connection point to ignore the value property
    */
  def valueCallback(): js.Function0[_] = js.native
  def valueCallback(value: js.Function0[_]): js.Any = js.native
}


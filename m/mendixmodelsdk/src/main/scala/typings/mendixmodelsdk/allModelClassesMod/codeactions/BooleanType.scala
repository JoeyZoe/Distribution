package typings.mendixmodelsdk.allModelClassesMod.codeactions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.BooleanType")
@js.native
class BooleanType protected ()
  extends typings.mendixmodelsdk.codeactionsMod.codeactions.BooleanType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.BooleanType")
@js.native
object BooleanType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BooleanType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.codeactionsMod.codeactions.BooleanType = js.native
  /**
    * Creates and returns a new BooleanType instance in the SDK and on the server.
    * The new BooleanType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicParameterTypeUnderType(container: typings.mendixmodelsdk.codeactionsMod.codeactions.BasicParameterType): typings.mendixmodelsdk.codeactionsMod.codeactions.BooleanType = js.native
  /**
    * Creates and returns a new BooleanType instance in the SDK and on the server.
    * The new BooleanType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInCodeActionUnderActionReturnType(container: typings.mendixmodelsdk.codeactionsMod.codeactions.CodeAction): typings.mendixmodelsdk.codeactionsMod.codeactions.BooleanType = js.native
}


package typings.mendixmodelsdk.allModelClassesMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.HashedStringAttributeType")
@js.native
class HashedStringAttributeType protected ()
  extends typings.mendixmodelsdk.domainmodelsMod.domainmodels.HashedStringAttributeType {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.HashedStringAttributeType")
@js.native
object HashedStringAttributeType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new HashedStringAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.domainmodelsMod.domainmodels.HashedStringAttributeType = js.native
  /**
    * Creates and returns a new HashedStringAttributeType instance in the SDK and on the server.
    * The new HashedStringAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute): typings.mendixmodelsdk.domainmodelsMod.domainmodels.HashedStringAttributeType = js.native
}


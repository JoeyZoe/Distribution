package typings.mendixmodelsdk.allModelClassesMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.CustomRange")
@js.native
class CustomRange protected ()
  extends typings.mendixmodelsdk.microflowsMod.microflows.CustomRange {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.CustomRange")
@js.native
object CustomRange extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CustomRange instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.CustomRange = js.native
  /**
    * Creates and returns a new CustomRange instance in the SDK and on the server.
    * The new CustomRange will be automatically stored in the 'range' property
    * of the parent DatabaseRetrieveSource element passed as argument.
    */
  def createInDatabaseRetrieveSourceUnderRange(container: typings.mendixmodelsdk.microflowsMod.microflows.DatabaseRetrieveSource): typings.mendixmodelsdk.microflowsMod.microflows.CustomRange = js.native
  /**
    * Creates and returns a new CustomRange instance in the SDK and on the server.
    * The new CustomRange will be automatically stored in the 'range' property
    * of the parent ImportMappingCall element passed as argument.
    */
  def createInImportMappingCallUnderRange(container: typings.mendixmodelsdk.microflowsMod.microflows.ImportMappingCall): typings.mendixmodelsdk.microflowsMod.microflows.CustomRange = js.native
}


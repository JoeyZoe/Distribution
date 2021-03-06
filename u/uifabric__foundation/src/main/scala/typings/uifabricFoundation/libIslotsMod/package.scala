package typings.uifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIslotsMod {
  type ExtractProps[TUnion] = js.Any
  type ExtractShorthand[TUnion] = java.lang.String | scala.Double | scala.Boolean
  type ISlotDefinition[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ slot in keyof TSlots ]: react.react.ElementType<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[slot]>>}
    */ typings.uifabricFoundation.uifabricFoundationStrings.ISlotDefinition with TSlots
  type ISlotFactory[TProps /* <: typings.uifabricFoundation.libIslotsMod.ValidProps */, TShorthandProp /* <: typings.uifabricFoundation.libIslotsMod.ValidShorthand */] = js.Function4[
    /* componentProps */ TProps with typings.uifabricFoundation.libIslotsMod.IProcessedSlotProps, 
    /* userProps */ typings.uifabricFoundation.libIslotsMod.ISlotProp[TProps, TShorthandProp], 
    /* slotOptions */ js.UndefOr[typings.uifabricFoundation.libIslotsMod.ISlotOptions[TProps]], 
    /* defaultStyles */ typings.uifabricMergeStyles.istyleMod.IStyle, 
    typings.std.ReturnType[typings.react.mod.FunctionComponent[TProps]]
  ]
  type ISlotProp[TProps /* <: typings.uifabricFoundation.libIslotsMod.ValidProps */, TShorthandProp /* <: typings.uifabricFoundation.libIslotsMod.ValidShorthand */] = TShorthandProp | TProps
  type ISlotRender[TProps] = js.Function2[
    /* props */ typings.react.mod.PropsWithChildren[TProps], 
    /* defaultComponent */ typings.react.mod.ComponentType[TProps], 
    typings.std.ReturnType[typings.react.mod.FunctionComponent[TProps]]
  ]
  type ISlots[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ slot in keyof TSlots ]: @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlot<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[slot]>>}
    */ typings.uifabricFoundation.uifabricFoundationStrings.ISlots with TSlots
  type ISlottableComponentType[TProps /* <: typings.uifabricFoundation.libIslotsMod.ValidProps */, TShorthandProp /* <: typings.uifabricFoundation.libIslotsMod.ValidShorthand */] = typings.react.mod.ComponentType[TProps] with (typings.uifabricFoundation.libIslotsMod.ISlotCreator[TProps, TShorthandProp])
  type ISlottableProps[TSlots] = TSlots with typings.uifabricFoundation.AnonSlots[TSlots]
  type ISlottableReactType[TProps /* <: typings.uifabricFoundation.libIslotsMod.ValidProps */, TShorthandProp /* <: typings.uifabricFoundation.libIslotsMod.ValidShorthand */] = typings.react.mod.ElementType[TProps] with (typings.uifabricFoundation.libIslotsMod.ISlotCreator[TProps, TShorthandProp])
  type ValidProps = js.Object
  type ValidShorthand = java.lang.String | scala.Double | scala.Boolean
}

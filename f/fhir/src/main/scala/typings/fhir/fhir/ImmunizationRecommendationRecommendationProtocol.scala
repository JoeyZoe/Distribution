package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Protocol used by recommendation
  */
trait ImmunizationRecommendationRecommendationProtocol extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'doseSequence'.
    */
  var _doseSequence: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'series'.
    */
  var _series: js.UndefOr[Element] = js.undefined
  /**
    * Who is responsible for protocol
    */
  var authority: js.UndefOr[Reference] = js.undefined
  /**
    * Protocol details
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Dose number within sequence
    */
  var doseSequence: js.UndefOr[positiveInt] = js.undefined
  /**
    * Name of vaccination series
    */
  var series: js.UndefOr[String] = js.undefined
}

object ImmunizationRecommendationRecommendationProtocol {
  @scala.inline
  def apply(
    _description: Element = null,
    _doseSequence: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _series: Element = null,
    authority: Reference = null,
    description: String = null,
    doseSequence: Int | Double = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    series: String = null
  ): ImmunizationRecommendationRecommendationProtocol = {
    val __obj = js.Dynamic.literal()
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_doseSequence != null) __obj.updateDynamic("_doseSequence")(_doseSequence.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_series != null) __obj.updateDynamic("_series")(_series.asInstanceOf[js.Any])
    if (authority != null) __obj.updateDynamic("authority")(authority.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (doseSequence != null) __obj.updateDynamic("doseSequence")(doseSequence.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationRecommendationRecommendationProtocol]
  }
}


package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelFilterCondition extends js.Object

/**
  *
  * Enum representing all accepted conditions by which a label filter can be applied.
  Used to configure the type of PivotFilter that is applied to the field.
  `PivotFilter.criteria.exclusive` can be set to true to invert many of these conditions.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.LabelFilterCondition")
@js.native
object LabelFilterCondition extends js.Object {
  /**
    * Label begins with substring criterion.
    
    Required Criteria: {`substring`}.
    Optional Criteria: {`exclusive`}.
    *
    */
  @js.native
  sealed trait beginsWith extends LabelFilterCondition
  
  /**
    * Between `lowerBound` and `upperBound` criteria.
    
    Required Criteria: {`lowerBound`, `upperBound`}.
    Optional Criteria: {`exclusive`}.
    *
    */
  @js.native
  sealed trait between extends LabelFilterCondition
  
  /**
    * Label contains substring criterion.
    
    Required Criteria: {`substring`}.
    Optional Criteria: {`exclusive`}.
    *
    */
  @js.native
  sealed trait contains extends LabelFilterCondition
  
  /**
    * Label ends with substring criterion.
    
    Required Criteria: {`substring`}.
    Optional Criteria: {`exclusive`}.
    *
    */
  @js.native
  sealed trait endsWith extends LabelFilterCondition
  
  /**
    * Equals comparator criterion.
    
    Required Criteria: {`comparator`}.
    Optional Criteria: {`exclusive`}.
    *
    */
  @js.native
  sealed trait equals extends LabelFilterCondition
  
  /**
    * Greater than comparator criterion.
    
    Required Criteria: {`comparator`}.
    *
    */
  @js.native
  sealed trait greaterThan extends LabelFilterCondition
  
  /**
    * Greater than or equal to comparator criterion.
    
    Required Criteria: {`comparator`}.
    *
    */
  @js.native
  sealed trait greaterThanOrEqualTo extends LabelFilterCondition
  
  /**
    * Less than comparator criterion.
    
    Required Criteria: {`comparator`}.
    *
    */
  @js.native
  sealed trait lessThan extends LabelFilterCondition
  
  /**
    * Less than or equal to comparator criterion.
    
    Required Criteria: {`comparator`}.
    *
    */
  @js.native
  sealed trait lessThanOrEqualTo extends LabelFilterCondition
  
  /**
    * LabelFilterCondition is unknown or unsupported.
    *
    */
  @js.native
  sealed trait unknown extends LabelFilterCondition
  
  /* "Equals" */ @JSName("equals")
  val equals_ : equals with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LabelFilterCondition with String] = js.native
  /* "BeginsWith" */ @js.native
  object beginsWith extends TopLevel[beginsWith with String]
  
  /* "Between" */ @js.native
  object between extends TopLevel[between with String]
  
  /* "Contains" */ @js.native
  object contains extends TopLevel[contains with String]
  
  /* "EndsWith" */ @js.native
  object endsWith extends TopLevel[endsWith with String]
  
  /* "GreaterThan" */ @js.native
  object greaterThan extends TopLevel[greaterThan with String]
  
  /* "GreaterThanOrEqualTo" */ @js.native
  object greaterThanOrEqualTo extends TopLevel[greaterThanOrEqualTo with String]
  
  /* "LessThan" */ @js.native
  object lessThan extends TopLevel[lessThan with String]
  
  /* "LessThanOrEqualTo" */ @js.native
  object lessThanOrEqualTo extends TopLevel[lessThanOrEqualTo with String]
  
  /* "Unknown" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
}


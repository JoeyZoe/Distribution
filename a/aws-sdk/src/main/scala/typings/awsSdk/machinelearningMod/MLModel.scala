package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MLModel extends js.Object {
  /**
    * The algorithm used to train the MLModel. The following algorithm is supported:   SGD -- Stochastic gradient descent. The goal of SGD is to minimize the gradient of the loss function.  
    */
  var Algorithm: js.UndefOr[typings.awsSdk.machinelearningMod.Algorithm] = js.native
  var ComputeTime: js.UndefOr[LongType] = js.native
  /**
    * The time that the MLModel was created. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The AWS user account from which the MLModel was created. The account type can be either an AWS root account or an AWS Identity and Access Management (IAM) user account.
    */
  var CreatedByIamUser: js.UndefOr[AwsUserArn] = js.native
  /**
    * The current endpoint of the MLModel.
    */
  var EndpointInfo: js.UndefOr[RealtimeEndpointInfo] = js.native
  var FinishedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The location of the data file or directory in Amazon Simple Storage Service (Amazon S3).
    */
  var InputDataLocationS3: js.UndefOr[S3Url] = js.native
  /**
    * The time of the most recent edit to the MLModel. The time is expressed in epoch time.
    */
  var LastUpdatedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The ID assigned to the MLModel at creation.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
  /**
    * Identifies the MLModel category. The following are the available types:   REGRESSION - Produces a numeric result. For example, "What price should a house be listed at?"  BINARY - Produces one of two possible results. For example, "Is this a child-friendly web site?".  MULTICLASS - Produces one of several possible results. For example, "Is this a HIGH-, LOW-, or MEDIUM-risk trade?". 
    */
  var MLModelType: js.UndefOr[typings.awsSdk.machinelearningMod.MLModelType] = js.native
  /**
    * A description of the most recent details about accessing the MLModel.
    */
  var Message: js.UndefOr[typings.awsSdk.machinelearningMod.Message] = js.native
  /**
    * A user-supplied name or description of the MLModel.
    */
  var Name: js.UndefOr[MLModelName] = js.native
  var ScoreThreshold: js.UndefOr[typings.awsSdk.machinelearningMod.ScoreThreshold] = js.native
  /**
    * The time of the most recent edit to the ScoreThreshold. The time is expressed in epoch time.
    */
  var ScoreThresholdLastUpdatedAt: js.UndefOr[EpochTime] = js.native
  var SizeInBytes: js.UndefOr[LongType] = js.native
  var StartedAt: js.UndefOr[EpochTime] = js.native
  /**
    * The current status of an MLModel. This element can have one of the following values:    PENDING - Amazon Machine Learning (Amazon ML) submitted a request to create an MLModel.  INPROGRESS - The creation process is underway.  FAILED - The request to create an MLModel didn't run to completion. The model isn't usable.  COMPLETED - The creation process completed successfully.  DELETED - The MLModel is marked as deleted. It isn't usable. 
    */
  var Status: js.UndefOr[EntityStatus] = js.native
  /**
    * The ID of the training DataSource. The CreateMLModel operation uses the TrainingDataSourceId.
    */
  var TrainingDataSourceId: js.UndefOr[EntityId] = js.native
  /**
    * A list of the training parameters in the MLModel. The list is implemented as a map of key-value pairs. The following is the current set of training parameters:    sgd.maxMLModelSizeInBytes - The maximum allowed size of the model. Depending on the input data, the size of the model might affect its performance.  The value is an integer that ranges from 100000 to 2147483648. The default value is 33554432.  sgd.maxPasses - The number of times that the training process traverses the observations to build the MLModel. The value is an integer that ranges from 1 to 10000. The default value is 10. sgd.shuffleType - Whether Amazon ML shuffles the training data. Shuffling the data improves a model's ability to find the optimal solution for a variety of data types. The valid values are auto and none. The default value is none.  sgd.l1RegularizationAmount - The coefficient regularization L1 norm, which controls overfitting the data by penalizing large coefficients. This parameter tends to drive coefficients to zero, resulting in sparse feature set. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L1 normalization. This parameter can't be used when L2 is specified. Use this parameter sparingly.   sgd.l2RegularizationAmount - The coefficient regularization L2 norm, which controls overfitting the data by penalizing large coefficients. This tends to drive coefficients to small, nonzero values. If you use this parameter, start by specifying a small value, such as 1.0E-08. The value is a double that ranges from 0 to MAX_DOUBLE. The default is to not use L2 normalization. This parameter can't be used when L1 is specified. Use this parameter sparingly.  
    */
  var TrainingParameters: js.UndefOr[typings.awsSdk.machinelearningMod.TrainingParameters] = js.native
}

object MLModel {
  @scala.inline
  def apply(
    Algorithm: Algorithm = null,
    ComputeTime: Int | Double = null,
    CreatedAt: EpochTime = null,
    CreatedByIamUser: AwsUserArn = null,
    EndpointInfo: RealtimeEndpointInfo = null,
    FinishedAt: EpochTime = null,
    InputDataLocationS3: S3Url = null,
    LastUpdatedAt: EpochTime = null,
    MLModelId: EntityId = null,
    MLModelType: MLModelType = null,
    Message: Message = null,
    Name: MLModelName = null,
    ScoreThreshold: Int | Double = null,
    ScoreThresholdLastUpdatedAt: EpochTime = null,
    SizeInBytes: Int | Double = null,
    StartedAt: EpochTime = null,
    Status: EntityStatus = null,
    TrainingDataSourceId: EntityId = null,
    TrainingParameters: TrainingParameters = null
  ): MLModel = {
    val __obj = js.Dynamic.literal()
    if (Algorithm != null) __obj.updateDynamic("Algorithm")(Algorithm.asInstanceOf[js.Any])
    if (ComputeTime != null) __obj.updateDynamic("ComputeTime")(ComputeTime.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (CreatedByIamUser != null) __obj.updateDynamic("CreatedByIamUser")(CreatedByIamUser.asInstanceOf[js.Any])
    if (EndpointInfo != null) __obj.updateDynamic("EndpointInfo")(EndpointInfo.asInstanceOf[js.Any])
    if (FinishedAt != null) __obj.updateDynamic("FinishedAt")(FinishedAt.asInstanceOf[js.Any])
    if (InputDataLocationS3 != null) __obj.updateDynamic("InputDataLocationS3")(InputDataLocationS3.asInstanceOf[js.Any])
    if (LastUpdatedAt != null) __obj.updateDynamic("LastUpdatedAt")(LastUpdatedAt.asInstanceOf[js.Any])
    if (MLModelId != null) __obj.updateDynamic("MLModelId")(MLModelId.asInstanceOf[js.Any])
    if (MLModelType != null) __obj.updateDynamic("MLModelType")(MLModelType.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ScoreThreshold != null) __obj.updateDynamic("ScoreThreshold")(ScoreThreshold.asInstanceOf[js.Any])
    if (ScoreThresholdLastUpdatedAt != null) __obj.updateDynamic("ScoreThresholdLastUpdatedAt")(ScoreThresholdLastUpdatedAt.asInstanceOf[js.Any])
    if (SizeInBytes != null) __obj.updateDynamic("SizeInBytes")(SizeInBytes.asInstanceOf[js.Any])
    if (StartedAt != null) __obj.updateDynamic("StartedAt")(StartedAt.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TrainingDataSourceId != null) __obj.updateDynamic("TrainingDataSourceId")(TrainingDataSourceId.asInstanceOf[js.Any])
    if (TrainingParameters != null) __obj.updateDynamic("TrainingParameters")(TrainingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MLModel]
  }
}


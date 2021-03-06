package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object glueMod {
  type ActionList = js.Array[typings.awsSdk.glueMod.Action]
  type AttemptCount = scala.Double
  type BatchDeletePartitionValueList = js.Array[typings.awsSdk.glueMod.PartitionValueList]
  type BatchDeleteTableNameList = js.Array[typings.awsSdk.glueMod.NameString]
  type BatchDeleteTableVersionList = js.Array[typings.awsSdk.glueMod.VersionString]
  type BatchGetPartitionValueList = js.Array[typings.awsSdk.glueMod.PartitionValueList]
  type BatchStopJobRunErrorList = js.Array[typings.awsSdk.glueMod.BatchStopJobRunError]
  type BatchStopJobRunJobRunIdList = js.Array[typings.awsSdk.glueMod.IdString]
  type BatchStopJobRunSuccessfulSubmissionList = js.Array[typings.awsSdk.glueMod.BatchStopJobRunSuccessfulSubmission]
  type Boolean = scala.Boolean
  type BooleanNullable = scala.Boolean
  type BooleanValue = scala.Boolean
  type BoundedPartitionValueList = js.Array[typings.awsSdk.glueMod.ValueString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.`SSE-KMS`
    - java.lang.String
  */
  type CatalogEncryptionMode = typings.awsSdk.glueMod._CatalogEncryptionMode | java.lang.String
  type CatalogEntries = js.Array[typings.awsSdk.glueMod.CatalogEntry]
  type CatalogIdString = java.lang.String
  type CatalogTablesList = js.Array[typings.awsSdk.glueMod.NameString]
  type CatalogTargetList = js.Array[typings.awsSdk.glueMod.CatalogTarget]
  type Classification = java.lang.String
  type ClassifierList = js.Array[typings.awsSdk.glueMod.Classifier]
  type ClassifierNameList = js.Array[typings.awsSdk.glueMod.NameString]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.glueMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.`SSE-KMS`
    - java.lang.String
  */
  type CloudWatchEncryptionMode = typings.awsSdk.glueMod._CloudWatchEncryptionMode | java.lang.String
  type CodeGenArgName = java.lang.String
  type CodeGenArgValue = java.lang.String
  type CodeGenIdentifier = java.lang.String
  type CodeGenNodeArgs = js.Array[typings.awsSdk.glueMod.CodeGenNodeArg]
  type CodeGenNodeType = java.lang.String
  type ColumnList = js.Array[typings.awsSdk.glueMod.Column]
  type ColumnNameString = java.lang.String
  type ColumnTypeString = java.lang.String
  type ColumnValueStringList = js.Array[typings.awsSdk.glueMod.ColumnValuesString]
  type ColumnValuesString = java.lang.String
  type CommentString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EQUALS
    - typings.awsSdk.awsSdkStrings.GREATER_THAN
    - typings.awsSdk.awsSdkStrings.LESS_THAN
    - typings.awsSdk.awsSdkStrings.GREATER_THAN_EQUALS
    - typings.awsSdk.awsSdkStrings.LESS_THAN_EQUALS
    - java.lang.String
  */
  type Comparator = typings.awsSdk.glueMod._Comparator | java.lang.String
  type ConditionList = js.Array[typings.awsSdk.glueMod.Condition]
  type ConnectionList = js.Array[typings.awsSdk.glueMod.Connection]
  type ConnectionName = java.lang.String
  type ConnectionProperties = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.glueMod.ValueString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HOST
    - typings.awsSdk.awsSdkStrings.PORT
    - typings.awsSdk.awsSdkStrings.USERNAME
    - typings.awsSdk.awsSdkStrings.PASSWORD
    - typings.awsSdk.awsSdkStrings.ENCRYPTED_PASSWORD
    - typings.awsSdk.awsSdkStrings.JDBC_DRIVER_JAR_URI
    - typings.awsSdk.awsSdkStrings.JDBC_DRIVER_CLASS_NAME
    - typings.awsSdk.awsSdkStrings.JDBC_ENGINE
    - typings.awsSdk.awsSdkStrings.JDBC_ENGINE_VERSION
    - typings.awsSdk.awsSdkStrings.CONFIG_FILES
    - typings.awsSdk.awsSdkStrings.INSTANCE_ID
    - typings.awsSdk.awsSdkStrings.JDBC_CONNECTION_URL
    - typings.awsSdk.awsSdkStrings.JDBC_ENFORCE_SSL
    - typings.awsSdk.awsSdkStrings.CUSTOM_JDBC_CERT
    - typings.awsSdk.awsSdkStrings.SKIP_CUSTOM_JDBC_CERT_VALIDATION
    - typings.awsSdk.awsSdkStrings.CUSTOM_JDBC_CERT_STRING
    - typings.awsSdk.awsSdkStrings.CONNECTION_URL
    - java.lang.String
  */
  type ConnectionPropertyKey = typings.awsSdk.glueMod._ConnectionPropertyKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.JDBC
    - typings.awsSdk.awsSdkStrings.SFTP
    - typings.awsSdk.awsSdkStrings.MONGODB
    - java.lang.String
  */
  type ConnectionType = typings.awsSdk.glueMod._ConnectionType | java.lang.String
  type CrawlList = js.Array[typings.awsSdk.glueMod.Crawl]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CrawlState = typings.awsSdk.glueMod._CrawlState | java.lang.String
  type CrawlerConfiguration = java.lang.String
  type CrawlerList = js.Array[typings.awsSdk.glueMod.Crawler]
  type CrawlerMetricsList = js.Array[typings.awsSdk.glueMod.CrawlerMetrics]
  type CrawlerNameList = js.Array[typings.awsSdk.glueMod.NameString]
  type CrawlerSecurityConfiguration = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.READY
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.STOPPING
    - java.lang.String
  */
  type CrawlerState = typings.awsSdk.glueMod._CrawlerState | java.lang.String
  type CronExpression = java.lang.String
  type CsvColumnDelimiter = java.lang.String
  type CsvHeader = js.Array[typings.awsSdk.glueMod.NameString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UNKNOWN
    - typings.awsSdk.awsSdkStrings.PRESENT
    - typings.awsSdk.awsSdkStrings.ABSENT
    - java.lang.String
  */
  type CsvHeaderOption = typings.awsSdk.glueMod._CsvHeaderOption | java.lang.String
  type CsvQuoteSymbol = java.lang.String
  type CustomPatterns = java.lang.String
  type DagEdges = js.Array[typings.awsSdk.glueMod.CodeGenEdge]
  type DagNodes = js.Array[typings.awsSdk.glueMod.CodeGenNode]
  type DataLakePrincipalString = java.lang.String
  type DatabaseList = js.Array[typings.awsSdk.glueMod.Database]
  type DatabaseName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LOG
    - typings.awsSdk.awsSdkStrings.DELETE_FROM_DATABASE
    - typings.awsSdk.awsSdkStrings.DEPRECATE_IN_DATABASE
    - java.lang.String
  */
  type DeleteBehavior = typings.awsSdk.glueMod._DeleteBehavior | java.lang.String
  type DeleteConnectionNameList = js.Array[typings.awsSdk.glueMod.NameString]
  type DescriptionString = java.lang.String
  type DescriptionStringRemovable = java.lang.String
  type DevEndpointList = js.Array[typings.awsSdk.glueMod.DevEndpoint]
  type DevEndpointNameList = js.Array[typings.awsSdk.glueMod.NameString]
  type DevEndpointNames = js.Array[typings.awsSdk.glueMod.GenericString]
  type DynamoDBTargetList = js.Array[typings.awsSdk.glueMod.DynamoDBTarget]
  type EdgeList = js.Array[typings.awsSdk.glueMod.Edge]
  type ErrorByName = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.glueMod.ErrorDetail]
  type ErrorString = java.lang.String
  type ExecutionTime = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MUST_EXIST
    - typings.awsSdk.awsSdkStrings.NOT_EXIST
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ExistCondition = typings.awsSdk.glueMod._ExistCondition | java.lang.String
  type FieldType = java.lang.String
  type FilterString = java.lang.String
  type FormatString = java.lang.String
  type GenericBoundedDouble = scala.Double
  type GenericMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.glueMod.GenericString]
  type GenericString = java.lang.String
  type GetTableVersionsList = js.Array[typings.awsSdk.glueMod.TableVersion]
  type GlueResourceArn = java.lang.String
  type GlueTables = js.Array[typings.awsSdk.glueMod.GlueTable]
  type GlueVersionString = java.lang.String
  type GrokPattern = java.lang.String
  type HashString = java.lang.String
  type IdString = java.lang.String
  type Integer = scala.Double
  type IntegerFlag = scala.Double
  type IntegerValue = scala.Double
  type JdbcTargetList = js.Array[typings.awsSdk.glueMod.JdbcTarget]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.`CSE-KMS`
    - java.lang.String
  */
  type JobBookmarksEncryptionMode = typings.awsSdk.glueMod._JobBookmarksEncryptionMode | java.lang.String
  type JobList = js.Array[typings.awsSdk.glueMod.Job]
  type JobName = java.lang.String
  type JobNameList = js.Array[typings.awsSdk.glueMod.NameString]
  type JobRunList = js.Array[typings.awsSdk.glueMod.JobRun]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STARTING
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.STOPPING
    - typings.awsSdk.awsSdkStrings.STOPPED
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.TIMEOUT
    - java.lang.String
  */
  type JobRunState = typings.awsSdk.glueMod._JobRunState | java.lang.String
  type JsonPath = java.lang.String
  type JsonValue = java.lang.String
  type KeyString = java.lang.String
  type KmsKeyArn = java.lang.String
  type LabelCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PYTHON
    - typings.awsSdk.awsSdkStrings.SCALA
    - java.lang.String
  */
  type Language = typings.awsSdk.glueMod._Language | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type LastCrawlStatus = typings.awsSdk.glueMod._LastCrawlStatus | java.lang.String
  type LocationMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.glueMod.ColumnValuesString]
  type LocationString = java.lang.String
  type LogGroup = java.lang.String
  type LogStream = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AND
    - typings.awsSdk.awsSdkStrings.ANY
    - java.lang.String
  */
  type Logical = typings.awsSdk.glueMod._Logical | java.lang.String
  type LogicalOperator = typings.awsSdk.awsSdkStrings.EQUALS | java.lang.String
  type MapValue = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.glueMod.GenericString]
  type MappingList = js.Array[typings.awsSdk.glueMod.MappingEntry]
  type MatchCriteria = js.Array[typings.awsSdk.glueMod.NameString]
  type MaxConcurrentRuns = scala.Double
  type MaxRetries = scala.Double
  type MessagePrefix = java.lang.String
  type MillisecondsCount = scala.Double
  type NameString = java.lang.String
  type NameStringList = js.Array[typings.awsSdk.glueMod.NameString]
  type NodeList = js.Array[typings.awsSdk.glueMod.Node]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CRAWLER
    - typings.awsSdk.awsSdkStrings.JOB
    - typings.awsSdk.awsSdkStrings.TRIGGER
    - java.lang.String
  */
  type NodeType = typings.awsSdk.glueMod._NodeType | java.lang.String
  type NonNegativeDouble = scala.Double
  type NonNegativeInteger = scala.Double
  type NotifyDelayAfter = scala.Double
  type NullableBoolean = scala.Boolean
  type NullableDouble = scala.Double
  type NullableInteger = scala.Double
  type OrchestrationStringList = js.Array[typings.awsSdk.glueMod.GenericString]
  type OrderList = js.Array[typings.awsSdk.glueMod.Order]
  type PageSize = scala.Double
  type PaginationToken = java.lang.String
  type ParametersMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.glueMod.ParametersMapValue]
  type ParametersMapValue = java.lang.String
  type PartitionErrors = js.Array[typings.awsSdk.glueMod.PartitionError]
  type PartitionInputList = js.Array[typings.awsSdk.glueMod.PartitionInput]
  type PartitionList = js.Array[typings.awsSdk.glueMod.Partition]
  type Path = java.lang.String
  type PathList = js.Array[typings.awsSdk.glueMod.Path]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL
    - typings.awsSdk.awsSdkStrings.SELECT
    - typings.awsSdk.awsSdkStrings.ALTER
    - typings.awsSdk.awsSdkStrings.DROP
    - typings.awsSdk.awsSdkStrings.DELETE
    - typings.awsSdk.awsSdkStrings.INSERT
    - typings.awsSdk.awsSdkStrings.CREATE_DATABASE
    - typings.awsSdk.awsSdkStrings.CREATE_TABLE
    - typings.awsSdk.awsSdkStrings.DATA_LOCATION_ACCESS
    - java.lang.String
  */
  type Permission = typings.awsSdk.glueMod._Permission | java.lang.String
  type PermissionList = js.Array[typings.awsSdk.glueMod.Permission]
  type PolicyJsonString = java.lang.String
  type PredecessorList = js.Array[typings.awsSdk.glueMod.Predecessor]
  type PredicateString = java.lang.String
  type PrincipalPermissionsList = js.Array[typings.awsSdk.glueMod.PrincipalPermissions]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USER
    - typings.awsSdk.awsSdkStrings.ROLE
    - typings.awsSdk.awsSdkStrings.GROUP
    - java.lang.String
  */
  type PrincipalType = typings.awsSdk.glueMod._PrincipalType | java.lang.String
  type PublicKeysList = js.Array[typings.awsSdk.glueMod.GenericString]
  type PythonScript = java.lang.String
  type PythonVersionString = java.lang.String
  type RecordsCount = scala.Double
  type ReplaceBoolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.JAR
    - typings.awsSdk.awsSdkStrings.FILE
    - typings.awsSdk.awsSdkStrings.ARCHIVE
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.glueMod._ResourceType | java.lang.String
  type ResourceUriList = js.Array[typings.awsSdk.glueMod.ResourceUri]
  type Role = java.lang.String
  type RoleArn = java.lang.String
  type RoleString = java.lang.String
  type RowTag = java.lang.String
  type RunId = java.lang.String
  type S3EncryptionList = js.Array[typings.awsSdk.glueMod.S3Encryption]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.`SSE-KMS`
    - typings.awsSdk.awsSdkStrings.`SSE-S3`
    - java.lang.String
  */
  type S3EncryptionMode = typings.awsSdk.glueMod._S3EncryptionMode | java.lang.String
  type S3TargetList = js.Array[typings.awsSdk.glueMod.S3Target]
  type ScalaCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SCHEDULED
    - typings.awsSdk.awsSdkStrings.NOT_SCHEDULED
    - typings.awsSdk.awsSdkStrings.TRANSITIONING
    - java.lang.String
  */
  type ScheduleState = typings.awsSdk.glueMod._ScheduleState | java.lang.String
  type SchemaPathString = java.lang.String
  type ScriptLocationString = java.lang.String
  type SearchPropertyPredicates = js.Array[typings.awsSdk.glueMod.PropertyPredicate]
  type SecurityConfigurationList = js.Array[typings.awsSdk.glueMod.SecurityConfiguration]
  type SecurityGroupIdList = js.Array[typings.awsSdk.glueMod.NameString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASC
    - typings.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type Sort = typings.awsSdk.glueMod._Sort | java.lang.String
  type SortCriteria = js.Array[typings.awsSdk.glueMod.SortCriterion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DESCENDING
    - typings.awsSdk.awsSdkStrings.ASCENDING
    - java.lang.String
  */
  type SortDirectionType = typings.awsSdk.glueMod._SortDirectionType | java.lang.String
  type StringList = js.Array[typings.awsSdk.glueMod.GenericString]
  type TableErrors = js.Array[typings.awsSdk.glueMod.TableError]
  type TableList = js.Array[typings.awsSdk.glueMod.Table]
  type TableName = java.lang.String
  type TablePrefix = java.lang.String
  type TableTypeString = java.lang.String
  type TableVersionErrors = js.Array[typings.awsSdk.glueMod.TableVersionError]
  type TagKey = java.lang.String
  type TagKeysList = js.Array[typings.awsSdk.glueMod.TagKey]
  type TagValue = java.lang.String
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.glueMod.TagValue]
  type TaskRunList = js.Array[typings.awsSdk.glueMod.TaskRun]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TASK_RUN_TYPE
    - typings.awsSdk.awsSdkStrings.STATUS
    - typings.awsSdk.awsSdkStrings.STARTED
    - java.lang.String
  */
  type TaskRunSortColumnType = typings.awsSdk.glueMod._TaskRunSortColumnType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STARTING
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.STOPPING
    - typings.awsSdk.awsSdkStrings.STOPPED
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.TIMEOUT
    - java.lang.String
  */
  type TaskStatusType = typings.awsSdk.glueMod._TaskStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EVALUATION
    - typings.awsSdk.awsSdkStrings.LABELING_SET_GENERATION
    - typings.awsSdk.awsSdkStrings.IMPORT_LABELS
    - typings.awsSdk.awsSdkStrings.EXPORT_LABELS
    - typings.awsSdk.awsSdkStrings.FIND_MATCHES
    - java.lang.String
  */
  type TaskType = typings.awsSdk.glueMod._TaskType | java.lang.String
  type Timeout = scala.Double
  type Timestamp = typings.std.Date
  type TimestampValue = typings.std.Date
  type Token = java.lang.String
  type TotalSegmentsInteger = scala.Double
  type TransformIdList = js.Array[typings.awsSdk.glueMod.HashString]
  type TransformList = js.Array[typings.awsSdk.glueMod.MLTransform]
  type TransformSchema = js.Array[typings.awsSdk.glueMod.SchemaColumn]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NAME
    - typings.awsSdk.awsSdkStrings.TRANSFORM_TYPE
    - typings.awsSdk.awsSdkStrings.STATUS
    - typings.awsSdk.awsSdkStrings.CREATED
    - typings.awsSdk.awsSdkStrings.LAST_MODIFIED
    - java.lang.String
  */
  type TransformSortColumnType = typings.awsSdk.glueMod._TransformSortColumnType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NOT_READY
    - typings.awsSdk.awsSdkStrings.READY
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type TransformStatusType = typings.awsSdk.glueMod._TransformStatusType | java.lang.String
  type TransformType = typings.awsSdk.awsSdkStrings.FIND_MATCHES | java.lang.String
  type TriggerList = js.Array[typings.awsSdk.glueMod.Trigger]
  type TriggerNameList = js.Array[typings.awsSdk.glueMod.NameString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.CREATED
    - typings.awsSdk.awsSdkStrings.ACTIVATING
    - typings.awsSdk.awsSdkStrings.ACTIVATED
    - typings.awsSdk.awsSdkStrings.DEACTIVATING
    - typings.awsSdk.awsSdkStrings.DEACTIVATED
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type TriggerState = typings.awsSdk.glueMod._TriggerState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SCHEDULED
    - typings.awsSdk.awsSdkStrings.CONDITIONAL
    - typings.awsSdk.awsSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type TriggerType = typings.awsSdk.glueMod._TriggerType | java.lang.String
  type URI = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LOG
    - typings.awsSdk.awsSdkStrings.UPDATE_IN_DATABASE
    - java.lang.String
  */
  type UpdateBehavior = typings.awsSdk.glueMod._UpdateBehavior | java.lang.String
  type UriString = java.lang.String
  type UserDefinedFunctionList = js.Array[typings.awsSdk.glueMod.UserDefinedFunction]
  type ValueString = java.lang.String
  type ValueStringList = js.Array[typings.awsSdk.glueMod.ValueString]
  type VersionId = scala.Double
  type VersionString = java.lang.String
  type ViewTextString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Standard_
    - typings.awsSdk.awsSdkStrings.GDot1X
    - typings.awsSdk.awsSdkStrings.GDot2X
    - java.lang.String
  */
  type WorkerType = typings.awsSdk.glueMod._WorkerType | java.lang.String
  type WorkflowNames = js.Array[typings.awsSdk.glueMod.NameString]
  type WorkflowRunProperties = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.glueMod.GenericString]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type WorkflowRunStatus = typings.awsSdk.glueMod._WorkflowRunStatus | java.lang.String
  type WorkflowRuns = js.Array[typings.awsSdk.glueMod.WorkflowRun]
  type Workflows = js.Array[typings.awsSdk.glueMod.Workflow]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-03-31`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.glueMod._apiVersion | java.lang.String
}

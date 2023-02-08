package org.recap;

/**
 * Created by rajeshbabuk on 15/May/2021
 */
public class PropertyKeyConstants {

    private PropertyKeyConstants() {
    }

    /* General Property Keys */
    public static final String VERSION_NUMBER = "version.number";
    public static final String SERVER_SECURE = "server.secure";
    public static final String SCSB_UI_URL = "scsb.ui.url";
    public static final String SOLR_URL = "solr.url";
    public static final String SCSB_SOLR_DOC_URL = "scsb.solr.doc.url";
    public static final String SCSB_AUTH_URL = "scsb.auth.url";
    public static final String SCSB_GATEWAY_URL = "scsb.gateway.url";
    public static final String SCSB_CIRC_URL = "scsb.circ.url";
    public static final String SCSB_CORE_URL = "scsb.core.url";
    public static final String SCSB_ETL_URL = "scsb.etl.url";
    public static final String SCSB_ETL_DATADUMP_URL = "scsb.etl.datadump.url";
    public static final String SCSB_BATCH_SCHEDULE_URL = "scsb.batch.schedule.url";
    public static final String MONITORING_EMBED_UI_URL = "monitoring.embed.ui.url";
    public static final String MONITORING_EMBED_DOCKER_URL = "monitoring.embed.docker.url";
    public static final String MONITORING_EMBED_AWS_URL = "monitoring.embed.aws.url";
    public static final String LOGGING_UI_URL = "logging.ui.url";
    public static final String LOGGING_EMBED_UI_URL = "logging.embed.ui.url";

    public static final String ACTIVEMQ_BROKER_URL = "activemq.broker.url";
    public static final String ACTIVEMQ_JMX_SERVICE_URL = "activemq.jmx.service.url";
    public static final String ACTIVEMQ_JOLOKIA_API_URL = "activemq.jolokia.api.url";
    public static final String ACTIVEMQ_WEB_CONSOLE_URL = "activemq.web.console.url";
    public static final String ACTIVEMQ_CREDENTIALS = "activemq.credentials";
    public static final String ACTIVEMQ_JOLOKIA_API_QUEUE_SIZE_ATTRIBUTE = "activemq.jolokia.api.queue.size.attribute";

    public static final String SCSB_APP_LOGOUT_REDIRECT_URI = "scsb.app.logout.redirect.uri";
    public static final String SCSB_APP_SERVICE_SECURITY = "scsb.app.service.security";
    public static final String SCSB_APP_SERVICE_HOME = "scsb.app.service.home";
    public static final String SCSB_APP_SERVICE_LOGOUT = "scsb.app.service.logout";
    public static final String SCSB_SUPPORT_INSTITUTION = "scsb.support.institution";
    public static final String SCSB_SWAGGER_API_KEY = "scsb.swagger.api.key";
    public static final String SCSB_EMAIL_ASSIST_TO = "scsb.email.assist.to";
    public static final String SCSB_CGD_REPORT_MAIL_SUBJECT = "scsb.cgd.report.mail.subject";

    public static final String CAS_DEFAULT_URL_PREFIX = "cas.default.url.prefix";
    public static final String CAS_DEFAULT_SERVICE_LOGOUT = "cas.default.service.logout";

    public static final String SUPERADMIN_PERMISSION_INSTITUTION = "superadmin.permission.institution";
    public static final String USERS_SESSION_TIMEOUT = "users.session.timeout";
    public static final String INCLUDE_SUBMIT_COLLECTION_IN_SEQUENCE_JOB = "include.submit.collection.in.sequence.job";
    public static final String INCLUDE_MATCHING_ALGORITHM_IN_SEQUENCE_JOB = "include.matching.algorithm.in.sequence.job";
    public static final String INCLUDE_CGD_ROUND_TRIP_REPORTS_IN_SEQUENCE_JOB = "include.cgd.round.trip.reports.in.sequence.job";
    public static final String INCLUDE_DATA_EXPORT_IN_SEQUENCE_JOB = "include.data.export.in.sequence.job";
    public static final String LONG_RUNNING_JOBS_POLLER_TIME_IN_MINUTES = "long.running.jobs.poller.time.in.minutes";
    public static final String TOMCAT_MAX_PARAMETER_COUNT = "tomcat.maxParameterCount";

    public static final String AWS_ACCESS_KEY = "awsAccessKey";
    public static final String AWS_ACCESS_SECRET_KEY = "awsAccessSecretKey";
    public static final String SCSB_BUCKET_NAME= "scsbBucketName";

    public static final String FTP_SERVER_USERNAME = "ftp.server.userName";
    public static final String FTP_SERVER_PRIVATEKEY = "ftp.server.privateKey";
    public static final String FTP_SERVER_KNOWNHOST = "ftp.server.knownHost";

    public static final String EMAIL_SMTP_SERVER_USERNAME = "email.smtp.server.username";
    public static final String EMAIL_SMTP_SERVER_ADDRESS_FROM = "email.smtp.server.address.from";
    public static final String EMAIL_SMTP_SERVER = "email.smtp.server";
    public static final String EMAIL_SMTP_SERVER_PASSWORD_FILE = "email.smtp.server.password.file";
    public static final String EMAIL_BULK_REQUEST_TO = "email.bulk.request.to";
    public static final String EMAIL_REQUEST_INITIAL_LOAD_SUBJECT = "email.request.initial.load.subject";
    public static final String EMAIL_REQUEST_RECALL_SUBJECT = "email.request.recall.subject";
    public static final String EMAIL_PENDING_REQUEST_TO = "email.pending.request.to";
    public static final String EMAIL_PENDING_REQUEST_CC = "email.pending.request.cc";
    public static final String EMAIL_STATUS_RECONCILIATION_TO = "email.status.reconciliation.to";
    public static final String EMAIL_STATUS_RECONCILIATION_CC = "email.status.reconciliation.cc";
    public static final String EMAIL_DATA_DUMP_FROM = "email.data.dump.from";
    public static final String EMAIL_DATA_DUMP_SUBJECT = "email.data.dump.subject";
    public static final String EMAIL_DATA_DUMP_NODATA_SUBJECT = "email.data.dump.nodata.subject";
    public static final String EMAIL_SCSB_UPDATECGD_TO = "email.scsb.updateCgd.to";
    public static final String EMAIL_SCSB_UPDATECGD_CC = "email.scsb.updateCgd.cc";
    public static final String EMAIL_SCSB_BATCH_JOB_TO = "email.scsb.batch.job.to";
    public static final String EMAIL_SCSB_UPDATECGD_SUBJECT = "email.scsb.updateCgd.subject";
    public static final String EMAIL_SCSB_BATCH_JOB_SUBJECT = "email.scsb.batch.job.subject";
    public static final String EMAIL_DELETED_RECORDS_TO = "email.deleted.records.to";
    public static final String EMAIL_ACCESSION_JOB_EXCEPTION_TO = "email.accession.job.exception.to";
    public static final String EMAIL_ACCESSION_JOB_EXCEPTION_CC = "email.accession.job.exception.cc";
    public static final String EMAIL_SUBMIT_COLLECTION_SUBJECT = "email.submit.collection.subject";
    public static final String EMAIL_SUBMIT_COLLECTION_SUBJECT_FOR_EMPTY_DIRECTORY = "email.submit.collection.subject.for.empty.directory";

    public static final String BULK_REQUEST_ITEM_COUNT_LIMIT = "bulk.request.item.count.limit";
    public static final String BULK_REQUEST_CONCURRENT_CONSUMER_COUNT = "bulk.request.concurrent.consumer.count";
    public static final String REQUEST_INITIAL_LOAD_FILEPATH = "request.initial.load.filepath";
    public static final String REQUEST_PENDING_LIMIT = "request.pending.limit";
    public static final String REQUEST_INITIAL_ACCESSION = "request.initial.accession";
    public static final String REQUEST_INITIAL_ACCESSION_ERROR_FILE = "request.initial.accession.error.file";

    public static final String ETL_DATA_DUMP_FTP_STAGING_DIRECTORY = "etl.data.dump.ftp.staging.directory";
    public static final String ETL_DATA_DUMP_REPORT_DIRECTORY = "etl.data.dump.report.directory";
    public static final String ETL_EXPORT_S3_FAILUREREPORT_DIRECTORY = "etl.export.s3.failurereport.directory";
    public static final String ETL_DATA_DUMP_STATUS_FILE_NAME = "etl.data.dump.status.file.name";
    public static final String ETL_DATA_DUMP_FETCHTYPE_FULL = "etl.data.dump.fetchtype.full";
    public static final String ETL_DATA_DUMP_DIRECTORY = "etl.data.dump.directory";
    public static final String ETL_REPORT_DIRECTORY = "etl.report.directory";
    public static final String ETL_POOL_SIZE = "etl.pool.size";
    public static final String ETL_MAX_POOL_SIZE = "etl.max.pool.size";
    public static final String ETL_SPLIT_XML_TAG_NAME = "etl.split.xml.tag.name";
    public static final String ETL_LOAD_BATCHSIZE = "etl.load.batchSize";
    public static final String ETL_DATA_LOAD_DIRECTORY = "etl.data.load.directory";
    public static final String ETL_DATA_DUMP_DELETED_TYPE_ONLYORPHAN_INSTITUTION = "etl.data.dump.deleted.type.onlyorphan.institution";
    public static final String ETL_DATA_DUMP_INCREMENTAL_DATE_LIMIT = "etl.data.dump.incremental.date.limit";
    public static final String ETL_DATA_DUMP_INCREMENTAL_TYPE_NONFULLTREE_INSTITUTION = "etl.data.dump.incremental.type.nonfulltree.institution";
    public static final String ETL_INITIAL_DATA_LOAD_THREAD_SIZE = "etl.initial.data.load.thread.size";
    public static final String DATA_DUMP_NOTIFICATION_CC = "data.dump.notification.cc";
    public static final String DATA_DUMP_HTTPRESPONSE_RECORD_LIMIT = "data.dump.httpresponse.record.limit";
    public static final String DATA_DUMP_BATCH_SIZE = "data.dump.batch.size";
    public static final String DATADUMP_SOLR_FETCH_DELAY = "datadump.solr.fetch.delay";
    public static final String RECENT_DATA_EXPORT_LIMIT= "recent.data.export.limit";

    public static final String S3_ADD_S3_ROUTES_ON_STARTUP = "s3.add.s3.routes.on.startup";
    public static final String S3_DATADUMP_REPORT_REMOTE_SERVER = "s3.datadump.report.remote.server";
    public static final String S3_ETL_REPORTS_DIR = "s3.etl.reports.dir";
    public static final String S3_DATA_DUMP_DIR = "s3.data.dump.dir";
    public static final String S3_ONGOING_ACCESSION_COLLECTION_REPORT_DIR = "s3.ongoing.accession.collection.report.dir";
    public static final String S3_DEACCESSION_COLLECTION_REPORT_DIR = "s3.deaccession.collection.report.dir";
    public static final String S3_MATCHINGALGORITHM_REPORTS_DIR = "s3.matchingAlgorithm.reports.dir";
    public static final String S3_SUBMIT_COLLECTION_SUPPORT_TEAM_REPORT_DIR = "s3.submit.collection.support.team.report.dir";
    public static final String S3_SUBMIT_COLLECTION_REPORT_DIR = "s3.submit.collection.report.dir";
    public static final String S3_SUBMIT_COLLECTION_DIR = "s3.submit.collection.dir";
    public static final String S3_ACCESSION_RECONCILIATION_DIR = "s3.accession.reconciliation.dir";
    public static final String S3_ACCESSION_RECONCILIATION_PROCESSED_DIR = "s3.accession.reconciliation.processed.dir";
    public static final String S3_DAILY_RECONCILIATION = "s3.daily.reconciliation";
    public static final String S3_DAILY_RECONCILIATION_PROCESSED = "s3.daily.reconciliation.processed";
    public static final String S3_SOLR_REPORTS_DIR = "s3.solr.reports.dir";

    public static final String SOLR_CONFIGSETS_DIR = "solr.configsets.dir";
    public static final String SOLR_SOLR_HOME = "solr.solr.home";
    public static final String SOLR_PARENT_CORE = "solr.parent.core";
    public static final String SOLR_SERVER_PROTOCOL = "solr.server.protocol";
    public static final String SOLR_ROUTER_URI_TYPE = "solr.router.uri.type";
    public static final String SOLR_EXCEPTION_REPORT_DIRECTORY = "solr.exception.report.directory";
    public static final String COMMIT_INDEXES_INTERVAL = "commit.indexes.interval";

    public static final String SCSB_COLLECTION_REPORT_DIRECTORY = "scsb.collection.report.directory";
    public static final String MATCHING_ALGORITHM_BATCHSIZE = "matching.algorithm.batchSize";
    public static final String MATCHING_ALGORITHM_BIBINFO_BATCHSIZE = "matching.algorithm.bibinfo.batchsize";
    public static final String MATCHING_ALGORITHM_INDEXING_BATCHSIZE = "matching.algorithm.indexing.batchsize";
    public static final String MATCHING_ALGORITHM_COMMIT_INTERVAL = "matching.algorithm.commit.interval";
    public static final String MATCHING_REPORT_HEADER_VALUE_LENGTH = "matching.report.header.value.length";
    public static final String ACCESSION_RECONCILIATION_FILEPATH = "accession.reconciliation.filePath";
    public static final String ONGOING_ACCESSION_INPUT_LIMIT = "ongoing.accession.input.limit";
    public static final String ONGOING_ACCESSION_COLLECTION_REPORT_DIRECTORY = "ongoing.accession.collection.report.directory";
    public static final String BATCH_ACCESSION_THREAD_SIZE = "batch.accession.thread.size";
    public static final String ONGOING_MATCHING_REPORT_DIRECTORY = "ongoing.matching.report.directory";
    public static final String SUBMIT_COLLECTION_REPORT_DIRECTORY = "submit.collection.report.directory";
    public static final String SUBMIT_COLLECTION_OWNINGINSTBIBIDLIST_PARTITION_SIZE = "submit.collection.owninginstbibidlist.partition.size";
    public static final String SUBMIT_COLLECTION_LOCAL_DIR = "submit.collection.local.dir";
    public static final String SUBMIT_COLLECTION_INPUT_LIMIT = "submit.collection.input.limit";
    public static final String SUBMIT_COLLECTION_PARTITION_SIZE = "submit.collection.partition.size";
    public static final String NONHOLDINGID_INSTITUTION = "nonholdingid.institution";
    public static final String BIBDATA_API_CONNECTION_TIMEOUT = "bibdata.api.connection.timeout";
    public static final String BIBDATA_API_READ_TIMEOUT = "bibdata.api.read.timeout";
    public static final String DAILY_RECONCILIATION_FILE = "daily.reconciliation.file";
    public static final String STATUS_RECONCILIATION = "status.reconciliation";
    public static final String STATUS_RECONCILIATION_BATCH_SIZE = "status.reconciliation.batch.size";
    public static final String STATUS_RECONCILIATION_DAY_LIMIT = "status.reconciliation.day.limit";
    public static final String STATUS_RECONCILIATION_BARCODE_LIMIT = "status.reconciliation.barcode.limit";
    public static final String STATUS_RECONCILIATION_REFILE_MAX_CAP_LIMIT = "status.reconciliation.refile.max.cap.limit";
    public static final String PURGE_EMAIL_ADDRESS_EDD_REQUEST_DAY_LIMIT = "purge.email.address.edd.request.day.limit";
    public static final String PURGE_EMAIL_ADDRESS_PHYSICAL_REQUEST_DAY_LIMIT = "purge.email.address.physical.request.day.limit";
    public static final String PURGE_EXCEPTION_REQUEST_DAY_LIMIT = "purge.exception.request.day.limit";
    public static final String PURGE_ACCESSION_REQUEST_DAY_LIMIT = "purge.accession.request.day.limit";
    public static final String TRANSFER_API_NONHOLDINGID_INSTITUTION = "transfer.api.nonholdingid.institution";

    public static final String IS_GFA_CHECK_REQ_FOR_REQUEST_INITIAL_LOAD = "request.initial.load.verify.ims.status";
    public static final String IS_SOLR_INDEX_REQ_FOR_REQUEST_INITIAL_LOAD = "request.initial.load.perform.solr.index";

    public static final String SUBMIT_COLLECTION_SOLR_PARTIAL_INDEX_THREAD_SIZE = "submit.collection.solr.partial.index.thread.size";
    public static final String SUBMIT_COLLECTION_SOLR_PARTIAL_INDEX_DOCS_SIZE = "submit.collection.solr.partial.index.docs.size";
    public static final String SUBMIT_COLLECTION_USE_SOLR_PARTIAL_INDEX_TOTAL_DOCS_SIZE = "submit.collection.use.solr.partial.index.docs.size";
    public static final String UI_SUPPRESS_DELIVERY_LOCATION = "ui.suppress.delivery.location";

    public static final String IS_INDEX_GROUPING_MATCHES="index.grouping.for.ma";

    public static final String TITLE_MATCH_REPORT_DIR="title.match.report.directory";

    public static final String TITLE_MATCH_REPORT_EXPORT_LIMIT = "title.match.export.limit";
    public static final String TITLE_REPORT_LIMIT_BIBS_PER_FILE = "title.match.bibs.limit.per.file";
    public static final String TITLE_REPORT_STATUS_FILE = "title.match.report.status.file.name";

    public static final String RUN_ONGOING_MA_GROUPING_PROCESS = "run.ongoing.ma.grouping.process";
    public static final String OCOLC_INSTITUTION = "ocolc.institution";
    public static final String GATEWAY_VALIDATION_EXCEPTIONS = "gateway.request.validation.exceptions";

    /* ILS Property Keys */
    public static class ILS {
        private ILS() {
        }

        public static final String ILS_PROTOCOL = "ils.protocol";
        public static final String ILS_SERVER = "ils.server";
        public static final String ILS_SERVER_PORT = "ils.server.port";
        public static final String ILS_SERVER_OPERATOR_USER_ID = "ils.server.operator.user.id";
        public static final String ILS_SERVER_OPERATOR_PASSWORD = "ils.server.operator.password";
        public static final String ILS_SERVER_OPERATOR_LOCATION = "ils.server.operator.location";
        /* ILS OAuth Keys */
        public static final String ILS_OAUTH2_CLIENT_CLIENT_ID = "oauth2.client.clientid";
        public static final String ILS_OAUTH2_CLIENT_CLIENT_SECRET = "oauth2.client.clientSecret";
        public static final String ILS_OAUTH2_CLIENT_REGISTERED_REDIRECT_URI = "oauth2.client.registered-redirect-uri";
        public static final String ILS_OAUTH2_RESOURCE_JWT_KEY_VALUE = "oauth2.resource.jwt.key-value";
        public static final String ILS_OAUTH2_CLIENT_SCOPE = "oauth2.client.scope";
        public static final String ILS_OAUTH2_CLIENT_PRE_ESTABLISHED_REDIRECT_URI = "oauth2.client.pre-established-redirect-uri";
        public static final String ILS_OAUTH_RESOURCE_JWT_KEY_VALUE = "oauth.resource.jwt.key-value";
        public static final String ILS_OAUTH_TOKEN_API_URL = "oauth.token.api.url";
        /* ILS Email Keys */
        public static final String ILS_EMAIL_ACCESSION_REPORTS_TO = "email.accession.reports.to";
        public static final String ILS_EMAIL_ACCESSION_RECONCILIATION_TO = "email.accession.reconciliation.to";
        public static final String ILS_EMAIL_ACCESSION_RECONCILIATION_CC = "email.accession.reconciliation.cc";
        public static final String ILS_EMAIL_SUBMIT_COLLECTION_TO = "email.submit.collection.to";
        public static final String ILS_EMAIL_SUBMIT_COLLECTION_CC = "email.submit.collection.cc";
        public static final String ILS_EMAIL_MATCHING_REPORTS_TO = "email.matching.reports.to";
        public static final String ILS_EMAIL_DATA_DUMP_TO = "email.data.dump.to";
        public static final String ILS_EMAIL_DATA_DUMP_CC = "email.data.dump.cc";
        public static final String ILS_EMAIL_RECALL_REQUEST_TO = "email.recall.request.to";
        public static final String ILS_EMAIL_REQUEST_RECALL_CC = "email.request.recall.cc";
        public static final String ILS_EMAIL_REQUEST_INITIAL_LOAD_TO = "email.request.initial.load.to";
        public static final String ILS_EMAIL_REQUEST_REFILE_TO = "email.request.refile.to";
        public static final String ILS_EMAIL_ADMIN_ROLE_TO = "email.admin.role.to";
        public static final String ILS_EMAIL_TECHNICAL_SUPPORT_TO = "email.technical.support.to";
        public static final String ILS_EMAIL_SUBMIT_COLLECTION_NOFILES_TO = "email.submit.collection.nofiles.to";
        public static final String ILS_EMAIL_PAYLOAD_TO = "header.emailPayLoad.to";
        public static final String ILS_EMAIL_PAYLOAD_CC = "header.emailPayLoad.cc";
        public static final String ILS_EMAIL_PAYLOAD_SUBJECT = "header.emailPayLoad.subject";
        public static final String ILS_EMAIL_MATCHING_CGD_REPORTS_TO = "email.matching.cgd.reports.to";
        public static final String ILS_EMAIL_MATCHING_CGD_REPORTS_CC = "email.matching.cgd.reports.cc";

        /* Other ILS Keys */
        public static final String ILS_DATA_DUMP_MARC = "datadump.marc";
        public static final String ILS_REST_DATA_API = "ils.rest.data.api";
        public static final String ILS_REST_POLLING_MAX_TIMEOUT = "ils.rest.polling.max.timeout";
        public static final String ILS_BIB_DATA_API_PARAMETER = "ils.bibdata.api.parameter";
        public static final String ILS_BIB_DATA_API_ENDPOINT = "ils.bibdata.api.endpoint";
        public static final String ILS_BIB_DATA_API_AUTH = "ils.bibdata.api.auth";
        public static final String ILS_BIB_DATA_FORMAT = "bibdata.format";
        public static final String ILS_REFILE_ENDPOINT_PROTOCOL = "ils.refile.endpoint.protocol";
        public static final String ILS_SUBMIT_COLLECTION_PROTECTED_FTP_DIR = "submitCollection.protected.ftpDir";
        public static final String ILS_SUBMIT_COLLECTION_PROTECTED_LOCAL_DIR = "submitCollection.protected.localDir";
        public static final String ILS_SUBMIT_COLLECTION_NOT_PROTECTED_FTP_DIR = "submitCollection.notProtected.ftpDir";
        public static final String ILS_SUBMIT_COLLECTION_NOT_PROTECTED_LOCAL_DIR = "submitCollection.notProtected.localDir";
        public static final String ILS_FTP_ACCESSION_RECONCILIATION_DIR = "ftp.accession.reconciliation.dir";
        public static final String ILS_FTP_ACCESSION_RECONCILIATION_PROCESSED_DIR = "ftp.accession.reconciliation.processed.dir";
        public static final String ILS_ACCESSION_RECONCILIATION_FILE_PATH = "accession.reconciliation.filePath";
        public static final String ILS_ACCESSION_RECONCILIATION_WORK_DIR = "accession.reconciliation.workdir";
        public static final String ILS_ACCESSION_RECONCILIATION_FTP_ROUTE_ID = "accession.reconciliation.ftp.routeId";
        public static final String ILS_ACCESSION_RECONCILIATION_DIRECT_ROUTE_ID = "accession.reconciliation.direct.routeId";
        public static final String ILS_ETL_INCREMENTAL_DUMP = "etl.incremental.dump";
        public static final String ILS_ETL_DELETED_DUMP = "etl.deleted.dump";
        public static final String ILS_ETL_INITIAL_DATA_LOADED_DATE = "etl.initial.data.loaded.date";
        public static final String ILS_FTP_REQUEST_INITIAL_ACCESSION_DIR = "ftp.request.initial.accession.dir";
        public static final String ILS_FTP_REQUEST_INITIAL_ACCESSION_ERROR_FILE = "ftp.request.initial.accession.error.file";
        public static final String ILS_REQUEST_INITIAL_LOAD_WORK_DIR = "request.initial.load.workdir";
        public static final String ILS_REQUEST_INITIAL_LOAD_FILE_PATH = "request.initial.load.filepath";
        public static final String ILS_AGENCY_ID = "ils.agency.id";
        public static final String ILS_SCHEME = "ils.scheme";
        public static final String ILS_API_KEY = "ils.api.key";
        public static final String ILS_ENABLE_CIRCULATION_FREEZE = "ils.enable.circulation.freeze";
        public static final String ILS_CIRCULATION_FREEZE_MESSAGE = "ils.circulation.freeze.message";
        public static final String ILS_AUTH_TYPE = "auth.type";
        public static final String ILS_AUTH_SERVICE_PREFIX = "auth.service.prefix";
        public static final String ILS_AUTH_SERVICE_LOGIN = "auth.service.login";
        public static final String ILS_AUTH_SERVICE_LOGOUT = "auth.service.logout";
        public static final String ILS_REST_POLLING_TIME_INTERVAL = "ils.rest.polling.time.interval";
        public static final String ILS_CHECKEDOUT_CIRCULATION_STATUS = "ils.checkedout.circulation.status";
        public static final String ILS_TOPIC_RETRIEVAL_REQUEST = "ils.topic.retrieval.request";
        public static final String ILS_TOPIC_EDD_REQUEST = "ils.topic.edd.request";
        public static final String ILS_TOPIC_RECALL_REQUEST = "ils.topic.recall.request";
        public static final String ILS_DEFAULT_PICKUP_LOCATION = "ils.default.pickup.location";
        public static final String ILS_USE_DELIVERY_LOCATION_AS_PICKUP_LOCATION = "ils.use.delivery.location.as.pickup.location";
        public static final String ILS_REMOTE_CHECKIN = "ils.remote.checkin";
        public static final String ILS_REMOTE_PROFILE_TYPE = "ils.remote.profile.type";
        public static final String ILS_SOURCE_FOR_ITEM = "ils.source.for.item.";
        public static final String ILS_NORMALIZE_OWNING_INST_ITEM_ID = "ils.normalize.owning.inst.item.id";
        public static final String ILS_USE_GENERIC_PATRON_EDD_SELF = "use.generic.patron.edd.self";
        public static final String ILS_USE_GENERIC_PATRON_EDD_CROSS = "use.generic.patron.edd.cross";
        public static final String ILS_USE_GENERIC_PATRON_RETRIEVAL_CROSS = "use.generic.patron.retrieval.cross";
        public static final String ILS_USE_REFILE_FOR_CHECKIN = "ils.use.refile.for.checkin";
        public static final String ILS_CREATE_BIB_API_ENABLED = "ils.create.bib.api.enabled";
        public static final String ILS_CHECKIN_INSTITUTION = "ils.checkin.institution";
        public static final String ILS_BIBDATA_FORMAT= "bibdata.format";
        public static final String ILS_EMAIL_LAS_EXCEPTION_TO = "email.las.exception.to";
        public static final String ILS_EMAIL_LAS_EXCEPTION_CC = "email.las.exception.cc";
        public static final String ILS_RECALL_FUNCTIONALITY_AVAILABLE = "ils.recall.functionality.available";
        public static final String LAS_EXCEPTION_EMAIL_ONLY = "las.exception.email.only";
        public static final String ILS_RESTRICTED_ACCEPT_ITEM_AGENCY_ID = "ils.restricted.accept.item.agency.id";
        public static final String ILS_UNRESTRICTED_ACCEPT_ITEM_AGENCY_ID = "ils.unrestricted.accept.item.agency.id";
        public static final String ILS_ITEM_LIBRARY_REQUIRED = "ils.item.library.required";
    }

    /* IMS Property Keys */
    public static class IMS {
        private IMS() {
        }

        /* IMS End Point URL Keys */
        public static final String IMS_SERVER_STATUS_ENDPOINT = "ims.server.status.endpoint";
        public static final String IMS_ITEM_STATUS_ENDPOINT = "ims.item.status.endpoint";
        public static final String IMS_ITEM_PERMANENT_WITHDRAWAL_DIRECT_ENDPOINT = "ims.item.permanent.withdrawal.direct.endpoint";
        public static final String IMS_ITEM_PERMANENT_WITHDRAWAL_INDIRECT_ENDPOINT = "ims.item.permanent.withdrawal.indirect.endpoint";
        public static final String IMS_ITEM_RETRIEVAL_ORDER_ENDPOINT = "ims.item.retrieval.order.endpoint";
        public static final String IMS_ITEM_EDD_ORDER_ENDPOINT = "ims.item.edd.order.endpoint";
        /* IMS Email Keys */
        public static final String IMS_EMAIL_REQUEST_CANCEL_TO = "ims.email.request.cancel.to";
        public static final String IMS_EMAIL_REQUEST_REFILE_TO = "ims.email.request.refile.to";
        public static final String IMS_EMAIL_REQUEST_RECALL_CC = "ims.email.request.recall.cc";
        public static final String IMS_EMAIL_ASSIST_TO = "ims.email.assist.to";
        public static final String IMS_EMAIL_DAILY_RECONCILIATION_TO = "ims.email.daily.reconciliation.to";
        public static final String IMS_EMAIL_STATUS_RECONCILIATION_TO = "ims.email.status.reconciliation.to";
        public static final String IMS_EMAIL_STATUS_RECONCILIATION_CC = "ims.email.status.reconciliation.cc";
        /* Other IMS Keys */
        public static final String IMS_USE_QUEUE = "ims.use.queue";
        public static final String IMS_SERVER_RESPONSE_TIMEOUT_MILLISECONDS = "ims.server.response.timeout.milliseconds";
        public static final String IMS_POLLING_TIME_INTERVAL = "ims.polling.time.interval";
        public static final String IMS_AVAILABLE_ITEM_STATUS_CODES = "ims.available.item.status.codes";
        public static final String IMS_NOT_AVAILABLE_ITEM_STATUS_CODES = "ims.not.available.item.status.codes";
        public static final String IMS_REQUESTABLE_NOT_RETRIEVABLE_ITEM_STATUS_CODES = "ims.requestable.not.retrievable.item.status.codes";
        public static final String IMS_NOT_ON_FILE_ITEM_STATUS_CODES = "ims.not.on.file.item.status.codes";

    }
}

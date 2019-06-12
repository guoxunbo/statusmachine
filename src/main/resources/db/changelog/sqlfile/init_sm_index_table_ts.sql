alter table COM_SM_EVENT move tablespace TS_NB_DAT;
alter table COM_SM_EVENT_STATUS move tablespace TS_NB_DAT;
alter table COM_SM_STATUS move tablespace TS_NB_DAT;
alter table COM_SM_STATUS_CATEGORY move tablespace TS_NB_DAT;
alter table COM_SM_STATUS_MODEL move tablespace TS_NB_DAT;
alter table COM_SM_STATUS_MODEL_EVENT move tablespace TS_NB_DAT;
alter table COM_SM_STATUS_MODEL_EVENT_ROLE move tablespace TS_NB_DAT;
alter table COM_SM_SUB_STATUS move tablespace TS_NB_DAT;

alter index PK_COM_SM_EVENT rebuild tablespace TS_NB_IDX;
alter index PK_COM_SM_EVENT_STATUS rebuild tablespace TS_NB_IDX;
alter index PK_COM_SM_STATUS rebuild tablespace TS_NB_IDX;
alter index PK_COM_SM_STATUS_CATEGORY  rebuild tablespace TS_NB_IDX;
alter index UK_SM_SC_ORG_NAME_CATEGORY rebuild tablespace TS_NB_IDX;
alter index PK_COM_SM_STATUS_MODEL  rebuild tablespace TS_NB_IDX;
alter index UK_SM_ORG_NAME_CATEGORY  rebuild tablespace TS_NB_IDX;
alter index PK_COM_SM_STATUS_MODEL_EVENT  rebuild tablespace TS_NB_IDX;
alter index PK_COM_SM_SUB_STATUS  rebuild tablespace TS_NB_IDX;
alter index UK_SM_SS_ORG_NAME_CATEGORY  rebuild tablespace TS_NB_IDX;



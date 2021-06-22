--------------------------------------------------------
--  File created - Tuesday-June-22-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table EMP
--------------------------------------------------------

  CREATE TABLE "JADMIN"."EMP" 
   (	"USERNAME" VARCHAR2(20 BYTE), 
	"PASSWORD" VARCHAR2(20 BYTE), 
	"GENDER" VARCHAR2(15 BYTE), 
	"ADDRESS" VARCHAR2(100 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into JADMIN.EMP
SET DEFINE OFF;
Insert into JADMIN.EMP (USERNAME,PASSWORD,GENDER,ADDRESS) values ('dharam','india123',null,null);
Insert into JADMIN.EMP (USERNAME,PASSWORD,GENDER,ADDRESS) values ('amit','india123',null,null);
Insert into JADMIN.EMP (USERNAME,PASSWORD,GENDER,ADDRESS) values ('ddf','ghghh',null,null);
Insert into JADMIN.EMP (USERNAME,PASSWORD,GENDER,ADDRESS) values ('shubham','india@123','Male','Satrana malajpur mp');
Insert into JADMIN.EMP (USERNAME,PASSWORD,GENDER,ADDRESS) values ('rohini','dinida@123','Female','sirdi maharastra');
Insert into JADMIN.EMP (USERNAME,PASSWORD,GENDER,ADDRESS) values ('firoj','anasair@123','Male','bihar');
Insert into JADMIN.EMP (USERNAME,PASSWORD,GENDER,ADDRESS) values ('suresh','india@123','Male','Latur');
Insert into JADMIN.EMP (USERNAME,PASSWORD,GENDER,ADDRESS) values ('dharam','dharam','Male','bhopal');
--------------------------------------------------------
--  Constraints for Table EMP
--------------------------------------------------------

  ALTER TABLE "JADMIN"."EMP" MODIFY ("PASSWORD" NOT NULL ENABLE);
  ALTER TABLE "JADMIN"."EMP" MODIFY ("USERNAME" NOT NULL ENABLE);

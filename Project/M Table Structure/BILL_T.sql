--------------------------------------------------------
--  File created - Tuesday-June-22-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table BILL_T
--------------------------------------------------------

  CREATE TABLE "JADMIN"."BILL_T" 
   (	"B_ID" NUMBER, 
	"B_NAME" VARCHAR2(20 BYTE), 
	"COLUMN1" VARCHAR2(20 BYTE), 
	"COLUMN2" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into JADMIN.BILL_T
SET DEFINE OFF;
--------------------------------------------------------
--  Constraints for Table BILL_T
--------------------------------------------------------

  ALTER TABLE "JADMIN"."BILL_T" MODIFY ("B_ID" NOT NULL ENABLE);

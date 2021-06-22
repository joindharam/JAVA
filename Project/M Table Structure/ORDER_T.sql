--------------------------------------------------------
--  File created - Tuesday-June-22-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ORDER_T
--------------------------------------------------------

  CREATE TABLE "JADMIN"."ORDER_T" 
   (	"O_ID" NUMBER, 
	"M_ID" VARCHAR2(20 BYTE), 
	"O_QUANTITY" NUMBER, 
	"O_NAME" VARCHAR2(20 BYTE), 
	"O_PRICE" NUMBER, 
	"O_NAMEDR" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into JADMIN.ORDER_T
SET DEFINE OFF;
--------------------------------------------------------
--  Constraints for Table ORDER_T
--------------------------------------------------------

  ALTER TABLE "JADMIN"."ORDER_T" MODIFY ("O_ID" NOT NULL ENABLE);

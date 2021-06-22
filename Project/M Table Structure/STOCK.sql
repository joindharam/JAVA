--------------------------------------------------------
--  File created - Tuesday-June-22-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table STOCK
--------------------------------------------------------

  CREATE TABLE "JADMIN"."STOCK" 
   (	"S_ID" VARCHAR2(20 BYTE), 
	"S_ITEM_QUANTITY" VARCHAR2(20 BYTE), 
	"S_ITEM_PRICE" NUMBER(20,0), 
	"S_ITEM_EXPIRYDATE" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into JADMIN.STOCK
SET DEFINE OFF;
--------------------------------------------------------
--  Constraints for Table STOCK
--------------------------------------------------------

  ALTER TABLE "JADMIN"."STOCK" MODIFY ("S_ID" NOT NULL ENABLE);

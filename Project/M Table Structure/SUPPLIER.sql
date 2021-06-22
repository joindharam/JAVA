--------------------------------------------------------
--  File created - Tuesday-June-22-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table SUPPLIER
--------------------------------------------------------

  CREATE TABLE "JADMIN"."SUPPLIER" 
   (	"BATCH_NO" NUMBER, 
	"S_NAME" VARCHAR2(80 BYTE), 
	"M_TYPE" VARCHAR2(30 BYTE), 
	"MC_NAME" VARCHAR2(80 BYTE), 
	"PRICE" NUMBER, 
	"DOM" VARCHAR2(20 BYTE), 
	"DOE" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into JADMIN.SUPPLIER
SET DEFINE OFF;
Insert into JADMIN.SUPPLIER (BATCH_NO,S_NAME,M_TYPE,MC_NAME,PRICE,DOM,DOE) values (0,'name','Tablet','company',1000,'dom','doe');
Insert into JADMIN.SUPPLIER (BATCH_NO,S_NAME,M_TYPE,MC_NAME,PRICE,DOM,DOE) values (5000,'rubina','Capsule','Cadela',50000,'2--03-2019','2-03-02024');
Insert into JADMIN.SUPPLIER (BATCH_NO,S_NAME,M_TYPE,MC_NAME,PRICE,DOM,DOE) values (678,'sandeep','Ointment','lupin',500,'4-04-2021','5-04-2025');
--------------------------------------------------------
--  Constraints for Table SUPPLIER
--------------------------------------------------------

  ALTER TABLE "JADMIN"."SUPPLIER" MODIFY ("BATCH_NO" NOT NULL ENABLE);

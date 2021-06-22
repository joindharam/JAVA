--------------------------------------------------------
--  File created - Tuesday-June-22-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table MEDICINE
--------------------------------------------------------

  CREATE TABLE "JADMIN"."MEDICINE" 
   (	"M_ID" NUMBER, 
	"M_NAME" VARCHAR2(20 BYTE), 
	"M_COMP" VARCHAR2(50 BYTE), 
	"M_QUANTITY" NUMBER, 
	"M_TYPE" VARCHAR2(30 BYTE), 
	"M_MG" NUMBER, 
	"M_PRICE" NUMBER(*,0), 
	"M_EXPIRY" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "JADMIN"."MEDICINE"."M_MG" IS 'MG recomeneded for medicine';
REM INSERTING into JADMIN.MEDICINE
SET DEFINE OFF;
Insert into JADMIN.MEDICINE (M_ID,M_NAME,M_COMP,M_QUANTITY,M_TYPE,M_MG,M_PRICE,M_EXPIRY) values (101,'Paracetomal','SunPharma',504,'Tablet',15,5000,'2-05-2024');
Insert into JADMIN.MEDICINE (M_ID,M_NAME,M_COMP,M_QUANTITY,M_TYPE,M_MG,M_PRICE,M_EXPIRY) values (104,'Zandubam','Lupin',450,'Bam',200,2000,'2-02-2024');
Insert into JADMIN.MEDICINE (M_ID,M_NAME,M_COMP,M_QUANTITY,M_TYPE,M_MG,M_PRICE,M_EXPIRY) values (103,null,'Cipla',500,'Tablet',15,2004,'3-07-2021');
--------------------------------------------------------
--  Constraints for Table MEDICINE
--------------------------------------------------------

  ALTER TABLE "JADMIN"."MEDICINE" MODIFY ("M_ID" NOT NULL ENABLE);

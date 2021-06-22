--------------------------------------------------------
--  File created - Tuesday-June-22-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ORDERS
--------------------------------------------------------

  CREATE TABLE "JADMIN"."ORDERS" 
   (	"O_ID" NUMBER(6,0), 
	"O_NAME" VARCHAR2(200 BYTE), 
	"O_DOC_PREC" VARCHAR2(200 BYTE), 
	"O_ADDRESS" VARCHAR2(400 BYTE), 
	"O_ITEMS" VARCHAR2(800 BYTE), 
	"O_AGE" NUMBER, 
	"GRAND_TOTAL" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into JADMIN.ORDERS
SET DEFINE OFF;
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (8132,'fsdasddsafsdavsadfdsa',null,null,'101	Paracetomal			8	400.0
104	Zandubam			6	300.0
',null,5999);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (7993,'fsdasddsafsdavsadfdsa',null,null,'101	Paracetomal			12	600.0
104	Zandubam			12	600.0
',null,5999);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (3761,'fsdasddsafsdavsadfdsa',null,null,'101	Paracetomal			5	250.0
104	Zandubam			2	100.0
',null,5999);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (6172,'fsdasddsafsdavsadfdsa',null,null,'101	Paracetomal			44	2200.0
',null,5999);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (4240,'fsdasddsafsdavsadfdsa',null,null,'101	Paracetomal			43	2150.0
',null,5999);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (3467,'dddd',null,null,'104	Zandubam			3	150.0
',null,5999);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (2303,null,null,null,'104	Zandubam			2	100.0
',null,5999);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (9790,'eerr','rrttt',null,'104	Zandubam			2	100.0
',null,5999);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (2548,null,null,null,'104	Zandubam			2	100.0
',null,5999);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (3844,'wwer','eerrt','ertt','104	Zandubam			6	300.0
',3,5999);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (1372,'Amit','AmitDr','AmitAdd','101	Paracetomal			100	5000.0
',30,5999);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (463,'Amit Gupta','Amit Docter Gupta','Char Impli Bhopal','101	Paracetomal		7	350.0
104	Zandubam		7	350.0
',44,0);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (5712,null,null,null,'104	Zandubam		8	400.0
',null,0);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (4466,'fioj','Ansari','Navin Nagar Bhopal','104	Zandubam		4	200.0
',30,0);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (26,'rishab','dharmendra','raipur','101	Paracetomal		5	250.0
',35,0);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (4863,null,null,null,null,null,0);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (8800,null,null,null,null,null,0);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (6698,'dharmendra','dddha','rachi',null,45,0);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (9649,'dharmendra','dharmendra','rachi',null,35,0);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (4378,'dhar','dharma','karma',null,34,0);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (2480,'dharam','karman','bhopal',null,45,0);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (7197,null,null,null,'101	Paracetomal		90	180000.0
',null,0);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (1879,'Amit','Dr Amit','4 Imli','101	Paracetomal		44	88000.0
103	null		44	88176.0
',34,0);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (4186,'Amit','Dr Amit','$ imple','101	Paracetomal		88	176000.0
104	Zandubam		90	180000.0
',54,356000);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (1495,'amit','amit','4 impli','101	Paracetomal		90	180000.0
104	Zandubam		990	1980000.0
103	null		80	160320.0
',45,2320320);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (4499,'dharmendra','Sujata','bhopal','104	Zandubam		4	8000.0
101	Paracetomal		45	90000.0
',40,98000);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (6073,'rehan','Ravin','Mohali','104	Zandubam		4	8000.0
',35,8000);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (4401,'Rohit','Rakesh Asthana','Daman','101	Paracetomal		5	25000.0
104	Zandubam		6	12000.0
',34,37000);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (5048,'sandeep','sandeep','bhopal','101	Paracetomal		4	20000.0
',30,20000);
Insert into JADMIN.ORDERS (O_ID,O_NAME,O_DOC_PREC,O_ADDRESS,O_ITEMS,O_AGE,GRAND_TOTAL) values (1014,'archana','danut','umeria','101	Paracetomal		3	15000.0
104	Zandubam		3	6000.0
',23,21000);

create database techsol;

CREATE TABLE `techsol`.`claim_diagnosis` (
  `provclaimno` VARCHAR(16) NOT NULL,
  `diagnosiscode` VARCHAR(30) NOT NULL,
  `diagnosisdesc` VARCHAR(256) NULL,
  PRIMARY KEY (`provclaimno`, `diagnosiscode`),
  UNIQUE INDEX `provclaimno_UNIQUE` (`provclaimno`,`diagnosiscode`));

  
CREATE TABLE `claim_illness` (
  `provclaimno` varchar(16) NOT NULL,
  `illnesstype` varchar(30) NOT NULL,
  PRIMARY KEY  (`provclaimno`,`illnesstype`),
  UNIQUE KEY `provclaimno_UNIQUE` (`provclaimno`,`illnesstype`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `techsol`.`geninfo`
(
  providerid              VARCHAR(20) primary key,
  PAYERID                 VARCHAR(20),
  TPAID                   VARCHAR(30),
  PROVCLAIMNO             VARCHAR(16)     NOT NULL,
  MEMBERID                VARCHAR(30),
  POLICYNO                VARCHAR(20),
  PLANTYPE                VARCHAR(40),
  FULLNAME                VARCHAR(100),
  FIRSTNAME               VARCHAR(30),
  MIDDLENAME              VARCHAR(30),
  LASTNAME                VARCHAR(30),
  PATFILENO               VARCHAR(30)     NOT NULL,
  ACCCODE                 VARCHAR(200),
  MEMBERDOB               DATE,
  MEMBERAGE               int(3),
  UNITAGE                 VARCHAR(20),
  GENDER                  VARCHAR(20),
  NATIONALITY             VARCHAR(120),
  PHYID                   VARCHAR(30)     NOT NULL,
  PHYNAME                 VARCHAR(60),
  PHYCATEGORY             VARCHAR(60),
  DEPTCODE                VARCHAR(60),
  VISITTYPE               VARCHAR(20),
  CLAIMDATE               DATE                  NOT NULL,
  CLAIMTYPE               VARCHAR(20),
  MAINCLAIMREFNO          VARCHAR(30),
  ELIGREFNO               VARCHAR(20),
  APPREFNO                VARCHAR(20),
  ADMISSIONDATE           DATE,
  ADMISSIONTIME           DATE,
  DISCHARGEDATE           DATE,
  DISCHARGETIME           DATE,
  LENGTHOFSTAY            int(10),
  UNITOFSTAY              VARCHAR(15),
  ROOMNO                  VARCHAR(15),
  BEDNO                   VARCHAR(10),
  MAINSYMPTOM             VARCHAR(1000),
  SIGNIFICANTSIGN         VARCHAR(200),
  OTHERCOND               VARCHAR(1000),
  DURATIONOFILLNESS       int(10),
  UNITOFDURATION          VARCHAR(20),
  TEMPERATURE             decimal(4,1),
  BLOODPRESSURE           VARCHAR(10),
  PULSE                   INT,
  RESPIRATORYRATE         INT,
  WEIGH                   INT,
  LASTMENSTRUATIONPERIOD  DATE,
  TOTCLAIMGRSAMT          decimal(14,2),
  TOTCLAIMDISC            decimal(14,2),
  TOTCLAIMPATSHARE        decimal(14,2),
  TOTCLAIMNETAMT          decimal(14,2),
  RADIOREPORT             LONGTEXT ,
  COMMREPORT              LONGTEXT ,
  EXTRACTION_DATE         DATE
);

CREATE TABLE `techsol`.`invoices`
(
  INVOICENO       VARCHAR(20) primary key,
  PROVCLAIMNO     VARCHAR(16),
  INVOICEDATE     DATE,
  INVOICEDEPT     VARCHAR(20),
  TOTINVGRSAMT    decimal(14,2),
  TOTINVDISC      decimal(14,2),
  TOTINVPATSHARE  decimal(14,2),
  TOTINVNETAMT    decimal(14,2)
);

CREATE TABLE `techsol`.`lab_component`
(
  LABTESTCODE       VARCHAR(15)           NOT NULL,
  PROVCLAIMNO       VARCHAR(16)           NOT NULL,
  SERIAL            INT                     NOT NULL,
  LABCOMPCODE       VARCHAR(15)           NOT NULL,
  LABCOMPDESC       VARCHAR(256),
  LABRESULT         VARCHAR(15),
  LABRESULTUNIT     VARCHAR(15),
  LABRESULTCOMMENT  VARCHAR(128)
);

alter table `techsol`.`lab_component`
add constraint `lab_component_pk`
  PRIMARY KEY
 (LABTESTCODE, PROVCLAIMNO, SERIAL, LABCOMPCODE);

 CREATE TABLE `techsol`.`lab_result`
(
  PROVCLAIMNO  VARCHAR(16)                NOT NULL,
  LABTESTCODE  VARCHAR(15)                NOT NULL,
  SERIAL       INT                          NOT NULL,
  LABTESTDATE  DATE                             NOT NULL,
  LABDESC      VARCHAR(255)
);

ALTER TABLE `techsol`.`lab_result` 
ADD PRIMARY KEY (`PROVCLAIMNO`, `LABTESTCODE`, `SERIAL`),
ADD UNIQUE INDEX `PROVCLAIMNO_UNIQUE` (`PROVCLAIMNO`,`LABTESTCODE`,`SERIAL`);


CREATE TABLE `techsol`.`OPTICAL_DIAGNOSIS`
(
  PROVCLAIMNO         VARCHAR(16)  primary key,
  RIGHTEYESPHEREDIST  VARCHAR(7),
  RIGHTEYECYLDIST     VARCHAR(7),
  RIGHTEYESPHERENEAR  VARCHAR(7),
  RIGHTEYECYLNEAR     VARCHAR(7),
  LEFTEYESPHEREDIST   VARCHAR(7),
  LEFTEYECYLDIST      VARCHAR(7),
  LEFTEYESPHERENEAR   VARCHAR(7),
  LEFTEYECYLNEAR      VARCHAR(7)
);

CREATE TABLE `techsol`.`REGLENSSPEC`
(
  SERVICETYPE        VARCHAR(20)          NOT NULL,
  INVOICENO          VARCHAR(20)          NOT NULL,
  REGLENSESSPECCODE  VARCHAR(35)          NOT NULL
);

ALTER TABLE `techsol`.`reglensspec` 
ADD PRIMARY KEY (`SERVICETYPE`, `INVOICENO`, `REGLENSESSPECCODE`),
ADD UNIQUE INDEX `SERVICETYPE_UNIQUE` (`SERVICETYPE`,`INVOICENO`,`REGLENSESSPECCODE`);

CREATE TABLE `techsol`.`SERVICE_DETAILS`
(
  INVOICENO           VARCHAR(20)         NOT NULL,
  SERVICECODE         VARCHAR(20)         NOT NULL,
  SERVICEDATE         DATE,
  SERVICEDESC         VARCHAR(80),
  UNITSERVICEPRICE    decimal(14,2),
  UNITSERVICETYPE     VARCHAR(40),
  QTY                 int(10),
  TOOTHNO             VARCHAR(10),
  TOTSERVICEGRSAMT    decimal(14,2),
  TOTSERVICEDISC      decimal(14,2),
  TOTSERVICEPATSHARE  decimal(14,2),
  TOTSERVICENETAMT    decimal(14,2)
);

CREATE TABLE `techsol`.`SERVICE_OPTICAL`
(
  INVOICENO       VARCHAR(20)             NOT NULL,
  SERVICETYPE     VARCHAR(20)             NOT NULL,
  LENSESTYPE      VARCHAR(25)             NOT NULL,
  SERVICEDATE     DATE                    NOT NULL,
  REGLENSESTYPE   VARCHAR(20),
  CONLENSESTYPE   VARCHAR(20),
  NOOFPAIRS       int(2),
  LENSESGRSAMT    decimal(14,2),
  LENSESDISC      decimal(14,2),
  LENSESPATSHARE  decimal(14,2),
  LENSESNETAMT    decimal(14,2),
  FRAMEGRSAMT     decimal(14,2),
  FRAMEDISC       decimal(14,2),
  FRAMEPATSHARE   decimal(14,2),
  FRAMENETAMT     decimal(14,2)
);

ALTER TABLE `techsol`.`service_optical` 
ADD PRIMARY KEY (`INVOICENO`, `SERVICETYPE`);

CREATE TABLE `techsol`.`users` (
  `username` varchar(20) PRIMARY KEY,
  `password` varchar(50) NOT NULL	
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

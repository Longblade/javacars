CREATE TABLE TYPE_OF_ENGINE(
ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
NAME VARCHAR(20) NOT NULL
);

CREATE TABLE COUNTRY(
ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
NAME VARCHAR(50) NOT NULL
);

CREATE TABLE KLASSE(
ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
NAME VARCHAR(20) NOT NULL
);

CREATE TABLE CARBODY(
ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
NAME VARCHAR(50) NOT NULL
);

CREATE TABLE VEHICLE(
ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
NAME VARCHAR(100) NOT NULL,
YEAR VARCHAR(8),
STR BIGINT,
PRICE FLOAT,
TYPE_ID BIGINT NOT NULL,
COUNTRY_ID BIGINT NOT NULL,
KLASSE_ID BIGINT NOT NULL,
CARBODY_ID BIGINT NOT NULL,
FOREIGN KEY (TYPE_ID) REFERENCES TYPE_OF_ENGINE(ID),
FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRY(ID),
FOREIGN KEY (KLASSE_ID) REFERENCES KLASSE(ID),
FOREIGN KEY (CARBODY_ID) REFERENCES CARBODY(ID)
);

CREATE TABLE USERS(
ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
PASSWORD VARCHAR(100) NOT NULL,
USERNAME VARCHAR(100) NOT NULL
);

CREATE TABLE ROLES(
ID BIGINT IDENTITY NOT NULL PRIMARY KEY,
ROLE VARCHAR(20) NOT NULL
);

CREATE TABLE USER_ROLE(
USER_ID BIGINT NOT NULL,
ROLE_ID BIGINT NOT NULL,
FOREIGN KEY (USER_ID) REFERENCES USERS(ID),
FOREIGN KEY (ROLE_ID) REFERENCES ROLES(ID)
);
INSERT INTO TYPE_OF_ENGINE (ID, NAME)
	VALUES
		(1, 'Бензиновый'),
		(2, 'Дизельный'),
		(3, 'Гибридный');

INSERT INTO COUNTRY (ID, NAME)
	VALUES
		(1, 'Япония'),
		(2, 'Германия'),
		(3, 'Италия'),
		(4, 'Россия');

INSERT INTO KLASSE (ID, NAME)
	VALUES
		(1, 'B'),
		(2, 'C'),
		(3, 'D'),
		(4, 'E'),
		(5, 'F'),
		(6, 'S'),
		(7, '...');

INSERT INTO CARBODY (ID, NAME)
	VALUES
		(1, 'Хэтчбек'),
		(2, 'Седан'),
		(3, 'Универсал'),
		(4, 'Кабриолет'),
		(5, 'Спорткар');

INSERT INTO VEHICLE (ID, NAME, YEAR, STR, PRICE, TYPE_ID, COUNTRY_ID, KLASSE_ID, CARBODY_ID)
	VALUES
		(1, 'AUDI R8 V10 plus Spyder', '2017', 610, 170000, 1, 2, 6, 5),
		(2, 'Lamborghini Huracan Perfomante', '2017', 640, 275000, 1, 3, 6, 5),
		(3, 'BMW M550d xDrive', '2017', 400, 100000, 2, 2, 6, 3),
		(4, 'Infiniti Q50S', '2017', 406, 55000, 1, 1, 5, 2),
		(5, 'ВАЗ 2106', '1976', 80, 1000, 1, 4, 7, 2);

INSERT INTO ROLES(ID, ROLE)
   VALUES
   (1, 'ADMIN'),
   (2, 'USER');

INSERT INTO USERS(ID, USERNAME, PASSWORD)
   VALUES
   (1, 'max', '$2a$11$EivRRQnfpE9gL9GoQ9ix.OLbivNbMXJFiNpSZ55nl7jaEa3lwmJ.S'), --123
   (2, 'danbka', '$2a$11$B7Vvk/Y/u5MuVlPsBrN3z.XId5Wc2fyUwk3qch3tB1BYyteaE51fS'); --0000


INSERT INTO USER_ROLE(USER_ID, ROLE_ID)
   VALUES
   (1, 1),
   (2, 2);
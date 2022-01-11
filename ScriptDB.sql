/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  09/01/2022 16:58:01                      */
/*==============================================================*/


/*==============================================================*/
/* Table : ADHERENT                                             */
/*==============================================================*/
CREATE TABLE ADHERENT
(
 ID_ADHERENT INT NOT NULL AUTO_INCREMENT,
 CNEADHR VARCHAR(25),
 NOMADHR VARCHAR(25),
 PRENOMADHR VARCHAR(25),
 DATENAISSADHR DATE,
 EMAILADHR VARCHAR(25),
 TELADHR VARCHAR(25),
 SEXEADHR BOOL,
 IMAGEADHR LONGBLOB, PRIMARY KEY (ID_ADHERENT)
);

/*==============================================================*/
/* Table : AUTEUR                                               */
/*==============================================================*/
CREATE TABLE AUTEUR
(
 ID_AUTEUR INT NOT NULL AUTO_INCREMENT,
 NOMAUT VARCHAR(25),
 PRENOMAUT VARCHAR(25),
 DATENAISSAUT DATE,
 NATIONALITEAUT VARCHAR(25), PRIMARY KEY (ID_AUTEUR)
);

/*==============================================================*/
/* Table : THEME                                                */
/*==============================================================*/
CREATE TABLE THEME
(
 ID_THEME INT NOT NULL AUTO_INCREMENT,
 LIBELLETH VARCHAR(25), PRIMARY KEY (ID_THEME)
);

/*==============================================================*/
/* Table : LIVRE                                                */
/*==============================================================*/
CREATE TABLE LIVRE
(
 ID_LIVRE INT NOT NULL AUTO_INCREMENT,
 ID_THEME INT NOT NULL,
 ISBNLV VARCHAR(25) UNIQUE,
 TITRELV VARCHAR(25),
 LANGUELV VARCHAR(25),
 ANNEELV INT,
 NBR_PAGESLV INT,
 NBR_EXEMPLV INT,
 PRIXLV DECIMAL,
 DATE_ACHATLV DATE,
 DESCLV TEXT,
 IMAGELV LONGBLOB, PRIMARY KEY (ID_LIVRE), CONSTRAINT FK_APPARTIENTER FOREIGN KEY (ID_THEME) REFERENCES THEME (ID_THEME) ON
DELETE RESTRICT ON
UPDATE RESTRICT
);

/*==============================================================*/
/* Table : ECRIRE                                               */
/*==============================================================*/
CREATE TABLE ECRIRE
(
 ID_LIVRE INT NOT NULL,
 ID_AUTEUR INT NOT NULL, PRIMARY KEY (ID_LIVRE, ID_AUTEUR), CONSTRAINT FK_ECRIRE2 FOREIGN KEY (ID_LIVRE) REFERENCES LIVRE (ID_LIVRE) ON
DELETE RESTRICT ON
UPDATE RESTRICT, CONSTRAINT FK_ECRIRE FOREIGN KEY (ID_AUTEUR) REFERENCES AUTEUR (ID_AUTEUR) ON
DELETE RESTRICT ON
UPDATE RESTRICT
);

/*==============================================================*/
/* Table : EMPRUNT                                              */
/*==============================================================*/
CREATE TABLE EMPRUNT
(
 ID_EMPRUNT INT NOT NULL AUTO_INCREMENT,
 ID_LIVRE INT NOT NULL,
 ID_ADHERENT INT NOT NULL,
 DATEDEBUTEMP DATE,
 DATEFINEMP DATE,
 STATUTSEMP VARCHAR(25),
 OBSERVEMP TEXT, PRIMARY KEY (ID_EMPRUNT), CONSTRAINT FK_ETRE FOREIGN KEY (ID_LIVRE) REFERENCES LIVRE (ID_LIVRE) ON
DELETE RESTRICT ON
UPDATE RESTRICT, CONSTRAINT FK_EFFECTUER FOREIGN KEY (ID_ADHERENT) REFERENCES ADHERENT (ID_ADHERENT) ON
DELETE RESTRICT ON
UPDATE RESTRICT
);

/*==============================================================*/
/* Table : USER                                                 */
/*==============================================================*/
CREATE TABLE USER
(
 ID_USER INT NOT NULL AUTO_INCREMENT,
 NAMEUS VARCHAR(25),
 PASSUS VARCHAR(25), PRIMARY KEY (ID_USER)
);


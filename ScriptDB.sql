/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  09/01/2022 16:58:01                      */
/*==============================================================*/


/*==============================================================*/
/* Table : ADHERENT                                             */
/*==============================================================*/
create table ADHERENT
(
   ID_ADHERENT          int not NULL AUTO_INCREMENT,
   CNEADHR              varchar(25),
   NOMADHR              varchar(25),
   PRENOMADHR           varchar(25),
   DATENAISSADHR        date,
   EMAILADHR            varchar(25),
   TELADHR              varchar(25),
   SEXEADHR             bool,
   IMAGEADHR            longblob,
   primary key (ID_ADHERENT)
);

/*==============================================================*/
/* Table : AUTEUR                                               */
/*==============================================================*/
create table AUTEUR
(
   ID_AUTEUR            int not NULL AUTO_INCREMENT,
   NOMAUT               varchar(25),
   PRENOMAUT            varchar(25),
   DATENAISSAUT         DATE,
   NATIONALITEAUT       varchar(25),
   primary key (ID_AUTEUR)
);

/*==============================================================*/
/* Table : THEME                                                */
/*==============================================================*/
create table THEME
(
   ID_THEME             int not NULL AUTO_INCREMENT,
   LIBELLETH            varchar(25),
   primary key (ID_THEME)
);

/*==============================================================*/
/* Table : LIVRE                                                */
/*==============================================================*/
create table LIVRE
(
   ID_LIVRE             int not NULL AUTO_INCREMENT,
   ID_THEME             int not null,
   ISBNLV               varchar(25),
   TITRELV              varchar(25),
   LANGUELV             varchar(25),
   ANNEELV              date,
   NBR_PAGESLV          int,
   NBR_EXEMPLV          int,
   PRIXLV               decimal,
   DATE_ACHATLV         date,
   DESCLV               text,
   IMAGELV              longblob,
   primary key (ID_LIVRE),
   constraint FK_APPARTIENTER foreign key (ID_THEME)
      references THEME (ID_THEME) on delete restrict on update restrict
);

/*==============================================================*/
/* Table : ECRIRE                                               */
/*==============================================================*/
create table ECRIRE
(
   ID_LIVRE             int not null,
   ID_AUTEUR            int not null,
   primary key (ID_LIVRE, ID_AUTEUR),
   constraint FK_ECRIRE2 foreign key (ID_LIVRE)
      references LIVRE (ID_LIVRE) on delete restrict on update restrict,
   constraint FK_ECRIRE foreign key (ID_AUTEUR)
      references AUTEUR (ID_AUTEUR) on delete restrict on update restrict
);

/*==============================================================*/
/* Table : EMPRUNT                                              */
/*==============================================================*/
create table EMPRUNT
(
   ID_EMPRUNT           int not NULL AUTO_INCREMENT,
   ID_LIVRE             int not null,
   ID_ADHERENT          int not null,
   DATEDEBUTEMP         date,
   DATEFINEMP           date,
   STATUTSEMP           varchar(25),
   OBSERVEMP            text,
   primary key (ID_EMPRUNT),
   constraint FK_ETRE foreign key (ID_LIVRE)
      references LIVRE (ID_LIVRE) on delete restrict on update restrict,
   constraint FK_EFFECTUER foreign key (ID_ADHERENT)
      references ADHERENT (ID_ADHERENT) on delete restrict on update restrict
);

/*==============================================================*/
/* Table : USER                                                 */
/*==============================================================*/
create table USER
(
   ID_USER              int not null AUTO_INCREMENT,
   NAMEUS               varchar(25),
   PASSUS               varchar(25),
   primary key (ID_USER)
);


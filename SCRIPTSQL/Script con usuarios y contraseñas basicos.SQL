CREATE DATABASE  IF NOT EXISTS `grupo-02-bdd-oo2-2022` ;
USE `grupo-02-bdd-oo2-2022`;

INSERT INTO `persona` VALUES (1, 'Leclerc',12345678,'Charles','dni'),(2,'Sainz',23456789,'Carlos','dni');



INSERT INTO `role` VALUES (1,'ROLE_ADMIN', 1,'ADMIN'),(2,'ROLE_AUDITOR',1,'AUDITOR');


INSERT INTO `user` VALUES ('charles@gmail.com',1,'$2a$10$lpeTNBUGJfHxsJNOkAF5IuS5eLZUOuL8vlHMd/9O0rL5Cb3rp.uk6', 'admin',1,1);
INSERT INTO `user` VALUES ('carlos@gmail.com',1,'$2a$10$B9mfALrCwl7gNgksyajanuqhq2GpRAfcfTPN9iXrAAGN6BKB73hUy', 'auditor',2,2);

INSERT INTO `edificio` VALUES(1,'Hernandez');
INSERT INTO `edificio` VALUES(2,'Marechal');
INSERT INTO `edificio` VALUES(3,'Ugarte');
INSERT INTO `edificio` VALUES(4,'Ortiz');

INSERT INTO `aula` VALUES(1,1,1);
INSERT INTO `aula` VALUES(2,2,1);
INSERT INTO `aula` VALUES(3,3,1);
INSERT INTO `aula` VALUES(4,4,1);
INSERT INTO `aula` VALUES(5,1,2);
INSERT INTO `aula` VALUES(6,2,2);
INSERT INTO `aula` VALUES(7,3,2);
INSERT INTO `aula` VALUES(8,4,2);
INSERT INTO `aula` VALUES(9,1,3);
INSERT INTO `aula` VALUES(10,2,3);
INSERT INTO `aula` VALUES(11,3,3);
INSERT INTO `aula` VALUES(12,4,3);

INSERT INTO `laboratorio` VALUES(60,80,1);
INSERT INTO `laboratorio` VALUES(65,80,2);
INSERT INTO `laboratorio` VALUES(30,60,3);
INSERT INTO `tradicional` VALUES(60,1,1,4);
INSERT INTO `tradicional` VALUES(55,2,0,5);
INSERT INTO `tradicional` VALUES(70,1,1,6);
INSERT INTO `laboratorio` VALUES(43,60,7);
INSERT INTO `laboratorio` VALUES(20,48,8);
INSERT INTO `laboratorio` VALUES(55,65,9);
INSERT INTO `tradicional` VALUES(80,1,1,10);
INSERT INTO `tradicional` VALUES(32,2,0,11);
INSERT INTO `tradicional` VALUES(45,1,1,12);
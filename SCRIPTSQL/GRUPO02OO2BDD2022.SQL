use `Grupo-02-BDD-OO2-2022`;

INSERT INTO `persona` VALUES (1, 'Perez',12345678,'Sergio','dni'),(2,'Sainz',23456789,'Carlos','dni');



INSERT INTO `role` VALUES (1,'ROLE_ADMIN', 1,'ADMIN'),(2,'ROLE_AUDITOR',1,'AUDITOR');



INSERT INTO `user` VALUES ('prueba@gmail.com',1,'$2a$10$lpeTNBUGJfHxsJNOkAF5IuS5eLZUOuL8vlHMd/9O0rL5Cb3rp.uk6', 'sergio',1,1);
INSERT INTO `user` VALUES ('carlos@gmail.com',1,'$2a$10$B9mfALrCwl7gNgksyajanuqhq2GpRAfcfTPN9iXrAAGN6BKB73hUy', 'carlos',2,2);

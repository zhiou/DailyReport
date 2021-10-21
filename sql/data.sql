
BEGIN;
INSERT INTO `department` VALUES (1, 0, NULL, '研发体系', 0);
INSERT INTO `department` VALUES (2, 0, 1, '研发X部', 0);
COMMIT;

BEGIN;
INSERT INTO `user` VALUES (1, 'ES0092', '周煌', 0, 2, 0);
COMMIT;

BEGIN;
INSERT INTO `role` VALUES (1, 'admin', 0);
INSERT INTO `role` VALUES (2, 'pmo', 0);
INSERT INTO `role` VALUES (3, 'manager', 0);
INSERT INTO `role` VALUES (4, 'staff', 0);
COMMIT;

BEGIN;
INSERT INTO `user_role` VALUES (1, 1, 1, 0);
COMMIT;
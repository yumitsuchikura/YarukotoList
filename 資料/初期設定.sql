MySQL Client (MariaDB 10.4 (x64))���N������B

Password: root

/* yarukoto�f�[�^�x�[�X�̍쐬 */
CREATE DATABASE yarukoto DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

/* MariaDB�̃f�[�^�x�[�X�ꗗ���m�F */
SHOW DATABASES;

/* ���[�U�uyarukoto�v���쐬�A�z�X�g�͑S�z�X�g�ΏہA�p�X���[�h�́uyarukoto�v */
CREATE USER 'yarukoto'@'%' identified by 'yarukoto';

/* MariaDB�̃��[�U�ƃz�X�g�̑Ή��\���m�F */
SELECT USER, HOST FROM mysql.user;

/* �f�[�^�x�[�X�uyarukoto�v�ɑ΂��ă��[�U�uyarukoto�v���p�X���[�h�uyarukoto�v�ŃA�N�Z�X�ł��錠����t�^ */
GRANT ALL PRIVILEGES ON yarukoto.* TO 'yarukoto'@'%' IDENTIFIED BY 'yarukoto';
FLUSH PRIVILEGES;

/* yarukoto�f�[�^�x�[�X��I�� */
USE yarukoto;

/* ��邱�ƃe�[�u���̍쐬 */
CREATE TABLE t_yarukoto(
    id INT(255) AUTO_INCREMENT NOT NULL,
    regist_date DATETIME,
    task VARCHAR(256) NOT NULL,
    task_type VARCHAR(256),
    deadline DATETIME,
    status INT(1),
    memo VARCHAR(256),
    delete_flg INT(1) NOT NULL default 0,
    PRIMARY KEY (id)
);

/* �e�[�u���ꗗ��\�� */
SHOW TABLES;

/* �e�e�[�u���̍\�����m�F */
DESC t_yarukoto;

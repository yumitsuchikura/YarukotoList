MySQL Client (MariaDB 10.4 (x64))を起動する。

Password: root

/* yarukotoデータベースの作成 */
CREATE DATABASE yarukoto DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

/* MariaDBのデータベース一覧を確認 */
SHOW DATABASES;

/* ユーザ「yarukoto」を作成、ホストは全ホスト対象、パスワードは「yarukoto」 */
CREATE USER 'yarukoto'@'%' identified by 'yarukoto';

/* MariaDBのユーザとホストの対応表を確認 */
SELECT USER, HOST FROM mysql.user;

/* データベース「yarukoto」に対してユーザ「yarukoto」がパスワード「yarukoto」でアクセスできる権限を付与 */
GRANT ALL PRIVILEGES ON yarukoto.* TO 'yarukoto'@'%' IDENTIFIED BY 'yarukoto';
FLUSH PRIVILEGES;

/* yarukotoデータベースを選択 */
USE yarukoto;

/* やることテーブルの作成 */
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

/* テーブル一覧を表示 */
SHOW TABLES;

/* 各テーブルの構成を確認 */
DESC t_yarukoto;

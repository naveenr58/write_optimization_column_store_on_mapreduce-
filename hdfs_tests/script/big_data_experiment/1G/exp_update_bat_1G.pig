bat0 = LOAD '/user/nthumma/data/1gb/bat_0.1.txt'  USING PigStorage(',') AS (oid:INT, val:INT);
update01 = LOAD '/user/nthumma/data/1gb/update_0.1.txt' USING PigStorage(',') AS (oid:INT, val:INT);


tmp1 = JOIN bat0 BY oid LEFT OUTER, update01 BY oid;
bat_updated = FOREACH tmp1 GENERATE $0, ($2 IS NULL ? $1 : $3);
STORE bat_updated INTO '/user/nthumma/data/1gb/bat_updated';

fs -rm -r -f /user/nthumma/data/1gb/bat_updated;





fs -rm -r -f /user/nthumma/data/20gb/tbat_updated;
tbat0 = LOAD '/user/nthumma/data/20gb/tbat_0.1.txt'  USING PigStorage(',') AS (oid:INT, val:INT);
update01 = LOAD '/user/nthumma/data/20gb/update_0.1.txt' USING PigStorage(',') AS (oid:INT, val:INT);

tbat_updated = UNION tbat0, update01;
STORE tbat_updated INTO '/user/nthumma/data/20gb/tbat_updated';







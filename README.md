進捗状況


## 駅情報API



https://ekidata.jp/api/api_line.php


## 増幅用SQL

insert into worker
select
    id + (select max(id) from worker),
    first_name,
    last_name
from worker
    where id < (select max(id) from worker)
;
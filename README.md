進捗状況


## REST APIについて
https://tarutaru-blogs.com/springboot-rest-api-tutorial/

## HTTPリクエストの基本
https://progtext.net/tech/http-methods/#i-2

## getter setterが必要なパターン不要なパターン
https://qiita.com/motoki1990/items/39102dfded1aadc54af1


## Post内容の持続
https://spring.pleiades.io/spring-framework/docs/5.2.x/javadoc-api/org/springframework/web/servlet/mvc/support/RedirectAttributes.html

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
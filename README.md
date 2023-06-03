
## URL集


http://localhost:8080/

h2databaseのコンソール画面　spring boot起動後に入れるようになります。
接続については、application.propertiesを見てください。
http://localhost:8080/h2-console

***

## 増幅用SQL

### とりあえずworkerにレコード追加

 worker (
   id, 
   first_name, 
   last_name, 
   dept, 
   team
 ) VALUES (
    '1',
    'pepepe',
    'pepepe',
    'HHB',
    'UUY'
 );



## すでにworkerをID重複せず、二倍にしていくクエリです。
 insert into 
 worker (
   id, 
   first_name, 
   last_name, 
   dept, 
   team
 ) 
    select id + (select max(id) from worker),
    'pepepe',
    'pepepe',
    'HHB',
    'UUY'
    from worker;



## htmlのdeleteとputについて
https://jxck.hatenablog.com/entry/why-form-dosent-support-put-delete

## DIとnewの違いについて
https://qiita.com/uqichi/items/5f59817beb3dff9c0c1e

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





insert into worker ( id, first_name, last_name, dept, team ) VALUES ( '1', 'piyo', 'pipupu', 'PPU', 'PPA' );
insert into worker ( id, first_name, last_name, dept, team ) VALUES ( '2', 'nape', 'napu', 'PPH', 'PPZ' );
insert into worker ( id, first_name, last_name, dept, team ) VALUES ( '3', 'mori', 'morimori', 'PPL', 'POP' );
insert into worker ( id, first_name, last_name, dept, team ) VALUES ( '4', 'uyu', 'Umiumi', 'ZZP', 'SDP' );


insert into worker ( id, first_name, last_name, dept, team ) select id + (select max(id) from worker), 'pepepe', 'pepepe', 'HHB', 'UUY' from worker;
insert into worker ( id, first_name, last_name, dept, team ) select id + (select max(id) from worker), 'pepepe', 'pepepe', 'HHB', 'UUY' from worker;
    

insert into fee ( id, round_trip, total_fee, use_date) VALUES ( '1', 'yes', '5423','2023-04-07' );
insert into fee ( id, round_trip, total_fee, use_date) VALUES ( '1', 'yes', '5234','2023-04-08' );
insert into fee ( id, round_trip, total_fee, use_date) VALUES ( '1', 'yes', '5647', '2023-04-09' );
insert into fee ( id, round_trip, total_fee, use_date) VALUES ( '1', 'yes', '86754', '2023-04-22' );


insert into fee ( id, round_trip, total_fee, use_date ) select id + (select max(id) from fee), 'yes', '77665', '2023-05-05' from fee;
insert into fee ( id, round_trip, total_fee, use_date ) select id + (select max(id) from fee), 'yes', '77665', '2023-05-05' from fee;
    
    
   
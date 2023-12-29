CREATE TABLE worker(
        id integer NOT NULL,
        first_name character varying(50),
        last_name character varying(50),
        dept character(3),
        team character(3),
        PRIMARY KEY(id)
    );
CREATE TABLE fee(
        id integer NOT NULL,
        fee_seq integer NOT null,
        round_trip character varying(5),
        total_fee integer,
        use_date date not null,
        PRIMARY KEY(id, fee_seq, use_date)
    );


CREATE TABLE report(
        id integer NOT NULL,
        atdate DATE NOT NULL,
        location character varying(50),
        workstart TIME,
        workend TIME,
        reststart TIME,
        restend TIME
    );

CREATE TABLE effort(
        id integer NOT NULL,
        atdate DATE NOT NULL,
        seq integer not NULL,
        projno character varying(6),
        workstart TIME,
        workend TIME
    );

CREATE TABLE project(
        projno character varying(6) NOT NULL,
        projectname character varying(50),
        customerid character varying(10)
    );

CREATE TABLE customer(
        customerid character varying(10),
        customername character varying(50)
    );



insert into worker ( id,  first_name, last_name, dept, team ) VALUES ( '1',  'piyo', 'pipupu', 'PPU', 'PPA' );
insert into worker ( id,  first_name, last_name, dept, team ) VALUES ( '2',  'nape', 'napu', 'PPH', 'PPZ' );
insert into worker ( id,  first_name, last_name, dept, team ) VALUES ( '3',  'mori', 'morimori', 'PPL', 'POP' );
insert into worker ( id,  first_name, last_name, dept, team ) VALUES ( '4',  'uyu', 'Umiumi', 'ZZP', 'SDP' );


insert into worker ( id,  first_name, last_name, dept, team ) select id + (select max(id) from worker), 'pepepe', 'pepepe', 'HHB', 'UUY' from worker;
insert into worker ( id,  first_name, last_name, dept, team ) select id + (select max(id) from worker), 'pepepe', 'pepepe', 'HHB', 'UUY' from worker;
    

insert into fee ( id,fee_seq , round_trip, total_fee, use_date) VALUES ( '1','1', 'yes', '5423','2023-04-07' );
insert into fee ( id,fee_seq , round_trip, total_fee, use_date) VALUES ( '1','1', 'yes', '5234','2023-04-08' );
insert into fee ( id,fee_seq , round_trip, total_fee, use_date) VALUES ( '1','1', 'yes', '5647', '2023-04-09' );
insert into fee ( id,fee_seq , round_trip, total_fee, use_date) VALUES ( '1','1', 'yes', '86754', '2023-04-22' );



    
   
CREATE TABLE
    if not exists fee(
        id integer NOT NULL,
        fee_seq integer NOT null,
        round_trip character varying(5),
        total_fee integer,
        use_date date not null,
        PRIMARY KEY(id, fee_seq, use_date)
    );

CREATE TABLE
    if not exists worker(
        id integer NOT NULL,
        fee_seq integer NOT NULL,
        first_name character varying(50),
        last_name character varying(50),
        dept character(3),
        team character(3),
        PRIMARY KEY(id)
    );

CREATE TABLE
    if not exists report(
        id integer NOT NULL,
        atdate DATE NOT NULL,
        location character varying(50),
        workstart TIME,
        workend TIME,
        reststart TIME,
        restend TIME
    );

CREATE TABLE
    if not exists effort(
        id integer NOT NULL,
        atdate DATE NOT NULL,
        seq integer not NULL,
        projno character varying(6),
        workstart TIME,
        workend TIME
    );

CREATE TABLE
    if not exists project(
        projno character varying(6) NOT NULL,
        projectname character varying(50),
        customerid character varying(10)
    );

CREATE TABLE
    if not exists customer(
        customerid character varying(10),
        customername character varying(50)
    );
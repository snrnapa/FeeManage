CREATE TABLE m_worker(
    id integer NOT NULL,
    first_name character varying(50),
    last_name character varying(50),
    dept_id integer NOT NULL,
    team_id integer NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE m_dept(
    id integer NOT NULL,
    dept_name character varying(50),
    PRIMARY KEY(id)
);

CREATE TABLE m_team(
    dept_id integer NOT NULL,
    seq integer NOT NULL,
    team_name character varying(50),
    PRIMARY KEY(dept_id, seq)
);

CREATE TABLE t_fee(
    id integer NOT NULL,
    fee_seq integer NOT null,
    round_trip character varying(5),
    fee integer,
    use_date date not null,
    PRIMARY KEY(id, fee_seq, use_date)
);

CREATE TABLE t_report(
    id integer NOT NULL,
    atdate DATE NOT NULL,
    work_location character varying(50),
    workstart TIME,
    workend TIME,
    reststart TIME,
    restend TIME
);

CREATE TABLE t_effort(
    id integer NOT NULL,
    atdate DATE NOT NULL,
    seq integer not NULL,
    projno character varying(6),
    workstart TIME,
    workend TIME
);

CREATE TABLE m_project(
    projno character varying(6) NOT NULL,
    projectname character varying(50),
    customerid character varying(10)
);

CREATE TABLE m_customer(
    customerid character varying(10),
    customername character varying(50)
);
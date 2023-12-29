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

-- m_dept初期データ
insert into
    m_dept (id, dept_name)
Values
    (1, 'PPX');

insert into
    m_dept (id, dept_name)
Values
    (2, 'CAX');

insert into
    m_dept (id, dept_name)
Values
    (3, 'VSX');

insert into
    m_dept (id, dept_name)
Values
    (4, 'TSX');

insert into
    m_dept (id, dept_name)
Values
    (5, 'RSX');

-- m_team初期データ
insert into
    m_team (dept_id, seq, team_name)
Values
    (1, 1, 'HUW');

insert into
    m_team (dept_id, seq, team_name)
Values
    (1, 2, 'PPW');

insert into
    m_team (dept_id, seq, team_name)
Values
    (2, 1, 'PPB');

insert into
    m_team (dept_id, seq, team_name)
Values
    (2, 2, 'LPB');

insert into
    m_team (dept_id, seq, team_name)
Values
    (3, 1, 'ACV');

insert into
    m_team (dept_id, seq, team_name)
Values
    (3, 2, 'ZCV');

insert into
    m_team (dept_id, seq, team_name)
Values
    (4, 1, 'XBV');

insert into
    m_team (dept_id, seq, team_name)
Values
    (4, 2, 'XMN');

insert into
    m_team (dept_id, seq, team_name)
Values
    (5, 1, 'ZXZ');

insert into
    m_team (dept_id, seq, team_name)
Values
    (5, 2, 'YZM');

-- m_worker初期データ
insert into
    m_worker(id, first_name, last_name, dept_id, team_id)
select
    i,
    format('ふぁーすとねーむ%s', i),
    format('らすとねーむ%s', i),
    round((random() * (1 - 5)) :: numeric, 0) + 5,
    round((random() * (1 - 2)) :: numeric, 0) + 2
from
    generate_series(1, 1000) as i;
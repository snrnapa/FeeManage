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
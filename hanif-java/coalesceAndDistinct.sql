



select coalesce(last_name,'sasimi')
from(select case when last_name = 'wulandari' then null else last_name end as last_name 
from biodata) as subquery; 

select coalesce(type ,'kombat')
from(select case when type = 'MAIL' then null else type end as type
from contact_person ) as subquery;

select distinct start_date from (select start_date,id from leave_request where  start_date > '2020-05-05') as subquery ;

select distinct first_name from (select first_name,id from biodata  where  dob > '1990-04-10') as subquery;

create or replace view item cost as
select tr.id as tr.id, e.nip as employee_code
concat(b.first_name, ‘ ‘, b.last_name) as full_name, sum(ts.item_cost) as sum_item_cost 
from travel_request tr
join travel_settlement ts on ts.travel_request_id = tr.id
join employee e on e.id = tr.employee_id
join biodata b on e.biodata_id = b.id
group by e.nip, full_name, tr.id;
select*from item_cost;

select
    t1_0.id,t1_0.assigned_to_id,t1_0.description,t1_0.generated_on,t1_0.last_updated,t1_0.raised_by_id,t1_0.state
from
    tickets t1_0
where
    t1_0.state<>'RESOLVED';
select
    c1_0.id,c1_0.address,c1_0.email,c1_0.name,c1_0.pincode
from clients c1_0
where
    c1_0.id = uuid_to_bin('059eb232-e197-44e7-a155-3f16b6ad6177');
select e1_0.id,e1_0.birth_date,e1_0.email,e1_0.hire_date,e1_0.name,e1_0.salary,e1_0.work_dept from employees e1_0 where e1_0.id=?;
select c1_0.id,c1_0.address,c1_0.email,c1_0.name,c1_0.pincode from clients c1_0 where c1_0.id=?;
select e1_0.id,e1_0.birth_date,e1_0.email,e1_0.hire_date,e1_0.name,e1_0.salary,e1_0.work_dept from employees e1_0 where e1_0.id=?;
select c1_0.id,c1_0.address,c1_0.email,c1_0.name,c1_0.pincode from clients c1_0 where c1_0.id=?;
select c1_0.id,c1_0.address,c1_0.email,c1_0.name,c1_0.pincode from clients c1_0 where c1_0.id=?;
select e1_0.id,e1_0.birth_date,e1_0.email,e1_0.hire_date,e1_0.name,e1_0.salary,e1_0.work_dept from employees e1_0 where e1_0.id=?;
select c1_0.id,c1_0.address,c1_0.email,c1_0.name,c1_0.pincode from clients c1_0 where c1_0.id=?;
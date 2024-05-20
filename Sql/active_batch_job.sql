create table if not exists active_batch_job(
batch_job_id Integer not null,
batch_job_name varchar(255) null,
batch_job_script varchar(255) null,
batch_job_start_time varchar(255) null,
batch_job_end_time varchar(255) null,
batch_job_owner varchar(255) null,
auto_run char null,
manual_run_indicator varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint active_batch_job_pk primary key(batch_job_id));
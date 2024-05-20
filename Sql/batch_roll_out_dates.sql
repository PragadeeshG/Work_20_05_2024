create table if not exists batch_roll_out_dates(
deploy_indicator Integer not null,
work_item_creation_date varchar(255) null,
no_oworks Integer null,
work_item_completion_date varchar(255) null,
sanity_test_start_date varchar(255) null,
sanity_test_completion_date varchar(255) null,
integration_test_start_date varchar(255) null,
integration_test_completion_date varchar(255) null,
user_verification_start_date varchar(255) null,
user_verification_completion_date varchar(255) null,
roll_out_date varchar(255) null,
day_zero_date varchar(255) null,
authorization_date varchar(255) null,
approval_date varchar(255) null,
status varchar(255) null,
constraint batch_roll_out_dates_pk primary key(deploy_indicator));
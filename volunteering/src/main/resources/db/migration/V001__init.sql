create schema if not exists volunteering;
create table volunteering.request (
    id bigserial,
    name text not null,
    description text,
    volunteer_uid text,
    requestor_uid text not null,
    status text
);
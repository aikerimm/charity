create schema if not exists feedback;
create table feedback.feedback (
    id bigserial,
    author_id bigint not null,
    author_type text not null,
    target_id bigint not null,
    target_type text not null,
    content text not null,
    rating text not null
);

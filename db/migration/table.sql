create table messages
(
    id   bigserial
        primary key,
    body varchar not null
);

alter table messages
    owner to example_user;


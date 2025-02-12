create table workout (
        id  bigserial not null,
        workout_type text not null,
        begin_time TIMESTAMP not null,
        end_time TIMESTAMP,
        user_id integer REFERENCES tracker_user (id),
        primary key (id)
)
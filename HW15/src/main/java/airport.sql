create database airport;

create table plane (
                       plane_model text not null,
                       serial_number text primary key,
                       number_of_seats int not null
);

create table pilots (
                        name text not null,
                        age int not null,
                        plane_model text not null
);

insert into plane (plane_model, serial_number, number_of_seats) values ('Boeing 747', 's1', 467),
                                                                       ('Airbus A320','s2', 186),
                                                                       ('Airbus A320', 's3', 186),
                                                                       ('Boeing 747', 's4', 467),
                                                                       ('Airbus A320', 's5', 186),
                                                                       ('Boeing 747', 's6', 467),
                                                                       ('Airbus A320', 's7', 186);

insert into pilots (name, age, plane_model) values ('Elena', 44, 'Boeing 747'),
                                                   ('Andrew', 34, 'Airbus A320'),
                                                   ('Ihor', 33, 'Boeing 747'),
                                                   ('Den', 36, 'Airbus A320'),
                                                   ('Mike', 37, 'Boeing 747'),
                                                   ('Ivan', 30, 'Airbus A320'),
                                                   ('Artur', 49, 'Airbus A320');
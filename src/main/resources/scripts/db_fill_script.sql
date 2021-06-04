INSERT INTO stations (name) VALUES ('Test Station 1');
INSERT INTO stations (name) VALUES ('Test Station 2');
INSERT INTO stations (name) VALUES ('Test Station 3');
INSERT INTO stations (name) VALUES ('Test Station 4');
INSERT INTO stations (name) VALUES ('Test Station 5');
INSERT INTO stations (name) VALUES ('Test Station 6');
INSERT INTO stations (name) VALUES ('Test Station 7');
INSERT INTO stations (name) VALUES ('Test Station 8');
INSERT INTO stations (name) VALUES ('Test Station 9');
INSERT INTO stations (name) VALUES ('Test Station 10');
INSERT INTO stations (name) VALUES ('Test Station 11');
INSERT INTO stations (name) VALUES ('Test Station 12');

INSERT INTO stop_points (station_id, arrival_time_in_minutes, dispatch_time_in_minutes, stop_duration_in_minutes) VALUES
(
    1,
    5,
    10,
    5
);

INSERT INTO stop_points (station_id, arrival_time_in_minutes, dispatch_time_in_minutes, stop_duration_in_minutes) VALUES
(
    2,
    15,
    20,
    5
);

INSERT INTO stop_points (station_id, arrival_time_in_minutes, dispatch_time_in_minutes, stop_duration_in_minutes) VALUES
(
    3,
    25,
    30,
    5
);

insert into routes (name, start_time, length_in_km, departure_point_id,
                    destination_point_id)
values (
           'Test Station 1 - Test Station 3',
           0,
           30.3,
           1,
           3
       );

INSERT INTO routes_with_stop_points (route_id, stop_point_id) VALUES (1, 1);
INSERT INTO routes_with_stop_points (route_id, stop_point_id) VALUES (1, 2);
INSERT INTO routes_with_stop_points (route_id, stop_point_id) VALUES (1, 3);

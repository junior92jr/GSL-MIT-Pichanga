/*cliente: nombre, apellido, correo, password, sexo, cumpleaños, posicion, puntuacion*/
/*canchas: id, nombre, ciudad, distrito, nro de jugadores, descripcion, foto(s), latitud, longitud*/
create table clients (
  cl_id int not null,
  cl_name varchar(10),
  cl_lastname varchar(30),
  cl_email varchar(50),
  cl_password varchar(30),
  cl_sex varchar(4),
  cl_birthday DATE,
  cl_position varchar(20),
  cl_score integer,
  primary key(cl_id)
 );
create table fields (
  fi_id int not null,
  fi_name varchar(50),
  fi_city varchar(20),
  fi_district varchar(20),
  fi_players integer,
  fi_description varchar(500),
  fi_photo_path varchar(50),
  fi_latitud float(2),
  fi_longitud float(2),
  primary key(fi_id)
 );

INSERT INTO clients VALUES (1,'pepe', 'trillo bananas', 'pepe.trillo@mail.com', '1234', 'M', '1990-07-13', 'delantero', 78);
INSERT INTO clients VALUES (2,'juan', 'bananero cardenas', 'juan.bananero@mail.com', '1234', 'M', '1992-07-15', 'arquero', 34);

INSERT INTO fields VALUES (1, 'futbol center', 'lima', 'miraflores', 14, 
'Cancha de futbol equipada para equipos de 7 jugadores, servicios de vestdores y cafeteria.', 
'home/myphotos/soccerfields/myfield.png', 23.45, 452.56);

INSERT INTO fields VALUES (2, 'deportivo pichanguita', 'lima', 'pueblo libre', 22, 
'Cancha de futbol equipada para equipos de 11 jugadores, servicios de vestdores, masajes y cafeteria para uso de los clientes.', 
'home/mymultimedia/soccerfields/mysoccerfield.png', 32.54, 254.65);

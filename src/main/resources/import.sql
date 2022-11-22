
INSERT INTO roles(nombre)VALUES ('Administrador');
INSERT INTO roles(nombre)VALUES ('Cliente');

INSERT INTO categorias(nombre_categoria) VALUES ('Cientifico');
INSERT INTO categorias(nombre_categoria) VALUES ('Literatura');
INSERT INTO categorias(nombre_categoria) VALUES ('Biografías');
INSERT INTO categorias(nombre_categoria) VALUES ('Comedia');
INSERT INTO categorias(nombre_categoria) VALUES ('Ficción');

INSERT INTO personas(nombre, apellido, cedula, direccion, telefono,correo,username, contrasena, id_rol)  VALUES ('Sebastian', 'Caicedo', 1014, 'Calle 26', 7333333, 'scaicedo@gmail.com','sebcai','abc',1);

INSERT INTO libros(nombre_libro, autor,fecha_publicacion, cantidad, disponibilidad)	VALUES ('Cien años de soledad','Gabriel Garcia Marquez', '05-06-1967', 50, 50);
INSERT INTO libros(nombre_libro, autor,fecha_publicacion, cantidad, disponibilidad)	VALUES ('El principto','Antoine de Saint-Exupéry', '06-04-1943', 50, 50);

INSERT INTO estados(nombre_estado)VALUES('Solicitar');
INSERT INTO estados(nombre_estado)VALUES('Reservar');
INSERT INTO estados(nombre_estado)VALUES('Devolver');

INSERT INTO solicitudes(id_libro, id_persona, fecha_prestamo,fecha_devolucion, id_estado)VALUES (1, 1,'11/21/2022', '11/26/2022', 1);
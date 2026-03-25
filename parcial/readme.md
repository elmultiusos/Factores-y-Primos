# Parcial
# Implementacion del Problema
Se inicio el proyecto con spring y se agregaron las dependencias para poder hacer peticiones HTTP GET

![alt text](image-5.png)

# Lanzamiento de la Instancia EC2
Se creo la instancia para subir posteriormente el codigo con el .jar que genera el proyecto maven

![alt text](image.png)
![alt text](image-7.png)

Se modificaron las reglas  

![alt text](image-1.png)

Luego entramos por ssh desde una terminal Git Bash y se instalo java para que pudiera correr el codigo previamente hecho

![alt text](image-2.png)
![alt text](image-3.png)

Ahora subimos el archivo .jar por medio de scp

![alt text](image-8.png)

Ya que lo tenemos en la maquina virtual de aws lo ejecutamos 

![alt text](image-9.png)

![alt text](image-10.png)

Dado que no tenemos un certificado firmado debemos de ingresar por http

### Juan Sebastian Buitrago Piñeros
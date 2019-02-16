# Proyecto refactorizado para poder incluir un unit test

La clase Servicio ha sido refactorizada para disponer de un método que puede ser probado de forma independiente de los otros servicios (autenticación, base de datos etc). 

La clase TestServicio realiza una sencilla prueba similar a los tests unitarios típicos pero sin usar ninguna producto de unit test específico.
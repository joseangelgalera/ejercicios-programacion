<%-- 
  Tema 12

  Ejercicio 2 

  Mejora el programa anterior de tal forma que la apariencia de la página web 
  que muestra el navegador luzca más bonita mediante la utilización de CSS 
  (utiliza siempre ficheros independientes para CSS para no mezclarlo con HTML).



 --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
  <head>
    <title>Aprende Java con Ejercicios - Solución Ejercicio 01 Tema 12</title>
    <meta http-equiv="Content-type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="Ejercicio02.css">
  </head>
  <body>
    <% out.print("<p><span>Nombre:</span> José Ángel Galera García</p>"); %>
    <% out.print("<p><span>Profesión Actual:</span> Estudiante</p>"); %>
  </body>
</html>